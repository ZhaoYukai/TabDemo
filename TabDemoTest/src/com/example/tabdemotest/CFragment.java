package com.example.tabdemotest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CFragment extends Fragment {
	
	public CFragment() {
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.frag_third , container , false);
		TextView tv = (TextView) view.findViewById(R.id.id_tv3);
		tv.setText("ÄÚÈÝ:CFragment");
		return view;
	}

}
