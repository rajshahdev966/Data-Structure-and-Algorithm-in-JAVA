import java.lang.String;
import java.util.Scanner;

public class allLoopsQues {

  static void numNto1() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + num * i);
    }
  }

  static void sumN() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  static void sumEO() {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int sumEven = 0;
    int sumOdd = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sumEven += i;
      } else {
        sumOdd += i;
      }
    }
    System.out.println(sumEven);
    System.out.println(sumOdd);
  }

  static void factors() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print("1 ");
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      } else {
        continue;
      }
    }
    System.out.print(num);
  }

  static void factorSum() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 1;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        sum += i;
      } else {
        continue;
      }
    }
    System.out.println(sum);
    sc.close();
  }

  static void xDivisors() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // Number till which I have to search
    int x = sc.nextInt(); // Number of divisors

    int countWithX = 0;
    for (int i = 1; i <= n; i++) {
      int divisorsOfNum = 1;
      for (int j = 1; j <= i / 2; j++) {
        if (i % j == 0) {
          divisorsOfNum++;
        }
      }
      if (divisorsOfNum == x) {
        countWithX++;
      }
    }
    System.out.println(countWithX);
    sc.close();
  }

  static void fibonacci() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int prev = 0;
    int current = 1;
    int next = 0;
    for (int i = 1; i <= num; i++) {
      System.out.print(prev + " ");

      next = prev + current;
      prev = current;
      current = next;
    }
  }

  static void primeFactors() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    while (num % 2 == 0) {
      System.out.print(2 + " ");
      num /= 2;
    }
    for (int i = 3; i * i <= num; i += 2) {
      while (num % i == 0) {
        System.out.print(i + " ");
        num /= i;
      }
    }
    if (num > 1) System.out.print(num);
  }

  static void sumEvenFib() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    int next = 0;
    int sum = 0;
    for (int i = 2; i <= 2 * n + 1; i++) {
      next = a + b;
      a = b;
      b = next;
    }
    System.out.println(b - 1);
  }

  static void sepDigits() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    while (num > 0) {
      int digi = num % 10;
      num /= 10;
      System.out.println(digi);
    }
  }

  static void sumDigits() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    System.out.println(sum);
  }

  static void revDigits() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    while (num > 0) {
      System.out.print(num % 10);
      num /= 10;
    }
  }

  static void checkPalindrome() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int original = num;
    int revNum = 0;
    while (num > 0) {
      revNum = revNum * 10 + (num % 10);
      num /= 10;
    }
    if (revNum == original) System.out.println("Palindrome");
    else System.out.println("Not a Palindrome");
  }

  static void checkPalinApp2() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println("Not a Palindrome");
    } else {
      int reversedHalf = 0;
      while (num > reversedHalf) {
        reversedHalf = reversedHalf * 10 + (num % 10);
        num /= 10;
      }
      System.out.println(
        reversedHalf == num || reversedHalf == num / 10
          ? "Palindrome"
          : "Not a Paalindrome"
      );
    }
  }

  static void checkStrong() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int original = num;
    if (num < 0) System.out.println("No");
    else {
      int sum = 0;
      while (num > 0) {
        int digi = num % 10;
        int fact = 1;
        for (int i = 1; i <= digi; i++) {
          fact *= i;
        }
        sum += fact;
        num /= 10;
      }
      System.out.println(sum == original ? "Yes" : "No");
    }
  }

  static void checkStrongApp2() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int original = num;
    if (num < 0) {
      System.out.println("No");
      return;
    }
    int sum = 0;
    int[] fact = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
    while (num > 0) {
      sum += fact[num % 10];
      num /= 10;
    }
    System.out.println(sum == original ? "Yes" : "No");
  }

  static void checkAutomorphic() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int original = num;
    int digiCount = 0;
    while (num > 0) {
      digiCount++;
      num /= 10;
    }
    System.out.println(
      (original * original) % Math.pow(10, digiCount) == original
    );
  }

  static void findHCF() {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int hcf = 0;
    for (int i = 1; i <= Math.min(num1, num2); i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        if (i > hcf) {
          hcf = i;
        }
      }
    }
    System.out.println(hcf);
  }

  static void findHF() {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int hcf = 0;
    for (int i = 1; i <= Math.min(num1, num2); i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        if (i > hcf) {
          hcf = i;
        }
      }
    }
    System.out.println(hcf);
  }

  static void checkHarshad() {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int original = num1;
    int sumdigi = 0;
    while (num1 > 0) {
      sumdigi += num1 % 10;
      num1 = num1 / 10;
    }
    System.out.println(original % sumdigi == 0 ? "Yes" : "No");
  }

  static void checkPerfectSq() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    double root = Math.sqrt(num);
    if (root == (int) root) System.out.println("Yes");
    else System.out.println("No");
  }

  static void checkAbu() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sumDiv = 1;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        sumDiv += i;
        if (i != num / i) {
          sumDiv += num / i;
        }
      }
    }
    System.out.println(sumDiv > num ? "Yes" : "No");
  }

  static void checkNeon() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sq = num * num;
    int sumOfSq = 0;
    while (sq > 0) {
      sumOfSq += sq % 10;
      sq = sq / 10;
    }
    System.out.println(sumOfSq == num ? "Yes" : "No");
  }

  static void checkISBN() {
    Scanner sc = new Scanner(System.in);
    String isbn = sc.next();
    if (isbn.length() != 10) {
      System.out.println(false);
      return;
    }
    long sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i * (isbn.charAt(i - 1) - '0'); // This - '0' converts the char value to int
    }
    System.out.println(sum % 11 == 0);
  }

  //    static void numberGuess () {
  //        Scanner sc = new Scanner(System.in);
  //        int n = sc.nextInt();
  //        int random = (int)(Math.random() * n);
  //        int num = sc.nextInt();
  //        if(num == random) {
  //            return 0;
  //        };
  //        else if(num > random) {
  //            return 1;
  //        }
  //        if(num < random) {
  //            return -1;
  //        }
  //
  //    }

  static void printWeekDays() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    switch (n) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Firday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunday");
      default -> System.out.println("Invalid Output");
    }
  }

  static void checkVowel() {
    Scanner sc = new Scanner(System.in);
    char ch = Character.toLowerCase(sc.next().charAt(0));
    if (!Character.isLetter(ch)) {
      System.out.println("Not a letter");
      return;
    }
    switch (ch) {
      case 'a', 'i', 'e', 'o', 'u' -> System.out.println("Vowel");
      default -> System.out.println("Consonant");
    }
  }

  static void areaCalc() {
    Scanner sc = new Scanner(System.in);
    String shape = sc.next().toLowerCase();
    switch (shape) {
      case "circle" -> {
        double r = sc.nextInt();
        if (r <= 0) {
          System.out.println("Invalid Input");
          return;
        }
        System.out.println(Math.PI * r * r);
      }
      case "rectangle" -> {
        double a = sc.nextInt();
        double b = sc.nextInt();
        if (a <= 0 || b <= 0) {
          System.out.println("Invalid Input");
          return;
        }
        System.out.println(a * b);
      }
      case "triangle" -> {
        double l = sc.nextInt();
        double h = sc.nextInt();
        if (l <= 0 || h <= 0) {
          System.out.println("Invalid Input");
          return;
        }
        System.out.println(0.5 * l * h);
      }
      default -> System.out.println("Invalid Shape");
    }
  }

  public static void main() {
    //        sumEO();
    //factors();
    //factorSum();
    //xDivisors();
    //        fibonacci();
    //        primeFactors();
    //        sumEvenFib();
    //    sepDigits();
    //sumDigits();
    //        revDigits();
    //checkPalindrome();
    //checkStrong();
    //    checkStrongApp2();
    //        checkAutomorphic();
    //findHCF();
    //checkHarshad();
    //checkPerfectSq();
    //checkAbu();
    //checkNeon();
    //checkISBN();
    //printWeekDays();
    //checkVowel();
    areaCalc();



  }
}
