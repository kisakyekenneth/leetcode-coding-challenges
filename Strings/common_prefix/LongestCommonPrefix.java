public class LongestCommonPrefix {
    public String commonPrefix(String[] str) {
        if (str.length == 0)
            return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(obj.commonPrefix(strs));
    }
}
