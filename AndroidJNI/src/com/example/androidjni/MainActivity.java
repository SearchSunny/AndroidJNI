package com.example.androidjni;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Toast;
/**
 * 
 * 生成日期：2016-5-6 <br/>
 * 描述：生成.so库，JNI样例
 */
public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(this, get(), Toast.LENGTH_LONG).show();
	}
	static{System.loadLibrary("hello");}

	public native String get();
}
