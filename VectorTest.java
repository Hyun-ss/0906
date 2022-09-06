package com.nowon.list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//멀티스레드
		//동기화
		//synchronized 메서드가 포함되어있어요
		//멀티스레드상에서 데이터가 안전하게 처리가능함.
		Vector<Integer> list=new Vector<>();
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(null);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		System.out.println(list.size());
		list.set(4, 100);
		for(Integer num:list) {
			System.out.print(num+" ");
		}
		System.out.println();
		list.remove(0);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

}
