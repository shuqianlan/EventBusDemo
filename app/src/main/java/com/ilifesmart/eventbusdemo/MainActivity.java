package com.ilifesmart.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ilifesmart.androidlib.BaseActivity;
import com.ilifesmart.fragment.PreferenceFragment;

public class MainActivity extends BaseActivity {

	public static final String TAG = "MainActivity";

	@Override
	protected int getLayoutResID() {
		return R.layout.activity_main;
	}

	@Override
	protected void initialize() {
		Log.d(TAG, "initialize: Settings");
		fm.beginTransaction().add(R.id.frame_cont, PreferenceFragment.newInstance()).commitAllowingStateLoss();
	}
}
