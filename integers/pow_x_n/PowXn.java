public class PowXn {

    public double myPow(double x, int n) {

        double ans = 1.0;
        long num = n;
        if (num < 0) {
            num = -num;
        } else if (num == 0) {
            return 1;
        }
        while (num > 0) {
            // check if n is even
            if (num % 2 == 0) {
                // square x and divide n by 2
                x = x * x;
                num = num / 2;
            } else {
                // For non even numbers, multiply ans with x and reduce n by 1
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            // if n is negative then return 1/ans
            ans = 1 / ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        PowXn obj = new PowXn();
        System.out.println(obj.myPow(2, 0));
    }
}
