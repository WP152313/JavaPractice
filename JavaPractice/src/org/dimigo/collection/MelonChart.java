package org.dimigo.collection;

import java.util.List;
import java.util.ArrayList;

public class MelonChart {
	
	public static void main(String[] args) {
		
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		System.out.println("-- <멜론 챠트> --");
		printList(list);
		
		System.out.println("\n-- <2위 곡 추가> --");
		list.add(1, new Music("SIGNAL","트와이스"));
		printList(list);
		
		System.out.println("\n-- <3위 곡 변경> --");
		list.set(2,new Music("팔레트","아이유"));
		printList(list);
		
		System.out.println("\n-- <2위 곡 삭제> --");
		list.remove(1);
		printList(list);
		
		System.out.println("\n-- <전체 리스트 삭제> --");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<Music> list) {
		for(Music i:list) {
			System.out.print(list.indexOf(i)+1);
			System.out.println(". "+i.toString());
		}
	}
}