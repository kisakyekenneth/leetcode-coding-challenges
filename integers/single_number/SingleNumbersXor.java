public class SingleNumbersXor {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        SingleNumbersXor obj = new SingleNumbersXor();
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(obj.singleNumber(nums));
    }
}

// Time Complexity O(n)
// Space Complexity O(1)