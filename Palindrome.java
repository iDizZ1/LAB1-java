import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        in.nextLine();
        for (int i = 0; i<c; i++)
        {
            String word = in.nextLine();
            System.out.println(isPalindrome(word));
        }
    }
    public static String reverseString(String s)
    {
        StringBuilder revs = new StringBuilder();
        int l = s.length();
        for (int i = l-1; i >= 0; i--)
        {
            revs.append(s.charAt(i));
        }
        return revs.toString();
    }
    public static boolean isPalindrome(String s)
    {
        String revs = reverseString(s);
        return (s.equals(revs));
    }
}