package com.nowon.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest02 {

	public static void main(String[] args) {
		//기본적으로 콜렉션은 모든 데이터타입을 저장할 수 있다.
		//하지만 여러데이터 타입을 넣으면 관리가 불편하고, 읽어와서 가공하려면 캐스팅하고 처리해야함.
//		ArrayList list=new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add("문자열");
		
		//일반적으로 콜렉션은 사용할때 제네릭(java 1.5)을 사용한다.
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);//1.삽입시 add() 자동으로 인덱스번호 부여 0~
		//list.add(3.14);
		//list.add("");
		//list.add(null);//null도 가능
		
		//Integer n=null;
		//제네릭에 정의한 데이터타입만 가능
		
		System.out.println(list.get(0));//2.읽기 get(인덱스번호)
		list.set(0, 20);//3.수정 set(인덱스번호,값)
		System.out.println(list.get(0));
		list.remove(0);//4.삭제 remove(인덱스번호)
		
		
		displayList(list);
		
		list.add(10);
		list.add(20);
		list.add(30);
		displayList(list);
		
		list.add(0, 100); //중간삽입
		displayList(list);
		
		list.remove(1);
		
		displayList(list);
		//단점: 빈번한 데이터 삽입삭제시 처리속도가 느리다.
		
		//빈번한 데이터 삽입삭제에 용이한구조
		
	}
	private static void displayList(List<Integer> list) {
		
		System.out.println("리스트에 저장된 개수:"+list.size());
		for(int n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
