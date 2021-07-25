package com.jizhong.controller;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TestArr {
	public static void main(String[] args) {
		//计算八戒的平均分
		double mon = 10; //八戒本周一的劳作得分
		double tues = 9;
		double wed = 8.5;
		double thurs = 9.5;
		double fri = 9;
		double sat = 8;
		double sun = 7.5;
		/**
		 * 数组：用来存储一组同类型的数据
		 * 语法：
		 * 		数据类型[] 数组名 = {};
		 * 		数据类型 数组名[] = {};
		 * 		
		 * 索引：
		 * 		数组中存储数据的位置编号，从0开始 ~ 长度减一结束
		 * 
		 */
		//第一种：数据类型[] 数组名 = {值1,值2};
		double[] arr1 = {10 , 9.5 , 8.5 , 9.5 , 9 , 8 , 7.5};
		arr1[0] = 10 * 10;
		double num = arr1[0];
//		System.out.println(num);
//		System.out.println(num);
		//第二种：数据类型[] 数组名称 = new 数据类型[长度];
//		double[] arr2 = new double[5];
//		arr2[0] = 10;
//		arr2[0] = 10 * 10;
//		arr2[1] = 9;
//		arr2[4] = 10;
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[4]);
		//0~6
		double[] arr3 = {10 , 9.5 , 8.5 , 9.5 , 9 , 8 , 7.5};//7
		double avg = 0;//平均值
		double sum = 0;//总数
//		//数组的遍历：通过遍历的方式获取到数组中的每一个位置的值
		for(int i = 0;i < arr3.length;i++){
			sum += arr3[i];
		}
		avg = sum / arr3.length;//平均值
//		System.out.println(avg);//8.857142857142858
		
		//循环为数组中索引赋值
		Scanner s = new Scanner(System.in);
		double[] scoreArr  = new double[5];//成绩数组
		//循环为数组中添加数据
		for(int i = 0;i < scoreArr.length;i++){
			scoreArr[i] = s.nextDouble();
		}
		System.out.println(Arrays.toString(scoreArr));
		s.close();
	}
}
