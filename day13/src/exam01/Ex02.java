package exam01;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {

        //Map<String, String> members = new HashMap<>();
                                                    // 내림 차순 정렬
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder()); // TreeMap: 키값을 정렬
        Map<String, String> members2 = new TreeMap<>((a,b) -> b.compareTo(a)); // 람다식

        members.put("user01","사용자01");
        members.put("user02","사용자02");
        members.put("user03","사용자03"); // 키값이 없으므로 추가
        members.put("user04","사용자04");
        members.put("user05","사용자05");

        members.put("user03","(수정)사용자03"); // 키값이 존재할 때는 val값이 수정된다

        members.remove("user03"); // 삭제

        String name = members.get("user03");
        //String name2 = members.get("user06");
        System.out.println(name);
        //System.out.println(name2); // null

        // getOrDefault(Object key, V defaultValue)
        // 키값이 없을 때 기본값으로 처리
        String name2 = members.getOrDefault("user06", "없는 사용자");
        System.out.println(name2);
        
        // map에 있는 전체 내용 조회
        Set<Map.Entry<String, String>> entries = members.entrySet();
        for(Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n",key,value);

        }
    }
}
