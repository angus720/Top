package com.angus.topdemo;

import android.app.Application;

import com.angus.topdemo.utils.DbUtil;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/2/27.
 */
public class BaseApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        DbUtil.init(this);
        Fresco.initialize(this);
    }
}
