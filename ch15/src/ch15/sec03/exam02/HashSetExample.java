package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();

		Member m1 = new Member("가가가", 10);
		System.out.println(m1.hashCode());
		set.add(m1);
		Member m2 = new Member("가가가", 10);
		System.out.println(m2.hashCode());

		set.add(m2);
		System.out.println(m1.equals(m2));

		// Member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		for (Member m : set)
			System.out.println(m.name + m.age);
	}
}