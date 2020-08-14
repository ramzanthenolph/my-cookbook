package com.moringaschool.mycookbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.addTocookbookButton) Button mAddToCookbookButton;
    @BindView(R.id.viewcookbookButton) Button mViewCookbookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAddToCookbookButton.setOnClickListener(this);
        mViewCookbookButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mAddToCookbookButton){
            Intent  addToIntent = new Intent(MainActivity.this, AddToCookbookActivity.class);
            startActivity(addToIntent);
        }
        else if (v == mViewCookbookButton){
            Intent toViewIntent = new Intent(MainActivity.this, CookbookActivity.class);
            startActivity(toViewIntent);
        }
    }
}