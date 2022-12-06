import java.util.Scanner;

class vccount {

    public static void main(String args[]) {
        String s;
        int vcount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        int l = s.length();
        s.toLowerCase();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            }
        }
        System.out.println("the number of vowels in the string is " + vcount);
        System.out.println("the number of consonants in the string is " + (l - vcount));
        sc.close();

    }
}