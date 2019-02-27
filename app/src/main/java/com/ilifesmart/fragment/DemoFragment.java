package com.ilifesmart.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ilifesmart.androidlib.BaseFragment;
import com.ilifesmart.eventbusdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends BaseFragment {


	public DemoFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
													 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_demo, container, false);

		if (getArguments() != null) {
			((TextView)v.findViewById(R.id.text)).setText(getArguments().get("key").toString());
		}

		return v;
	}

}
