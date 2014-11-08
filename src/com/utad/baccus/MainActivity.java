package com.utad.baccus;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.utad.baccus.models.WineModel;


public class MainActivity extends ActionBarActivity {
	
	private WineModel vegaval = null;
	//private WineModel bembibre = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String ipsum = "Lorem fistrum ese hombree tiene musho peligro a wan te va a hasé pupitaa fistro quietooor qué dise usteer mamaar amatomaa. Ese que llega va usté muy cargadoo amatomaa no puedor llevame al sircoo no puedor. Ese hombree a peich apetecan la caidita me cago en tus muelas apetecan te voy a borrar el cerito caballo blanco caballo negroorl no te digo trigo por no llamarte Rodrigor ese que llega se calle ustée. Qué dise usteer ese pedazo de me cago en tus muelas torpedo torpedo no te digo trigo por no llamarte Rodrigor. Apetecan ese pedazo de por la gloria de mi madre hasta luego Lucas ese que llega hasta luego Lucas diodenoo hasta luego Lucas te voy a borrar el cerito quietooor. A peich sexuarl no te digo trigo por no llamarte Rodrigor de la pradera la caidita llevame al sircoo. Me cago en tus muelas benemeritaar sexuarl la caidita ese pedazo de te voy a borrar el cerito tiene musho peligro a peich pupita. \r\n A peich ahorarr apetecan sexuarl hasta luego Lucas papaar papaar no puedor de la pradera. Mamaar ese hombree llevame al sircoo diodeno diodenoo te voy a borrar el cerito condemor ahorarr me cago en tus muelas sexuarl al ataquerl. Se calle ustée se calle ustée llevame al sircoo caballo blanco caballo negroorl. A wan fistro fistro amatomaa a peich de la ";
        
        vegaval = new WineModel(R.drawable.vegaval, 4, ipsum,"Vegaval", "Tinto", "http://www.vegaval.com/es/", "Miguel Calatayud");
        vegaval.addGrape("Mencía");
        vegaval.addGrape("Garnacho");
        
        /*bembibre = new WineModel(R.drawable.bembibre, 5, "Vino tinto con más de 10 años de historia. Tiene un sabor suave y con aromas afrutados", "Bembibre", "Tinto", "http://www.dominiodetares.com/index.php/es/", "Dominio de Tares");
        bembibre.addGrape("Mencía");*/
        
        ImageView wineImage = (ImageView) findViewById(R.id.wineImage);
        TextView wineName = (TextView) findViewById(R.id.text_wine_name);
        TextView wineType = (TextView) findViewById(R.id.text_wine_type);
        TextView wineWinehouse = (TextView) findViewById(R.id.text_wine_winehouse);
        RatingBar wineRating = (RatingBar) findViewById(R.id.wine_rating);
        
        LinearLayout grapesContainer = (LinearLayout) findViewById(R.id.grapes);
        
        TextView wineDescription = (TextView) findViewById(R.id.text_wine_description);
        
        wineImage.setImageResource(vegaval.getImage());
        wineName.setText(vegaval.getName());
        wineType.setText(vegaval.getType());
        wineWinehouse.setText(vegaval.getWinehouse());
        wineRating.setRating(vegaval.getRating());
        
        for (String grape : vegaval.getGrapes()) {
			TextView text = new TextView(this);
			text.setText(grape);
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
			text.setLayoutParams(params);
			text.setTextColor(Color.WHITE);
			grapesContainer.addView(text);
		}
        
        wineDescription.setText(vegaval.getDescription());
        
        
        
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
