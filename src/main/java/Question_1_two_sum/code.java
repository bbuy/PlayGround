package Question_1_two_sum;

import java.util.HashMap;

/**
 * Created by bbuy on 7/13/18.
 */
public class code {
    public static void main(String[] args) {
        int[] result = twoSum(new int[] {1,2,3,4,5,6,7,8}, 13);
        System.out.println(String.format("%d:%d", result[0], result[1]));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookUpTable = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (lookUpTable.get(target - nums[i]) != null) {
                return new int[]{lookUpTable.get(target - nums[i]), i};
            } else {
                lookUpTable.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
