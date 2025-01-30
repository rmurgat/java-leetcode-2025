import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import solutions.ListBundle01;

class MenuPractice1 {

    public void printingContainsDuplicate() {
        ListBundle01 lib = new ListBundle01();
        System.out.println(" [ 217. Contains Duplicate ]");
        System.out.println(" Answer 1: " + (lib.hasDuplicate_1(new int[] {1, 2, 3, 3})?"true":"false"));
        System.out.println(" Answer 2: " + (lib.hasDuplicate_2(new int[] {1, 2, 3, 3})?"true":"false"));
        System.out.println(" Answer 3: " + (lib.hasDuplicate_3(new int[] {1, 2, 3, 3})?"true":"false"));
        System.out.println(" Answer 4: " + (lib.hasDuplicate_3(new int[] {1, 2, 3, 4})?"true":"false"));
    }

    public void printingSumTwo() {
        ListBundle01 lib = new ListBundle01();
        System.out.println(" [1. Two Sum ] ");
        System.out.printf(" Answer 1: ");
        int[] res = lib.twoSum(new int[] {2,7,11,15}, 9);
        if (res != null)
            for (int i: res) 
                System.out.printf(" %d \n", i);
        else
            System.out.println("null returned");
    }
    public void printingValidAnagram() {
        ListBundle01 lib = new ListBundle01();
        System.out.println(" [ 242. Valid Anagram ]");
        System.out.println(" Answer 1 :" + (lib.isAnagram("anagram","nagaram")? "true":"false"));
        System.out.println(" Answer 1 :" + (lib.isAnagram("angram","nagaram")? "true":"false"));
    }

    public void printingGroupAnagram() {
        ListBundle01 lib = new ListBundle01();
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(" Answer 1 :" + lib.groupAnagrams(input));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MenuPractice1 app = new MenuPractice1();
        System.out.println("Menu Practice Java No. 1");
        System.out.println("1. Two Sum (LC#1)                         21. Maximum Number of Ballons (LC#1189)      41. Koko Eating Bananas (LC#875)");
        System.out.println("2. Contains Duplicate (LC#217)            22. Word Patten (LC#290)                     42. Reverse Linked List (LC#206)");
        System.out.println("3. Valid Anagram (LC#242)                 23. Design HashSet (LC#705)                  43. Merge Two Sorted List (LC#21)");
        System.out.println("4. Group Anagram (LC#49)                  24. Design HashMap (LC#706)                  44. Linked List Cycle Detection (LC#141)");
        System.out.println("5. Replace Elements (LC#1299)             25. Two Integer Sum II (LC#167)              45. Reorder Linked List (LC#143)");
        System.out.println("6. Is Sequence (LC#392)                   26. Longest Consecutive Sequence (LC#128)    46. Remove Node From End of Linked List (LC#19)");
        System.out.println("7. Length of Last Word (LC#58)            27. Trapping Rain Water (LC#42)              47. Copy Linked List with Random Pointer(LC#138)");
        System.out.println("8. Longest Common prefix (lc#14)          28. Best Time to Buy and Sell Stock (LC#121) 48. Find Minimum in Rotated Sorted Array(LC#153)");
        System.out.println("9. Top K Frequent Element (LC#347)        29. Longest substr Without Rep Chars(LC#3)   49. Search in Rotated Sorted Array (LC#33)");
        System.out.println("10. Encode and Decode String (neetcode)   30. Longest Repeat Char Replacement (LC#424) 50. Invert Binary Tree (LC#226)");
        System.out.println("11. Product of Array Except Self (LC#238) 31. Valid Parentheses (LC#20)                51. Maximum Depth of Binary Tree (LC#111)");
        System.out.println("12. Pascal's Triangle (LC#118)            32. Minimum Stack (LC#155)                   52. Diameter of Binary Tree (LC#543)");
        System.out.println("13. Unique Email Addresses (LC#929)       33. Generate Parentheses (LC#22)             53. Balanced Binary Tree (LC#110)");
        System.out.println("14. Isomorphic String (LC#205)            34. Daily Temperatures (LC#739)              54. Subtree of Another Tree (LC#572)");
        System.out.println("15. Can Place Flowers (LC#605)            35. Binary Search (LC#704)                   55. Valid Sudoku (LC#36)");
        System.out.println("16. Majority Element (LC#169)             36. Search a 2D Matrix (LC#74)               56. Sliding Window Maximum (LC#239)");
        System.out.println("17. Next Greater Element I (LC#496)       37. Evaluate Reverse Polish Notation(LC#150) 57. Car Fleet (LC#853)");
        System.out.println("18. Find Pivot Index (LC#724)             38. Permutation in String (LC#567)           58. Time Based Key-Value Store (LC#981)");
        System.out.println("19. Sum Numpy Array Range (LC#303)        39. Minimum Window Substring                 59. Copy Linked List with Random Pointer(LC#138)");
        System.out.println("20. Find All Numbers Disappeared (LC#448) 40. Monotonic Stack (practice)               60. Find the Duplicate Number (LC#287)");
    
        int opc = keyboard.nextInt();
        switch (opc) {
            case 1: app.printingSumTwo(); break;
            case 2: app.printingContainsDuplicate(); break;
            case 3: app.printingValidAnagram(); break;
            case 4: app.printingGroupAnagram(); break;

            default: break;
        }
        keyboard.close();
    }

}