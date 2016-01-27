package org.yeewoe.coursefee.view.common.title;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.yeewoe.coursefee.R;
import org.yeewoe.coursefee.view.common.CfeeFrameLayout;

/**
 * 标题栏图标按钮
 * Created by wyw on 2016/1/27.
 */
public class CfeeTitleIconButton extends CfeeFrameLayout {
    private int mAttrButtonSrc = -1;

    public CfeeTitleIconButton(Context context) {
        super(context);

        init();
    }

    public CfeeTitleIconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleBar);
        mAttrButtonSrc = typedArray.getResourceId(R.styleable.TitleBar_buttonSrc, -1);
        typedArray.recycle();

        init();
    }

    private void init() {
        if (mAttrButtonSrc != -1) {
            ImageView imgviButtonSrc = new ImageView(getContext());
            CfeeFrameLayout.LayoutParams layoutParams = new CfeeFrameLayout.LayoutParams(
                    getResources().getDimensionPixelOffset(R.dimen.ui_title_iceon_button_inner_length),
                    getResources().getDimensionPixelOffset(R.dimen.ui_title_iceon_button_inner_length));
            layoutParams.gravity = Gravity.CENTER;
            imgviButtonSrc.setLayoutParams(layoutParams);
            imgviButtonSrc.setImageResource(mAttrButtonSrc);
            addView(imgviButtonSrc);
        }
    }
}
