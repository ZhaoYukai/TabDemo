package com.example.tabdemotest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EFragment extends Fragment {
	
	public EFragment() {
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.frag_fifth , container , false);
		TextView tv = (TextView) view.findViewById(R.id.id_tv5);
		tv.setText("ÄÚÈÝ:EFragment");
		return view;
	}

}
