package Exception;

import java.util.*;

class excep {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value:");
        a = sc.nextInt();
        System.out.println("Enter the b value:");
        b = sc.nextInt();
        try {
            c = a / (a - b);
            System.out.println("a/b=" + c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
