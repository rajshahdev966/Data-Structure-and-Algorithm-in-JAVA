
import java.util.Scanner;

// package Patterns;
public class patterns {

    static void pattern1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern9() {
        pattern7();
        pattern8();
    }

    static void pattern10() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag;
        for (int i = 1; i <= num; i++) {
            flag = !(i % 2 == 0);
            for (int j = 1; j <= i; j++) {
                System.out.print(flag ? 1 : 0);
                flag = !flag;
            }
            System.out.println();
        }
    }

    static void pattern12() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (num - i); k++) {
                System.out.print(" ");

            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    static void pattern13() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numToPrint = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numToPrint + " ");
                numToPrint++;
            }
            System.out.println();
        }
    }

    static void pattern14() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            char chToPrint = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(chToPrint);
                chToPrint++;
            }
            System.out.println();
        }
    }

    static void pattern15() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            char chToPrint = 'A';
            for (int j = i; j >= 1; j--) {
                System.out.print(chToPrint);
                chToPrint++;
            }
            System.out.println();
        }
    }

    static void pattern16() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char chToPrint = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(chToPrint);
            }
            chToPrint++;
            System.out.println();
        }
    }
    static void pattern17() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (((2* i)-1)/2) + 1; k++) {
                char chToPrint = 'A';
                System.out.print(chToPrint);
                chToPrint++;
            }
            for (int l = i - 1; l >= 1; l--) {
                char chToPrint = 'A';
                chToPrint += i - 1;
                System.out.print(chToPrint);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        pattern17();
        // pattern18();
        // pattern19();
        // pattern20();
    }
}
