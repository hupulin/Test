package com.xmkj.applibrary.base.banner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.xmkj.applibrary.R;
import com.xmkj.applibrary.domain.login.BannerTo;
import com.xmkj.applibrary.util.GlideRoundTransform;


/**
 * Created by xzz on 2017/6/25.
 **/

public class BannerHolderView implements Holder<BannerTo> {
    private ImageView imageView;
    private int radius;
    public BannerHolderView(){

    }

    public BannerHolderView(int radius){
        this.radius=radius;
    }
    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, BannerTo data) {
        Glide.with(context).load(data.getAdvertisementUrl()).transform(new GlideRoundTransform(context, radius)).placeholder(R.mipmap.banner_glide).into(imageView);

    }


}
