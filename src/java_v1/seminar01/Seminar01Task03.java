package java_v1.seminar01;

public class Seminar01Task03 {
    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";
        String s4 = "EPY2giL";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
        System.out.println(reverseWords(s3));
        System.out.println(reverseWords(s4));
    }
    public static String reverseWords(String s) {
        if(s.lastIndexOf(" ") == -1) return s;
        String delSpace = s.trim().replaceAll("\\s+", " ");
        String result = "";
        int indStart = delSpace.lastIndexOf(" ");
        int indStop = delSpace.length();
        while (indStart > (delSpace.indexOf(" ") - 1)) {
            String word = delSpace.substring(indStart, indStop);
            result = result + word;
            indStop = indStart;
            indStart = delSpace.lastIndexOf(" ", indStart - 1);
        }
        return result.trim() + " " + delSpace.substring(0, delSpace.indexOf(" "));
    }
}
