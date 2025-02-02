import java.util.Scanner;

import solutions.ListBundle01;
import solutions.ListNode;
import solutions.LinkedListBundle01;

public class MenuPractice2 {

    public void printingPalindrome() {
        ListBundle01 lib = new ListBundle01();
        String str = "Was it a car or a cat I saw?";
        System.out.println(" [ Valid Palindrome ] ");
        System.out.println("Answer 1: " + (lib.isPalindrome(str)?"true":"false"));
    }

    public void printingLinkedListReversed() {
        LinkedListBundle01 lib = new LinkedListBundle01();
        ListNode head = lib.addArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        ListNode reversed = lib.reverseList(head);
        System.out.print("Answer 1: ["); lib.printLinkedList(reversed); System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MenuPractice2 app = new MenuPractice2();
        System.out.println(" [ MENU PRACTICE 2 ]");
        System.out.println("1. Valid Palindrome ");
        System.out.println("2. Reverse Linked List (LC#206)");
        int opc = scan.nextInt();
        switch(opc) {
            case 1: app.printingPalindrome(); break;
            case 2: app.printingLinkedListReversed(); break;
            default:
                System.out.println(" Option not allowed");
        }
        scan.close();
    }
}
