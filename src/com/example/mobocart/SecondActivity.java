package com.example.mobocart;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends Activity {
	private ImageView imgview1;
	private EditText txt1,txt2;
	private Button btn1,btn2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		txt1=(EditText)findViewById(R.id.editText1);
		txt2=(EditText)findViewById(R.id.editText2);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		 if (txt1.getText().toString().equals("admin") && 
				
				                 txt2.getText().toString().equals("admin")) {
				
				             Toast.makeText(getApplicationContext(), "Hello admin!", 
				 
				             Toast.LENGTH_SHORT).show();
				 
				         } 
		 else {
				 
				             Toast.makeText(getApplicationContext(), "Seems like you 're not admin!", 
				
				                     Toast.LENGTH_SHORT).show();
				         }
		 btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(SecondActivity.this,FeatureActivity.class);
				startActivity(intent);
				
			}
		});
		
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
