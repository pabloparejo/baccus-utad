package com.utad.baccus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;

public class SettingsActivity extends Activity {

	private RadioGroup mRadios = null;
	public static final String OPTION_SELECTED = "OPTION_SELECTED";
	public static final int OPTION_NORMAL = 0;
	public static final int OPTION_FIT = 1;
	
	public static final int REQUEST_SELECT_SCALETYPE = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		mRadios = (RadioGroup) findViewById(R.id.radio_options);
		
	}
	
	public void cancel(View v){
		setResult(RESULT_CANCELED);
		finish();
	}
	
	public void save(View v){
		Intent intent = getIntent();
		if (mRadios.getCheckedRadioButtonId() == R.id.radio_normal) {
			intent.putExtra(OPTION_SELECTED, OPTION_NORMAL);
		}else{
			intent.putExtra(OPTION_SELECTED, OPTION_FIT);
		}
		setResult(RESULT_OK, intent);
		finish();
	}
}
