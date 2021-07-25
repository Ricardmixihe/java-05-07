package com.jizhong.controller;

public class TestClass {
	public static void main(String[] args) {
		//定义数组存储全班人的年龄，并计算出平均年龄。
		//1. 定义数组存储全班年龄
		int[] ages = {18,18,18,18,18,18,18};
		int sum = 0;//班级总年龄
		//2. 循环遍历拿到每个人的年龄
		for(int i = 0;i < ages.length;i++){//ages.length：班级人数
			//2.1 每个人的年龄加到总年龄中
			sum += ages[i];
		}
		//3. 平均年龄 = 年龄总数 / 班级人数;
		int avg = sum / ages.length;
		System.out.println(avg);
	}
}
