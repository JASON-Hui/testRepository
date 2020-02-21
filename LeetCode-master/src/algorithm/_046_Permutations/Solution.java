package algorithm._046_Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /*给定一个没有重复数字的序列，返回其所有可能的全排列。*/

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        //标记是否使用
        boolean[] visited = new boolean[nums.length];
        backtracking(result, list, visited, nums);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> list, boolean[] visited, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            backtracking(result, list, visited, nums);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }


}
