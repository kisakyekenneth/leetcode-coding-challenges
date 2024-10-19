package single_number;

public class SingleNumbersXor {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            ans = ans ^ nums[i];
            System.out.println(ans);
        }
        return ans;
    }
}

// Time Complexity O(n)
// Space Complexity O(1)