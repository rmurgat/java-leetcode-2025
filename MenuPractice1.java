import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import solutions.ListBundle01;

class MenuPractice1 {

    public void printingSumTwo() {
        ListBundle01 lib = new ListBundle01();
        int[] array = new int[] {2,7,11,15};
        System.out.println("[ Printing Sum Two ]");
        System.out.println("Sum Two: " + Arrays.toString(lib.twoSum(array, 9)) );
    }

    public void printingContainsDuplicate() {
        ListBundle01 lib = new ListBundle01();
        int[] array = new int[] {2,7,11,15};
        System.out.println("[ Printing Contains Duplicate ]");
        System.out.println("Answer No.1: " + lib.hasDuplicate(array) );
        array = new int[] {2,7,11,11,15};
        System.out.println("Answer No.2: " + lib.hasDuplicate(array) );
    }

    public void printingValidAnagram() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Valid Anagram ]");
        System.out.println("Answer No. 1: " + lib.isAnagram("anagram", "nagaram"));
    }

    public void printingGroupAnagram() {
        ListBundle01 lib = new ListBundle01();
        String[] input =  {"eat","tea","tan","ate","nat","bat"};
        System.out.println("[ Group Anagram ]");
        List<List<String>> res = lib.groupAnagrams(input);
        System.out.println("Answer No. 1: ");
        res.forEach(System.out::println);
    }

    public void printingReplaceElement() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Replace Elements ]");
        System.out.println("Answer No. 1: ");
        int[] input = new int[] {17,18,5,4,6,1};
        int[] ans = lib.replaceElements(input);
        Arrays.stream(ans).forEach(x->System.out.printf("%d,",x));
    }
    public void printingIsSubsequence() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Is Subsequence ]");
        System.out.println("Answer No. 1: " + lib.isSubsequence("abc", "ahbgdc"));
    }
    public void printingLengthLastWord() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Length of Last Word ]");
        System.out.printf("Answer No. 1: %d\n", lib.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.printf("Answer No. 2: %d\n", lib.lengthOfLastWord("Hello World"));
        System.out.printf("Answer No. 3: %d\n", lib.lengthOfLastWord("luffy is still joyboy"));
        System.out.printf("Answer No. 4: %d\n", lib.lengthOfLastWord("luffy"));
        System.out.printf("Answer No. 5: %d\n", lib.lengthOfLastWord(""));
    }
    public void printingLongestCommonPrefix() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Longest Common Prefix ]");
        System.out.println ("Answer No. 1, type=1: " + lib.longestCommonPrefix_1(new String[] {"flower","flow","flight"}));
        System.out.println ("Answer No. 2, type=1: " + lib.longestCommonPrefix_1(new String[] {"dog","racecar","car"}));
        System.out.println ("Answer No. 3, type=1: " + lib.longestCommonPrefix_1(new String[] {"car"}));
        System.out.println ("Answer No. 4, type=1: " + lib.longestCommonPrefix_1(new String[] {""}));
        System.out.println ("Answer No. 1, type=2: " + lib.longestCommonPrefix_2(new String[] {"flower","flow","flight"}));
        System.out.println ("Answer No. 2, type=2: " + lib.longestCommonPrefix_2(new String[] {"dog","racecar","car"}));
        System.out.println ("Answer No. 3, type=2: " + lib.longestCommonPrefix_2(new String[] {"car"}));
        System.out.println ("Answer No. 4, type=2: " + lib.longestCommonPrefix_2(new String[] {""}));
    }
    public void printingTopKFequentElement() {
        ListBundle01 lib = new ListBundle01();
        System.out.println("[ Top K Frequent Element ]");
        System.out.println (" Answer 1, type 1 [");
        int[] res1 = lib.topKFrequent(new int[] {1,1,1,2,2,3},2);
        Arrays.stream(res1).forEach(System.out::println);
        System.out.println ("] Answer 2, type 1 [");
        int[] res2 = lib.topKFrequent(new int[] {1},1);
        Arrays.stream(res2).forEach(System.out::println);
    }

    public void printingEncodeDecodeStrArray() {
        ListBundle01 lib = new ListBundle01();
        List<String> a = new ArrayList<>( List.of("neet","code","love","you"));

        System.out.println(" [ Encode Decode String Array ]");
        String encoded = lib.encode(a);
        System.out.println(" Encode : " + lib.encode(a));
        List<String> d = lib.decode(encoded);
        for (String s: d) {
            System.out.println(s);
        }
    }

    public void printingArrayExceptSelf() {
        ListBundle01 lib = new ListBundle01();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(" [ Array Except Self ]");
        int[] ans = lib.productExceptSelf(nums);
        System.out.println(" Answer No. 1: ");
        for(int i = 0; i<ans.length; i++) { 
            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MenuPractice1 app = new MenuPractice1();
        System.out.println("Menu Practice Java No. 1");
        System.out.println("1. Sum Two (LC#1)");
        System.out.println("2. Contains Duplicate (LC#217)");
        System.out.println("3. Valid Anagram (LC#242)");
        System.out.println("4. Group Anagram (LC#49)");
        System.out.println("5. Replace Elements (LC#1299)");
        System.out.println("6. Is Subsequence (LC#392)");
        System.out.println("7. Length of Last Word (LC#58)");
        System.out.println("8. Longest Common Prefix (LC#14)");
        System.out.println("9. Top K Frequent Element");
        System.out.println("10. Encode and Decode String (neetcode)");
        System.out.println("11. Product of Array Except Self (LC#238)");
        int opc = keyboard.nextInt();
        switch (opc) {
            case 1:
                app.printingSumTwo();
                break;
            case 2:
                app.printingContainsDuplicate();
                break;
            case 3:
                app.printingValidAnagram();
                break;
            case 4:
                app.printingGroupAnagram();
                break;
            case 5:
                app.printingReplaceElement();
                break;
            case 6: 
                app.printingIsSubsequence();
                break;
            case 7:
                app.printingLengthLastWord();
                break;
            case 8:
                app.printingLongestCommonPrefix();
                break;
            case 9: 
                app.printingTopKFequentElement();
                break;
            case 10:
                app.printingEncodeDecodeStrArray();
            case 11:
                app.printingArrayExceptSelf();
            default:
                break;
        }
        keyboard.close();
    }

}