package org.yeewoe.coursefee.view.course;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.yeewoe.coursefee.R;
import org.yeewoe.coursefee.view.common.CfeeFragment;

/**
 * 课程-主界面
 * Created by wyw on 2016/1/26.
 */
public class CourseMainFragment extends CfeeFragment {
    private View mViewRoot;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mViewRoot == null) {
            mViewRoot = inflater.inflate(R.layout.fragment_course_main, container);
        }
        return mViewRoot;
    }
}
