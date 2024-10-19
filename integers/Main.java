import single_number.SingleNumbersXor;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };

        SingleNumbersXor obj = new SingleNumbersXor();
        System.out.println(obj.singleNumber(nums));
    }
}
