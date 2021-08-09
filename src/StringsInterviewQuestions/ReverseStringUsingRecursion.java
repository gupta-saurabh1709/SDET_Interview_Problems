package StringsInterviewQuestions;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String s = "Saurabh";
        String output = "";
        System.out.println(reverseString(s, s.length() - 1, output));

    }

    public static String reverseString(String s, int len, String output) {
        if (len < 0) {
            return output;
        }
        output = output + s.charAt(len);
        return reverseString(s, len - 1, output);
    }

}
