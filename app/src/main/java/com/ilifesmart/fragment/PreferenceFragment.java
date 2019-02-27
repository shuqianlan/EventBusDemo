package com.ilifesmart.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.preference.PreferenceScreen;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilifesmart.eventbusdemo.R;

public class PreferenceFragment extends PreferenceFragmentCompat {

	public static final String TAG = "PreferenceFragment";

	public static PreferenceFragment newInstance() {

		Bundle args = new Bundle();
		PreferenceFragment fragment = new PreferenceFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreatePreferences(Bundle bundle, String s) {
		Log.d(TAG, "onCreatePreferences: rootKey " + s);

		if (bundle != null) {
			Log.d(TAG, "onCreatePreferences: getArguments " + bundle.get("key"));
		}

		getPreferenceManager().setSharedPreferencesName("Settings");
//		if (bundle != null && bundle.get("key").equals("value")) {
//			addPreferencesFromResource(R.xml.app_preferences_jiangye);
//		} else {
			addPreferencesFromResource(R.xml.app_preference);
//		}
	}

	@Override
	public boolean onPreferenceTreeClick(Preference preference) {
		Log.d(TAG, "onPreferenceTreeClick: preference " + preference.getKey());

//		if (preference instanceof PreferenceScreen) {
//			Log.d(TAG, "onPreferenceTreeClick: >>>>>>>>>>>>> 1");
//			onNavigateToScreen((PreferenceScreen)preference);
//			return true;
//		} else {
//			Log.d(TAG, "onPreferenceTreeClick: >>>>>>>>>> 2");
//		}
		return super.onPreferenceTreeClick(preference);
	}
}
