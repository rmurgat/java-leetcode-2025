import java.util.Arrays;
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

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MenuPractice1 app = new MenuPractice1();
        System.out.println("Menu Practice Java No. 1");
        System.out.println("1. Sum Two (LC#1)");
        System.out.println("2. Contains Duplicate (LC#217)");
        System.out.println("3. Valid Anagram (LC#242)");
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
        
            default:
                break;
        }
        keyboard.close();
    }
}