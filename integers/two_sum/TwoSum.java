package two_sum;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Store number and there indices
        Map<integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int twosum = target - nums[i];
            if (map.containsKey(twosum)) {
                return new int[] { map.get(twosum), i };
            }
            map.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 11, 15, 7, 3 };
        int target = 6;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
