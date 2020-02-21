package algorithm._001_Two_Sum;
import java.util.*;

public class Solution {
    /*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
    并返回他们的数组下标。*/
    public static void main(String[] args) {
        System.out.println("武");
        System.out.println("汉");
        System.out.println("加");
        System.out.println("油");
        System.out.println();

    }

    public static void main(String[] args) {

    }
    /**/String
    //
    /*用一个hashmap来存储数值和对应的下标*/
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        //数值和数值对应下标
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}


