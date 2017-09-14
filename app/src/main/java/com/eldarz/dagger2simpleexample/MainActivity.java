package com.eldarz.dagger2simpleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.eldarz.additionallib.SomeClass;
import com.eldarz.additionallib.SomeClassFactory;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.some_text);

        SomeClass someClass = SomeClassFactory.CreateSomeClass(this);
        mTextView.setText(someClass.getMessage());
    }
}
