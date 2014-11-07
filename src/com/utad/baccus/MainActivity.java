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
    
    public void changeImage(View v){
    	ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
    	if (v.getId() == R.id.btn_change_bembibre) {
    		wineImage.setImageResource(R.drawable.bembibre);
		}else if (v.getId() == R.id.btn_change_vegaval) {
			wineImage.setImageResource(R.drawable.vegaval);
		}
    }
}
