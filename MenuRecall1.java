import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import solutions.TreeBundle01;
import solutions.TreeNode;
import solutions.LinkedListBundle01;
import solutions.ListBundle01;
import solutions.ListNode;
import solutions.StackBundle01;

class MenuRecall1 {


    public void playingArraysWith() {
        
    }

    public int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length-1, m=0;
        while (l<=r) {
            m = Math.floorDiv((l+r),2);
            if (nums[m]<target) {
                l = m + 1;
            } else if(nums[m]>target) {
                r = m - 1;
            } else 
                return m;
        }
        return -1;
    }

    public int[] twoPointersSum(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while (l<r){
            int sum = nums[l]+nums[r];
            if (sum == target) {
                return new int[]{l+1,r+1};
            } 
            if (sum < target) 
                l ++;
            else 
                r --;
        }
        return new int[0];
    }

    public void sortIntArray(int[] arr) {
        int min = 0;
        for(int i=0; i<arr.length; i++) {
            min = i;
            for(int j=i+1; j<arr.length; j++)
                if (arr[j]<arr[min]) 
                    min = j;
            //swap values
            int fix = arr[i];
            arr[i] = arr[min];
            arr[min] = fix;
        }

    }

    public void sortString(String[] strs) {
        int min = 0;
        for(int i=0; i<strs.length; i++) {
            min = i;
            for(int j=i+1; j<strs.length; j++)
                if (strs[j].compareTo(strs[min])<0) 
                    min = j;
            //swap values
            String fix = strs[i];
            strs[i] = strs[min];
            strs[min] = fix;
        }
    }

    public void printingBinarySearch() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(" Binary Search ");
        int ans = binarySearch(nums, 14);
        if (ans>=0)
            System.out.println("value located in index:" + ans + ", " + nums[ans]);
        else 
            System.out.println("value no-located");
    }

    public void printingTwoPointers() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(" Two Integer Sum II ");
        int[] ans = twoPointersSum(nums, 4);
        Arrays.stream(ans).forEach(n->System.out.printf("val: %d",n));
    }

    public void printingSortingArray() {
        String[] strs = new String[] {"fredy", "javier", "eduardo", "francisco", "pedro", "ernesto", "xavier", "rodrigo", "arturo"};
        int[] nums = new int[]{16,18,6,12,13,1,2,3,4,5,14,15,7,17,8,9,10,11};
        String[] strs1 = strs.clone();
        Arrays.sort(strs);
        sortString(strs1);
        System.out.println(" Sorting Array(String) by Arrays lib: ");
        Arrays.stream(strs).forEach(x->System.out.println(x));
        System.out.println(" Sorting Array(String) by me: ");
        Arrays.stream(strs1).forEach(x->System.out.println(x));
        sortIntArray(nums);
        System.out.println(" Sorting Array(int) by me: ");
        Arrays.stream(nums).forEach(n->System.out.println(n));
    }

    public void printingTraversingBTree() {
        TreeBundle01 lib = new TreeBundle01();
        TreeNode head = lib.insertInOrder(new int[]{16,18,6,12,13,1,2,3,4,5,14,15,7,17,8,9,10,11});
        System.out.println(" [ Traversing bTree ]");
        System.out.println("original:");
        lib.prettyTree(head);
        System.out.print(" pre-Order: ["); lib.printPreOrder(head);
        System.out.print("]\n post-Order: ["); lib.printPostOrder(head);
        System.out.print("]\n in-Order: ["); lib.printInOrder(head);
        System.out.println("]");
    }

    public void printingTraversingLinkedlist() {
        LinkedListBundle01 lib = new LinkedListBundle01();
        ListNode head = lib.addArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(" [ Traversing linkedlist ]");
        System.out.print("linkedlist content: ["); lib.printLinkedList(head); System.out.println("]");
    }

    public void printingUsingStacks() {
        StackBundle01 lib = new StackBundle01();
        System.out.println(" [ Using Stacks ]");
        System.out.println("Answer 1: " + (lib.isValidParentheses("([{}])")?"true":false));
        System.out.println("Answer 2: " + (lib.isValidParentheses("[(])")?"true":false));
    }

    public void printingMonotaticStack() {
        StackBundle01 lib = new StackBundle01();
        System.out.println("Monotonic (increasing Stack): ");
        Stack<Integer> stack1 = lib.getMonotonicIncreasingStack(new int[]{1,7,9,5,4,8});
        lib.printingIntegerStack(stack1);
        System.out.println("Monotonic (decreasing Stack): ");
        Stack<Integer> stack2 = lib.getMonotonicDecreasingStack(new int[]{6,3,1,5,6,2});
        lib.printingIntegerStack(stack2);
    }

    public void printingHouseRobber() {
        ListBundle01 lib = new ListBundle01();
        System.out.println(" Answer 1 : " + lib.rob_0(new int[] {1,2,3,1}));
        System.out.println(" Answer 2 : " + lib.rob_0(new int[] {2,7,9,3,1}));
        System.out.println(" Answer 3 : " + lib.rob_0(new int[] {2,1,1,2}));
        System.out.println(" Answer 4 : " + lib.rob_0(new int[] {5,1,2,10,6,2,7,9,3,1}) + "\n");        
        System.out.println(" Answer 5 : " + lib.rob_1(new int[] {1,2,3,1}));
        System.out.println(" Answer 6 : " + lib.rob_1(new int[] {2,7,9,3,1}));
        System.out.println(" Answer 7 : " + lib.rob_1(new int[] {2,1,1,2}));
        System.out.println(" Answer 8 : " + lib.rob_1(new int[] {5,1,2,10,6,2,7,9,3,1}) + "\n");
        System.out.println(" Answer 9 : " + lib.rob_2(new int[] {1,2,3,1}));
        System.out.println(" Answer 10 : " + lib.rob_2(new int[] {2,7,9,3,1}));
        System.out.println(" Answer 11 : " + lib.rob_2(new int[] {2,1,1,2}));
        System.out.println(" Answer 12 : " + lib.rob_2(new int[] {5,1,2,10,6,2,7,9,3,1}) + "\n");
        System.out.println(" Answer 13 : " + lib.rob_3(new int[] {1,2,3,1}));
        System.out.println(" Answer 14 : " + lib.rob_3(new int[] {2,7,9,3,1}));
        System.out.println(" Answer 15 : " + lib.rob_3(new int[] {2,1,1,2}));
        System.out.println(" Answer 16 : " + lib.rob_3(new int[] {5,1,2,10,6,2,7,9,3,1}));

    }

    public void printingZigzagInArray() {
    }

    public static void main(String[] ars) {
        Scanner scan = new Scanner(System.in);
        MenuRecall1 app = new MenuRecall1();
        System.out.println("[ Menu Java Collection ]              [ Menu Algoritms ]              [ My Challenge ]");
        System.out.println("1. basic Array                        20. Binary Search               40. House Robber");
        System.out.println("2. basic Matrix                       21. Two Pointers                41. ");
        System.out.println("3. basic collection HashTable         22. Sort Array ");
        System.out.println("4. basic collection Stack             23. Usings Stacks ");
        System.out.println("5. basic collection Queue             24. Traversing Linkedlist ");
        System.out.println("6. basic collection Set               25. Traversing btree ");
        System.out.println("7. basic collection Dequeue           26. Monotonic Stack ");
        System.out.println("8. basic collection EnumSet           27. Zigzag in Array ");
        System.out.println("9. basic collection LinkedList");
        System.out.println("10. basic collection Tree");
        System.out.println("11. basic collection HashTable");
        System.out.println("12. basic collection HashSet");
        System.out.println("13. basic collection Heap");


        int opc = scan.nextInt();
        switch(opc) {
            case 1: app.playingArraysWith(); break;

            case 20: app.printingBinarySearch(); break;
            case 21: app.printingTwoPointers(); break;
            case 22: app.printingSortingArray(); break;
            case 23: app.printingUsingStacks(); break;
            case 24: app.printingTraversingLinkedlist(); break;
            case 25: app.printingTraversingBTree(); break;
            case 26: app.printingMonotaticStack(); break;
 

            case 40: app.printingHouseRobber(); break;

            default: 
                System.out.println("Not option recognized");
        }
        scan.close();
    }

}