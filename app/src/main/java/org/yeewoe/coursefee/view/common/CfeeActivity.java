package org.yeewoe.coursefee.view.common;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import org.yeewoe.coursefee.R;
import org.yeewoe.coursefee.log.LogCore;
import org.yeewoe.coursefee.log.LogTags;

/**
 * Activity基类
 * Created by wyw on 2016/1/26.
 */
public class CfeeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogCore.i(LogTags.TRACE_VIEW, getString(R.string.sys_enter_activity, this.getClass().getName()));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        LogCore.i(LogTags.TRACE_VIEW, getString(R.string.sys_exit_activity, this.getClass().getName()));
    }

    @Override
    public void finish() {
        super.finish();
    }

    protected void showToast(int resId) {
        Toast.makeText(CfeeActivity.this, resId, Toast.LENGTH_SHORT).show();
    }

    protected void showToast(String text) {
        Toast.makeText(CfeeActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
