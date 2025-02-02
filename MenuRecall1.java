import java.util.Arrays;
import java.util.Scanner;

import solutions.TreeBundle01;
import solutions.TreeNode;
import solutions.LinkedListBundle01;
import solutions.ListNode;
import solutions.StackBundle01;

class MenuRecall1 {

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

    public static void main(String[] ars) {
        Scanner scan = new Scanner(System.in);
        MenuRecall1 app = new MenuRecall1();
        System.out.println("[ Menu Recalling Java Collection ]    [ Menu Algoritms ]              [ My Challenge ]");
        System.out.println("1. basic collection Array             20. Binary Search               1. House Robber");
        System.out.println("2. basic collection List              21. Two Pointers                2. ");
        System.out.println("3. basic collection HashTable         22. Sort Array ");
        System.out.println("4. basic collection Stack             23. Usings Stacks ");
        System.out.println("5. basic collection Queue             24. Traversing Linkedlist ");
        System.out.println("6. basic collection Set               25. Traversing btree ");
        System.out.println("7. basic collection Dequeue           26. Monotonic Stack ");
        System.out.println("8. basic collection EnumSet           27. Braid in Array ");
        int opc = scan.nextInt();
        switch(opc) {
            case 20: app.printingBinarySearch(); break;
            case 21: app.printingTwoPointers(); break;
            case 22: app.printingSortingArray(); break;
            case 23: app.printingUsingStacks(); break;
            case 24: app.printingTraversingLinkedlist(); break;
            case 25: app.printingTraversingBTree(); break;
            default: 
                System.out.println("Not option recognized");
        }
        scan.close();
    }

}