package com.utad.baccus;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix.ScaleToFit;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.utad.baccus.models.WineModel;


public class WineActivity extends ActionBarActivity {
	
	private WineModel mWine = null;
	private ImageView mWineImage = null;
	//private WineModel bembibre = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String ipsum = "Lorem fistrum ese hombree tiene musho peligro a wan te va a hasé pupitaa fistro quietooor qué dise usteer mamaar amatomaa. Ese que llega va usté muy cargadoo amatomaa no puedor llevame al sircoo no puedor. Ese hombree a peich apetecan la caidita me cago en tus muelas apetecan te voy a borrar el cerito caballo blanco caballo negroorl no te digo trigo por no llamarte Rodrigor ese que llega se calle ustée. Qué dise usteer ese pedazo de me cago en tus muelas torpedo torpedo no te digo trigo por no llamarte Rodrigor. Apetecan ese pedazo de por la gloria de mi madre hasta luego Lucas ese que llega hasta luego Lucas diodenoo hasta luego Lucas te voy a borrar el cerito quietooor. A peich sexuarl no te digo trigo por no llamarte Rodrigor de la pradera la caidita llevame al sircoo. Me cago en tus muelas benemeritaar sexuarl la caidita ese pedazo de te voy a borrar el cerito tiene musho peligro a peich pupita. \r\n A peich ahorarr apetecan sexuarl hasta luego Lucas papaar papaar no puedor de la pradera. Mamaar ese hombree llevame al sircoo diodeno diodenoo te voy a borrar el cerito condemor ahorarr me cago en tus muelas sexuarl al ataquerl. Se calle ustée se calle ustée llevame al sircoo caballo blanco caballo negroorl. A wan fistro fistro amatomaa a peich de la ";
        
        mWine = new WineModel(R.drawable.vegaval, 4, ipsum,"Vegaval", "Tinto", "http://www.vegaval.com/es/", "Miguel Calatayud");
        mWine.addGrape("Mencía");
        mWine.addGrape("Garnacho");
        
        /*bembibre = new WineModel(R.drawable.bembibre, 5, "Vino tinto con más de 10 años de historia. Tiene un sabor suave y con aromas afrutados", "Bembibre", "Tinto", "http://www.dominiodetares.com/index.php/es/", "Dominio de Tares");
        bembibre.addGrape("Mencía");*/
        
        mWineImage = (ImageView) findViewById(R.id.wine_image);
        TextView wineName = (TextView) findViewById(R.id.text_wine_name);
        TextView wineType = (TextView) findViewById(R.id.text_wine_type);
        TextView wineWinehouse = (TextView) findViewById(R.id.text_wine_winehouse);
        RatingBar wineRating = (RatingBar) findViewById(R.id.wine_rating);
        
        LinearLayout grapesContainer = (LinearLayout) findViewById(R.id.grapes);
        
        TextView wineDescription = (TextView) findViewById(R.id.text_wine_description);
        
        mWineImage.setImageResource(mWine.getImage());
        wineName.setText(mWine.getName());
        wineType.setText(mWine.getType());
        wineWinehouse.setText(mWine.getWinehouse());
        wineRating.setRating(mWine.getRating());
        
        for (String grape : mWine.getGrapes()) {
			TextView text = new TextView(this);
			text.setText(grape);
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			text.setLayoutParams(params);
			text.setTextColor(Color.WHITE);
			grapesContainer.addView(text);
		}
        
        wineDescription.setText(mWine.getDescription());
        
    }
    
    public void openURL(View v){
    	Intent webIntent = new Intent(this, WebActivity.class);
    	webIntent.putExtra("URL", mWine.getURL());
    	startActivity(webIntent);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		boolean defatultValue = super.onOptionsItemSelected(item);
		if (item.getItemId() == R.id.action_settings) {
			Intent settingsIntent = new Intent(this, SettingsActivity.class);
			startActivityForResult(settingsIntent, SettingsActivity.REQUEST_SELECT_SCALETYPE);
			return true;
		}else{
			return defatultValue;
		}
		
		
	}

	@Override
	protected void onActivityResult(int requestCode, int result, Intent intent) {
		super.onActivityResult(requestCode, result, intent);
		if (requestCode == SettingsActivity.REQUEST_SELECT_SCALETYPE && result == RESULT_OK) {
			
			int optionSelected = intent.getIntExtra(SettingsActivity.OPTION_SELECTED, -1);
			if (optionSelected != -1 && optionSelected == SettingsActivity.OPTION_NORMAL) {
				mWineImage.setScaleType(ScaleType.FIT_CENTER);
			}else if (optionSelected != -1 && optionSelected == SettingsActivity.OPTION_FIT) {
				mWineImage.setScaleType(ScaleType.FIT_XY);
			}
			
		}
	}
    
    
    
    /*public void changeImage(View v){
    	ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
    	if (v.getId() == R.id.btn_change_bembibre) {
    		wineImage.setImageResource(bembibre.getImage());
		}else if (v.getId() == R.id.btn_change_vegaval) {
			wineImage.setImageResource(vegaval.getImage());
		}
    }*/
}
