package com.ilifesmart.eventbusdemo;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class PreferenceDemo2Activity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public void onBuildHeaders(List<Header> target) {
		loadHeadersFromResource(R.xml.app_preference_headers, target);
	}

	@Override
	protected boolean isValidFragment(String fragmentName) {
		return true;
	}
}
