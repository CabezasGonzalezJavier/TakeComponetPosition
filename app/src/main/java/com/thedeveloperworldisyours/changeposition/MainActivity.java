package com.thedeveloperworldisyours.changeposition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mRelativeLayout;
    ImageView mRedCard, mNewCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_main_relative_layout);
        mRedCard = (ImageView) findViewById(R.id.activity_main_red_card);

        mNewCard = new ImageView(this);
        mNewCard.setBackgroundResource(R.color.colorPrimary);
        takePosition();

    }

    public void takePosition() {

        RelativeLayout.LayoutParams mLayoutParams = (RelativeLayout.LayoutParams) mRedCard.getLayoutParams();
        mNewCard.setLayoutParams(mLayoutParams);
        mRelativeLayout.addView(mNewCard);
    }
}
