package org.yeewoe.coursefee.log;

import android.util.Log;

/**
 * 日志类
 * Created by wyw on 2016/1/26.
 */
public class LogCore {
    public static void i(String tag, String text) {

        Log.i(tag, text);
    }

    public static void d(String tag, String text) {

        Log.d(tag, text);
    }

}
