package com.hzj.JumpTextView;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rj on 2018/3/1.
 */

public abstract class BaseFragment extends Fragment {


    JumpTextView jumpTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        jumpTextView=view.findViewById(R.id.tv_sample);
        setText();
    }

    abstract void setText();

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser){
            jumpTextView.startText();
        }else {
            jumpTextView.stopText();
        }
    }
}
