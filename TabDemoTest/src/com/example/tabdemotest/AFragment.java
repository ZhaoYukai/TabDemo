package com.example.tabdemotest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AFragment extends Fragment {
		
	public AFragment() {
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.frag_first , container , false);
		TextView tv = (TextView) view.findViewById(R.id.id_tv);
		tv.setText("����:AFragment");
		return view;
	}

}
