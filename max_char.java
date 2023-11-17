import java.util.Scanner;

public class max_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpstr = sc.nextLine();


        char max = findmax(inpstr);
        System.out.println("The most frequent character is: " + max);
    }

    public static char findmax(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        char max = ' ';
        int maxfreq = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                max = (char) i;
            }
        }
        return max;
    }
}
