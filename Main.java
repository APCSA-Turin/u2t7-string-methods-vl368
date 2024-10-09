import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scan.next();
        System.out.print("Enter second string: ");
        String str2 = scan.next();
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        }
        else if (str1.length() == str2.length()) {
            System.out.println("Both strings have the same length");
        }
        else {
            System.out.println(str2 + " is longer");
        }

        int temp = str1.length() / 2;
        String str1half1 = str1.substring(0,temp);
        String str1half2 = str1.substring(temp);
        temp = str2.length() / 2;
        String str2half1 = str2.substring(0,temp);
        String str2half2 = str2.substring(temp);
        System.out.println("First half: " + str1half1);
        System.out.println("Second half: " + str1half2);
        System.out.println("First half: " + str2half1);
        System.out.println("Second half: " + str2half2);

        int index = str1.indexOf(str2);
        if (index == -1) {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        else {
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }
        scan.close();
    }
}
