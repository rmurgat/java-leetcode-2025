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

    public void printingHouseRobber() {
        ListBundle01 lib = new ListBundle01();
        System.out.println(" [ 198. House Robber ]");
        System.out.println(" Answer 1: " + lib.rob_1(new int[] {1,2,3,1}));
        System.out.println(" Answer 2: " + lib.rob_1(new int[] {2,7,9,3,1}));
        System.out.println(" Answer 3: " + lib.rob_1(new int[] {2,1,1,2}));
        System.out.println(" Answer 4: " + lib.rob_1(new int[] {5,1,2,10,6,2,7,9,3,1}) + "\n");
    }

    public void printingHouseRobberII() {
        ListBundle01 lib = new ListBundle01();  
        System.out.println(" [ 213. House Robber II ]");      
        System.out.println(" Answer 1: " + lib.robII_1(new int[] {2,9,8,3,6}));
        System.out.println(" Answer 2: " + lib.robII_1(new int[] {1,2,3,1}));
        System.out.println(" Answer 3: " + lib.robII_1(new int[] {2,1,1,2}));
        System.out.println(" Answer 3: " + lib.robII_1(new int[] {1}));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MenuPractice2 app = new MenuPractice2();
        System.out.println(" [ MENU PRACTICE 2 ]");
        System.out.println("1. Valid Palindrome ");
        System.out.println("2. Reverse Linked List (LC#206)");
        System.out.println("3. House Robber (LC#198)");
        System.out.println("4. House Robber II (LC#213)");
        int opc = scan.nextInt();
        switch(opc) {
            case 1: app.printingPalindrome(); break;
            case 2: app.printingLinkedListReversed(); break;
            case 3: app.printingHouseRobber(); break;
            case 4: app.printingHouseRobberII(); break;
            default:
                System.out.println(" Option not allowed");
        }
        scan.close();
    }
}
