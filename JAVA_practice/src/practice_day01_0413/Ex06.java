package practice_day01_0413;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        System.out.println(nums.length); // 공간의 갯수

//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);

        for (int num : nums) { //향상된 for문
            System.out.println(num);
        }
    }
}
