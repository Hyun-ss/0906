package com.nowon.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		//빈번한 삽입삭제시 용이한 데이터구조
		//빠른검색을 지원하지는 않는 구조
		List<Integer> list =new LinkedList<>();
		list.add(10);// 1.삽입
		display(list);
		list.add(0,20);//2.중간삽입
		display(list);
		list.set(1, 100);//3.수정
		display(list);
		list.remove(0);//4.삭제
		display(list);
	}

	private static void display(List<Integer> list) {
		System.out.println(list.size());
		System.out.print("{");
		for(int i=0; i<list.size();i++) {
			if(i==list.size()-1)System.out.println(list.get(i)+"}");
			else System.out.print(list.get(i)+",");
		}
	}

}
