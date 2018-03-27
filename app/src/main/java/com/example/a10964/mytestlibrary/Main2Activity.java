package com.example.a10964.mytestlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.example.mylibrary.TestUtils;

public class Main2Activity extends AppCompatActivity {

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		Log.e("xxxx","xx-->"+ TestUtils.getTest());
	}
}
