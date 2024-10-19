package reserve_integers;

public class ReserveInteger {

    public int reverse(int x) {
        int result = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if (newResult < min || newResult > max) {
                return 0;
            }
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        ReserveInteger obj = new ReserveInteger();
        System.out.println(obj.reverse(123));
    }
}
