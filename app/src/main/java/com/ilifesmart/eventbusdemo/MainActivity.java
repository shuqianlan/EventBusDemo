package com.ilifesmart.eventbusdemo;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ilifesmart.androidlib.BaseActivity;
import com.ilifesmart.fragment.PreferenceFragment;

import java.util.List;

public class MainActivity extends PreferenceActivity {

	public static final String TAG = "MainActivity";

	@Override
	public void onBuildHeaders(List<Header> target) {
		loadHeadersFromResource(R.xml.app_preference_headers, target);
	}

	@Override
	protected boolean isValidFragment(String fragmentName) {
		return true;
	}

}
