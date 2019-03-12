package com.test.yp;

import java.util.List;

public class MyAdapter extends BaseAdapter{
	List<String> mList;
	public MyAdapter(List<String> mList) {
		// TODO Auto-generated constructor stub
		this.mList = mList;
	}
	public void update(List<String> mList) {
		this.mList = mList;
		notifyDataChange();
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return mList.size();
	}

}
