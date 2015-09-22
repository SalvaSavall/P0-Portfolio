package com.salvasavall.p0_portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onBtnPopMovClicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my popular movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onBtnDuo1Clicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onBtnDuo2Clicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onBtnBiggerClicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onBtnBaconClicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my xyz reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onBtnCapstoneClicked(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
