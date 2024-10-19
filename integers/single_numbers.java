import java.util.Set;

class Solution {
    // Using Brute Force Approach
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        // Return only the item in the HashSet.
        return set.iterator().next();

    }
}

// Time Complexity O(n)
// Space Complexity O(n)