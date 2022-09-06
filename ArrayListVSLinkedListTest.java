package com.nowon.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedListTest {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new LinkedList<>();
		
		long start;
		long end;
		start=System.nanoTime();
		for(int i=1;i<10000;i++)list1.add(0,i);
		end=System.nanoTime();
		System.out.println("ArrayList 중간삽입 처리시간 : "+(end-start));
	
		start=System.nanoTime();
		for(int i=1;i<10000;i++)list2.add(0,i);
		end=System.nanoTime();
		System.out.println("LinkedList 중간삽입 처리시간 : "+(end-start));
		
		List<Integer> list3=new ArrayList<>();
		List<Integer> list4=new LinkedList<>();
		
		/*
		 * start=System.nanoTime(); for(int
		 * i=1;i<=100000;i++)list3.add(String.valueOf(i)); end=System.nanoTime();
		 * System.out.println("ArrayList 순차입력 처리시간 : "+(end-start));
		 * 
		 * start=System.nanoTime(); for(int
		 * i=1;i<=100000;i++)list4.add(String.valueOf(i)); end=System.nanoTime();
		 * System.out.println("LinkedList 순차입력 처리시간 : "+(end-start));
		 */

	}

}
