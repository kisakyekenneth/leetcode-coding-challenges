public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        // Fill the rest of the array with 0
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = { 0, 1, 0, 3, 12 };
        obj.moveZeroes(nums);

    }
}

// TC - O(n)
// SC - O(1)
