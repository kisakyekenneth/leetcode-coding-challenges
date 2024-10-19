public class FactorialTrailingZeros {
    public int trailingZeros(int n) {
        // To get a zero, we need a multiplying factor like (2*5)
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            // The loop should stop when i is greater than n
            // When i is greater than n then the result will be zero.
            count += n / i;
        }
        return count;
    }

    public static void main(String[] arg) {
        FactorialTrailingZeros obj = new FactorialTrailingZeros();
        System.out.println(obj.trailingZeros(20));
    }
}

// Factor of 10; 10! = 1*2*3*4*5*6*7*8*9*10 = (1*2*3*4*5*6*7*8*9*[2*5])
// n/5 + n/25 + n/125 (Formular to find number of trailing zeros)
