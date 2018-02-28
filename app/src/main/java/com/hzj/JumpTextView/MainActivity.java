package com.hzj.JumpTextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JumpTextView jumpTextView=findViewById(R.id.text_jump);
        jumpTextView.setText("锄禾日当午，汗滴禾下土。谁知盘中餐，粒粒皆辛苦");
    }
}
