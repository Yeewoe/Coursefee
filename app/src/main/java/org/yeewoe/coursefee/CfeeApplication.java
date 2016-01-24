package org.yeewoe.coursefee;

import android.app.Application;

/**
 * 核心Application
 * Created by wyw on 2016/1/14.
 */
public class CfeeApplication extends Application {

    private static CfeeApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static CfeeApplication getInstance() {
        return mInstance;
    }
}
