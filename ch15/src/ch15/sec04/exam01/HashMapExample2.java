package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<String, Double> info = new HashMap<>();
        info.put("서울", 19.0);
        info.put("베이징", 17.5);
        info.put("도쿄", 35.0);
        info.put("방콕", 45.7);
        System.out.println("서울 몇도 입니까?");
        System.out.println("현재 " + info.get("서울") + "도 입니다.");

        Map<String, String> dictions = new HashMap<>();
        dictions.put("appple", "사과");
        dictions.put("beer", "맥주");
        dictions.put("peanut", "땅콩");
        dictions.put("squid", "오징어");
        System.out.println("키 입력 : ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        System.out.println(dictions.containsKey(key));

    }
}
