import java.util.Scanner;

import solutions.ListBundle01;

public class MenuPractice2 {

    public void printingPalindrome() {
        ListBundle01 lib = new ListBundle01();
        String str = "Was it a car or a cat I saw?";
        System.out.println(" [ Valid Palindrome ] ");
        System.out.println("Answer 1: " + (lib.isPalindrome(str)?"true":"false"));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MenuPractice2 app = new MenuPractice2();
        System.out.println(" [ MENU PRACTICE 2 ]");
        System.out.println("1. Valid Palindrome ");
        int opc = scan.nextInt();
        switch(opc) {
            case 1: app.printingPalindrome(); break;
            default:
                System.out.println(" Option not allowed");
        }
        scan.close();
    }
}
