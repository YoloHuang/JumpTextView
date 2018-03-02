package com.hzj.JumpTextView;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rj on 2018/3/1.
 */

public class SimpleFragment1 extends BaseFragment {


    @Override
    void setText() {
        jumpTextView.setText(getString(R.string.text_first));
    }
}
