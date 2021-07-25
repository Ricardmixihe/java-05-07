package com.jizhong.controller;

import java.util.Arrays;

public class TestMax {

	public static void main(String[] args) {
		//八戒本周劳作最高得分
		//数组
//		double[] arr = {10 , 9.5 , 8.5 , 9.5 , 9 , 8 , 7.5};
//		double max = arr[0];//假设索引值0是最大值
//		for(int i = 1;i < arr.length;i++){
//			if(max < arr[i]){//判断如果max小于比较值，则把大的值重新赋值给max变量
//				max = arr[i];
//			}
//		}
//		System.out.println("八戒本周劳作最高得分：" + max);
		
		//获取数组中最小值
//		double[] arr = {10 , 9.5 , 8.5 , 9.5 , 9 , 8 , 7.5};
//		double min = arr[0];//假设索引值0是最小值
//		for(int i = 1;i < arr.length;i++){
//			if(min > arr[i]){//判断如果min大于比较值，则把小的值重新赋值给min变量
//				min = arr[i];
//			}
//		}
//		System.out.println("八戒本周劳作最低得分：" + min);
		
		//获取最大值
		//数组排序，升序排序后，数组中最后一个索引位置就是数组中的最大值
		double[] arr = {10 , 9.5 , 8.5 , 9.5 , 9 , 8 , 7.5};
		//数组排序方法 sort(数组)
		Arrays.sort(arr);
		//获取最大值
		//数组最大索引 = 数组长度 - 1;
		//数组长度 ： 数组.lenght
		double max = arr[arr.length - 1];//最大值
		double min = arr[0];//最小值
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);
		
		
		//将数组转换为一个新的字符串
		String arrStr = Arrays.toString(arr);
		System.out.println(arrStr);
		
		
		//数组定义
		double[] arr1 = new double[]{}; double[] arr3 = {};
		double[] arr2 = new double[5];
		//数组赋值
		arr2[0] = 1.1;
		//索引：存储数据的位置编号
		double num = arr2[0];
		//for循环遍历数组
		//为了获取到数组中的每一条数据
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
		//数组排序
		Arrays.sort(arr2);
	}
}
