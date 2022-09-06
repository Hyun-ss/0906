package com.nowon.list;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list.size());
		for(int i=0; i<3; i++) {
			list.add(i+1);//add(값) //0인덱스부터 저장
		}
		for(int num:list) {
			System.out.print(num+" ");
		}
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println();
		System.out.println(list.size());
		
		
		int[] arr=new int[3];
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
