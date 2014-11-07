package com.utad.baccus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void changeImageToBembibre(View v){
    	ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
        wineImage.setImageResource(R.drawable.bembibre);
    }
    
    public void changeImageToVegaval(View v){
    	ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
        wineImage.setImageResource(R.drawable.vegaval);
    }
}
