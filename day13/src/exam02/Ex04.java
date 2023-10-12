package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        // fill(Object[] a, Object val)
        // 해당 배열을 val값으로 채움
        char[] stars = new char[10];
        Arrays.fill(stars, '*');
        System.out.println(Arrays.toString(stars));
        
        // mismatch()
        // 두개의 배열을 비교해서 달라진 위치 비교
        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        int pos = Arrays.mismatch(nums1, nums2);
        System.out.println(pos);

        // asList()
        List<String> fruits = Arrays.asList("Apple","Orange", "Melon");
        fruits.remove(1); // UnsupportedOperationException -> 수정불가 형태의 list
        System.out.println(fruits);
    }
}
