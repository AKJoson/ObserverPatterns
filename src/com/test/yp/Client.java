package com.test.yp;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<String> mList = new ArrayList<String>();
		mList.add("a");
		MyAdapter adapter = new MyAdapter(mList);
		ListView listView = new ListView();
		listView.setAdapter(adapter);
		mList.add("a");
		mList.add("b");
		mList.add("c");
		adapter.update(mList);
	}
}
