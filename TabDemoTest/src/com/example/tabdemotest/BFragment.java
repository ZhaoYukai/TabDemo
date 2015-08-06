package com.example.tabdemotest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BFragment extends Fragment {
	
	public BFragment() {
		
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.frag_second , container , false);
		ImageView iv = (ImageView) view.findViewById(R.id.id_imageView);
		iv.setImageDrawable(getResources().getDrawable(R.drawable.dy));
		return view;
	}

}