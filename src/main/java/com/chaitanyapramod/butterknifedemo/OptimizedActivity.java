package com.chaitanyapramod.butterknifedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class OptimizedActivity extends Activity {

    @BindView(R.id.my_text_view)
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.my_text_view);

        new OptimizedActivity_ViewBinding(this);

        myTextView.setText("Ta-da!");
    }
}
