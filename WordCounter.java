import java.util.HashSet;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        System.out.println("Enter the paragraph you need to count the words");
        Scanner sc = new Scanner(System.in);
        HashSet<String> list = new HashSet<>();
        String val = sc.nextLine();
        val = val + " ";
        String temp = "";
        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            if (c != ' ') {
                temp = temp + c;
            } else {
                list.add(temp);
                temp = "";
            }
        }
        count = list.size();
        System.out.println("Ignoring the repeated words it contains " + count + " words in the paragraph");
    }
}