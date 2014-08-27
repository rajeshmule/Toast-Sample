package com.example.toast;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void stoast(View v) {
		Toast toast = Toast.makeText(this, "Hello From Rajesh.",
				Toast.LENGTH_LONG);
		toast.show();
	}

	public void catoast (View v) {
		Toast toast = Toast.makeText(this, "Hello From JAAGA.",
				Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
	public void cbtoast (View v) {
		 Toast toast = new Toast(this);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setGravity(Gravity.BOTTOM, 0, 0);
		
		//take the xml apperance  dicreption and convert that jaava view object
		
		LayoutInflater inflater=getLayoutInflater();
		View apperance = inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.root));
		toast.setView(apperance);
		toast.show();
	}

}
