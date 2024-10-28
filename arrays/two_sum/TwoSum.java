import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            System.out.println(diff);

            // If the difference is already in the map
            // then we have found the pair
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 11, 15, 7, 8 };
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
