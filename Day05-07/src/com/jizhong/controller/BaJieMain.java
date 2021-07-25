package com.jizhong.controller;

import java.text.DecimalFormat;

public class BaJieMain {
	public static void main(String[] args) {
		double mon = 10; //八戒本周一的劳作得分
		double tues = 9;
		double wed = 8.5;
		double thurs = 9.5;
		double fri = 9;
		double sat = 8;
		double sun = 7.5;
		double avg = (mon + tues + wed + thurs + fri + sat + sun) / 7;
		System.out.println(avg);
		
		DecimalFormat df = new DecimalFormat("#.##");
		String avgStr = df.format(avg);
		System.out.println(avgStr);
//		var arr = ["a","b","c",1,new DecimalFormat()]; JS
	}
}
