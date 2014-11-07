package com.utad.baccus;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.utad.baccus.models.WineModel;


public class MainActivity extends ActionBarActivity {
	
	private WineModel vegaval = null;
	private WineModel bembibre = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        vegaval = new WineModel(R.drawable.vegaval, 4, "Vegaval", "Tinto", "http://www.vegaval.com/es/", "Miguel Calatayud)");
        vegaval.addGrape("Mencía");
        
        bembibre = new WineModel(R.drawable.bembibre, 5, "Bembibre", "Tinto", "http://www.dominiodetares.com/index.php/es/", "Dominio de Tares");
        bembibre.addGrape("Mencía");
    }
    
    public void changeImage(View v){
    	ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
    	if (v.getId() == R.id.btn_change_bembibre) {
    		wineImage.setImageResource(bembibre.getImage());
		}else if (v.getId() == R.id.btn_change_vegaval) {
			wineImage.setImageResource(vegaval.getImage());
		}
    }
}
