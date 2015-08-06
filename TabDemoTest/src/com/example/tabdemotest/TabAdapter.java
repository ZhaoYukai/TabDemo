package com.example.tabdemotest;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
	
	private List<Fragment> mFragments = null;
	
	public static String[] TITLES = new String[] {
		"课程" , "问答" , "求课" , "学习" , "计划"
	};

	public TabAdapter(FragmentManager fm) {
		super(fm);
		
		mFragments = new ArrayList<Fragment>();
		
		AFragment aFragment = new AFragment();
		mFragments.add(aFragment);
		
		BFragment bFragment = new BFragment();
		mFragments.add(bFragment);
		
		CFragment cFragment = new CFragment();
		mFragments.add(cFragment);
		
		DFragment dFragment = new DFragment();
		mFragments.add(dFragment);
		
		EFragment eFragment = new EFragment();
		mFragments.add(eFragment);
	}

	@Override
	public Fragment getItem(int position) {
		return mFragments.get(position);
		/**
		 * 注意，这里是统一使用了TabFragment，然而实际在项目中，需要根据不同的页面创建不同的Fragment
		 * 比如可能是ZYK1Fragment，也可能是ZYK2Fragment，还可能是ZYK3Fragment，等等
		 * 这样的话，MainActivity中的List<Fragment>就起作用了，因为到时候就得用
		 * mFragments.get(position)，根据position的不同，把不同的fragment取出来，
		 * 然后return回去
		 */
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}
	
	
	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position] + ":标题";
	}

}
