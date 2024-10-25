public class ReserveStrings {
    public char[] reverseCharStrings(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        return s;
    }

    public static void main(String[] args) {
        ReserveStrings obj = new ReserveStrings();
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(obj.reverseCharStrings(str));
    }
}

// TC - O(n)
// SC - O(1)
