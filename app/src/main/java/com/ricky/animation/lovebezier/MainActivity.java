package com.ricky.animation.lovebezier;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {

	@Override
	public String getAppName(){
		return BuildConfig.APP_NAME;
	}

	private LoveLayout loveLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loveLayout = (LoveLayout)findViewById(R.id.loveLayout);
	}
	
	public void start(View v){
		loveLayout.addLoveIcon();
	}

}
