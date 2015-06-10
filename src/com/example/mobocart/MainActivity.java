package com.example.mobocart;




import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 final Handler handler = new Handler();
	        handler.postDelayed(new Runnable() {
	            public void run() {
	                
	                Intent mInHome = new Intent(MainActivity.this, SecondActivity.class);
	                MainActivity.this.startActivity(mInHome);
	                MainActivity.this.finish();
	            }
	        }, 5000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
