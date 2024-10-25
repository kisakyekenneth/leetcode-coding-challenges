// https://leetcode.com/problems/nth-root-of-number
public class NthRootOfNumber {

    public static void main(String[] args) {

        NthRootOfNumber obj = new NthRootOfNumber();
        System.out.println(NthRootOfNumber.nthRoot(7, 3));
    }

    static double nthRoot(int numb, int n) {
        double left = 1.0, right = n;
        double error = 0.0001;

        while ((right - left) > error) {
            double mid = (right + left) / 2.0;
            if (multiply(mid, n) > numb) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private static double multiply(double x, double n) {
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }
}
