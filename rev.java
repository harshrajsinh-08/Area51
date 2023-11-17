import java.util.Scanner;

public class rev {

    public static String revstr(String str) {
        char[] charArray = str.toCharArray();
        char[] revarr = new char[charArray.length];
        for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
            revarr[j] = charArray[i];
        }
        return new String(revarr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpstr = sc.nextLine();
        String reversedString = revstr(inpstr);

        System.out.println("Original String: " + inpstr);
        System.out.println("Reversed String: " + reversedString);
    }

}
