package com.example.xkzx;

import android.os.Bundle;
import android.widget.TextView;

import com.ruffian.library.RTextView;
import com.xmkj.applibrary.base.BaseActivity;

import butterknife.BindView;

/**
 * Copyright：杭州方升科技有限公司
 * Created by  on 2020/6/18 12:32
 */
public class MainActivity extends BaseActivity {
    @BindView(R.id.text_view)
    RTextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(R.layout.activity_splash);
        text.setText("我是一个Bindview");

    }
}
