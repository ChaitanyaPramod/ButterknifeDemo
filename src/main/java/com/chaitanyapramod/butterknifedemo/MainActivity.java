package com.chaitanyapramod.butterknifedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @BindView(R.id.my_text_view)
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.my_text_view);

        ButterKnife.bind(this);

        myTextView.setText("Ta-da!");
    }
}
