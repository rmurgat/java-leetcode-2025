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

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MenuPractice1 app = new MenuPractice1();
        System.out.println("Menu Practice Java No. 1");
        System.out.println("1. Sum Two");
        int opc = keyboard.nextInt();
        switch (opc) {
            case 1:
                app.printingSumTwo();
                break;
        
            default:
                break;
        }
        keyboard.close();
    }
}