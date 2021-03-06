package com.xmkj.applibrary.util.TimePickerDialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.xmkj.applibrary.R;
import com.xmkj.applibrary.util.TimePickerDialog.config.PickerConfig;
import com.xmkj.applibrary.util.TimePickerDialog.data.Type;
import com.xmkj.applibrary.util.TimePickerDialog.data.WheelCalendar;
import com.xmkj.applibrary.util.TimePickerDialog.listener.OnDateSetListenerNew;
import com.xmkj.applibrary.util.TimePickerDialog.wheel.OnWheelScrollListener;
import com.xmkj.applibrary.util.TimePickerDialog.wheel.WheelView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jzxiang on 16/4/19.
 */
public class TimePickerExpect extends DialogFragment implements View.OnClickListener {
    PickerConfig mPickerConfig;
    private TimeWheel mTimeWheel;
    private long mCurrentMillSeconds;

    private static TimePickerExpect newIntance(PickerConfig pickerConfig) {
        TimePickerExpect timePickerDialog = new TimePickerExpect();
        timePickerDialog.initialize(pickerConfig);
        return timePickerDialog;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity activity = getActivity();
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    @Override
    public void onResume() {
        super.onResume();
        int height = getResources().getDimensionPixelSize(R.dimen.picker_height);

        Window window = getDialog().getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);//Here!
//        window.setGravity(Gravity.BOTTOM);
    }

    private void initialize(PickerConfig pickerConfig) {
        mPickerConfig = pickerConfig;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getActivity(), R.style.myDialogTheme);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(initView());
        return dialog;
    }

    View initView() {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View view = inflater.inflate(R.layout.dialog_select_time, null);
        TextView cancel = (TextView) view.findViewById(R.id.cancel);
        WheelView year = (WheelView) view.findViewById(R.id.year);
        WheelView month = (WheelView) view.findViewById(R.id.month);
        WheelView day = (WheelView) view.findViewById(R.id.day);
        year.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(WheelView wheel) {
            }
            @Override
            public void onScrollingFinished(WheelView wheel) {
                setTimeText();
            }
        });   month.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(WheelView wheel) {
            }
            @Override
            public void onScrollingFinished(WheelView wheel) {
                setTimeText();
            }
        });   day.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(WheelView wheel) {
            }
            @Override
            public void onScrollingFinished(WheelView wheel) {
                setTimeText();
            }
        });
        cancel.setOnClickListener(this);
        TextView sure = (TextView) view.findViewById(R.id.confirm);
        sure.setOnClickListener(this);
        TextView   title = (TextView) view.findViewById(R.id.title);
        title.setText(mPickerConfig.mTitleString);
        cancel.setText(mPickerConfig.mCancelString);
        sure.setText(mPickerConfig.mSureString);
//        toolbar.setBackgroundColor(mPickerConfig.mThemeColor);

        mTimeWheel = new TimeWheel(view, mPickerConfig);
        return view;
    }
    private void setTimeText() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, mTimeWheel.getCurrentYear());
        calendar.set(Calendar.MONTH, mTimeWheel.getCurrentMonth() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, mTimeWheel.getCurrentDay());
        calendar.set(Calendar.HOUR_OF_DAY, mTimeWheel.getCurrentHour());
        calendar.set(Calendar.MINUTE, mTimeWheel.getCurrentMinute());
        mCurrentMillSeconds = calendar.getTimeInMillis();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = new Date(mCurrentMillSeconds);
        String  date=sf.format(d);
    }
    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.cancel) {
            dismiss();
        } else if (i == R.id.confirm) {
            sureClicked();

        }
    }

    /*
    * @desc This method returns the current milliseconds. If current milliseconds is not set,
    *       this will return the system milliseconds.
    * @param none
    * @return long - the current milliseconds.
    */
    public long getCurrentMillSeconds() {
        if (mCurrentMillSeconds == 0)
            return System.currentTimeMillis();

        return mCurrentMillSeconds;
    }

    /*
    * @desc This method is called when onClick method is invoked by sure button. A Calendar instance is created and
    *       initialized.
    * @param none
    * @return none
    */
    void sureClicked() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        calendar.set(Calendar.YEAR, mTimeWheel.getCurrentYear());
        calendar.set(Calendar.MONTH, mTimeWheel.getCurrentMonth() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, mTimeWheel.getCurrentDay());
        calendar.set(Calendar.HOUR_OF_DAY, mTimeWheel.getCurrentHour());
        calendar.set(Calendar.MINUTE, mTimeWheel.getCurrentMinute());

        mCurrentMillSeconds = calendar.getTimeInMillis();
        if (mPickerConfig.tCallBack != null) {
            mPickerConfig.tCallBack.onDateSet(this, mCurrentMillSeconds);
        }
        dismiss();
    }

    public static class Builder {
        PickerConfig mPickerConfig;

        public Builder() {
            mPickerConfig = new PickerConfig();
        }

        public Builder setType(Type type) {
            mPickerConfig.mType = type;
            return this;
        }

        public Builder setThemeColor(int color) {
            mPickerConfig.mThemeColor = color;
            return this;
        }

        public Builder setCancelStringId(String left) {
            mPickerConfig.mCancelString = left;
            return this;
        }

        public Builder setSureStringId(String right) {
            mPickerConfig.mSureString = right;
            return this;
        }

        public Builder setTitleStringId(String title) {
            mPickerConfig.mTitleString = title;
            return this;
        }

        public Builder setToolBarTextColor(int color) {
            mPickerConfig.mToolBarTVColor = color;
            return this;
        }

        public Builder setWheelItemTextNormalColor(int color) {
            mPickerConfig.mWheelTVNormalColor = color;
            return this;
        }

        public Builder setWheelItemTextSelectorColor(int color) {
            mPickerConfig.mWheelTVSelectorColor = color;
            return this;
        }

        public Builder setWheelItemTextSize(int size) {
            mPickerConfig.mWheelTVSize = size;
            return this;
        }

        public Builder setCyclic(boolean cyclic) {
            mPickerConfig.cyclic = cyclic;
            return this;
        }

        public Builder setMinMillseconds(long millseconds) {
            mPickerConfig.mMinCalendar = new WheelCalendar(millseconds);
            return this;
        }

        public Builder setMaxMillseconds(long millseconds) {
            mPickerConfig.mMaxCalendar = new WheelCalendar(millseconds);
            return this;
        }

        public Builder setCurrentMillseconds(long millseconds) {
            mPickerConfig.mCurrentCalendar = new WheelCalendar(millseconds);
            return this;
        }

        public Builder setYearText(String year){
            mPickerConfig.mYear = year;
            return this;
        }

        public Builder setMonthText(String month){
            mPickerConfig.mMonth = month;
            return this;
        }

        public Builder setDayText(String day){
            mPickerConfig.mDay = day;
            return this;
        }

        public Builder setHourText(String hour){
            mPickerConfig.mHour = hour;
            return this;
        }

        public Builder setMinuteText(String minute){
            mPickerConfig.mMinute = minute;
            return this;
        }

        public Builder setCallBack(OnDateSetListenerNew listener) {
            mPickerConfig.tCallBack = listener;
            return this;
        }


        public TimePickerExpect buildNew() {
            return newIntance(mPickerConfig);
        }

    }


}
