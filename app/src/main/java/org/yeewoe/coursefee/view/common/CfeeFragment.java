package org.yeewoe.coursefee.view.common;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import org.yeewoe.coursefee.R;
import org.yeewoe.coursefee.log.LogCore;
import org.yeewoe.coursefee.log.LogTags;

/**
 * Frament基类
 * Created by wyw on 2016/1/26.
 */
public class CfeeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogCore.i(LogTags.TRACE_VIEW, getString(R.string.sys_enter_fragment, getClass().getName()));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogCore.i(LogTags.TRACE_VIEW, getString(R.string.sys_exit_fragment, getClass().getName()));
    }
}
