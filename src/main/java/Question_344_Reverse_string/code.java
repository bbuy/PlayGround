package Question_344_Reverse_string;

/**
 * Created by bbuy on 7/14/18.
 */
public class code {
    public static void main(String[] args) {
        System.out.println(reverseString("This is a test"));
    }
    public static String reverseString(String s) {
        char[] sArray = s.toCharArray();
        int i = 0;
        int j = s.length() -1;
        while (j>=i) {
            swap(sArray,i++,j--);
        }

        return String.valueOf(sArray);
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
