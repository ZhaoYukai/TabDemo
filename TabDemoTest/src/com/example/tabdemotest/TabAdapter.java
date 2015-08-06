package com.example.tabdemotest;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
	
	private List<Fragment> mFragments = null;
	
	public static String[] TITLES = new String[] {
		"�γ�" , "�ʴ�" , "���" , "ѧϰ" , "�ƻ�"
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
		 * ע�⣬������ͳһʹ����TabFragment��Ȼ��ʵ������Ŀ�У���Ҫ���ݲ�ͬ��ҳ�洴����ͬ��Fragment
		 * ���������ZYK1Fragment��Ҳ������ZYK2Fragment����������ZYK3Fragment���ȵ�
		 * �����Ļ���MainActivity�е�List<Fragment>���������ˣ���Ϊ��ʱ��͵���
		 * mFragments.get(position)������position�Ĳ�ͬ���Ѳ�ͬ��fragmentȡ������
		 * Ȼ��return��ȥ
		 */
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}
	
	
	@Override
	public CharSequence getPageTitle(int position) {
		return TITLES[position] + ":����";
	}

}
