import java.util.Scanner;

public class freq {
    public static void main(String args[]) {
        String s;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        int l = s.length();
        System.out.println("Enter a character to find its frequency");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ch) {
                c++;
            }
        }
        System.out.println("the number of times the character " + ch + " appears in the string is " + c);
        sc.close();

    }

}
