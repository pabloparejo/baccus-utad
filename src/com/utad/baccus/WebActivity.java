package com.utad.baccus;

import com.utad.baccus.models.WineModel;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends Activity {

	private WineModel vegaval = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);
		
		// Accedo a las vistas
		final ProgressBar loading = (ProgressBar) findViewById(R.id.loading);
		WebView browser = (WebView) findViewById(R.id.browser);
		
		
		// Creo el modelo
		String ipsum = "Lorem fistrum ese hombree tiene musho peligro a wan te va a hasé pupitaa fistro quietooor qué dise usteer mamaar amatomaa. Ese que llega va usté muy cargadoo amatomaa no puedor llevame al sircoo no puedor. Ese hombree a peich apetecan la caidita me cago en tus muelas apetecan te voy a borrar el cerito caballo blanco caballo negroorl no te digo trigo por no llamarte Rodrigor ese que llega se calle ustée. Qué dise usteer ese pedazo de me cago en tus muelas torpedo torpedo no te digo trigo por no llamarte Rodrigor. Apetecan ese pedazo de por la gloria de mi madre hasta luego Lucas ese que llega hasta luego Lucas diodenoo hasta luego Lucas te voy a borrar el cerito quietooor. A peich sexuarl no te digo trigo por no llamarte Rodrigor de la pradera la caidita llevame al sircoo. Me cago en tus muelas benemeritaar sexuarl la caidita ese pedazo de te voy a borrar el cerito tiene musho peligro a peich pupita. \r\n A peich ahorarr apetecan sexuarl hasta luego Lucas papaar papaar no puedor de la pradera. Mamaar ese hombree llevame al sircoo diodeno diodenoo te voy a borrar el cerito condemor ahorarr me cago en tus muelas sexuarl al ataquerl. Se calle ustée se calle ustée llevame al sircoo caballo blanco caballo negroorl. A wan fistro fistro amatomaa a peich de la ";
	    vegaval = new WineModel(R.drawable.vegaval, 4, ipsum,"Vegaval", "Tinto", "http://www.vegaval.com/es/", "Miguel Calatayud");
	    vegaval.addGrape("Mencía");
	    vegaval.addGrape("Garnacho");
	    
	    // Fijamos el webview como navegador
	    browser.setWebViewClient(new WebViewClient(){
			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				super.onPageStarted(view, url, favicon);
				
				loading.setVisibility(View.VISIBLE);
			}

			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				loading.setVisibility(View.GONE);
			}
	    	
	    });
		
	    browser.loadUrl(vegaval.getURL());
		
	}
	
}
