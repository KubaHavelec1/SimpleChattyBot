package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Kamilator", "2022");
        tellMeYourName();
        guessAge();
        count();
        test();

    }

    static void greet(String botJmeno, String rokVytvoreni) {
        System.out.println("Hello! My name is " + botJmeno + ".");
        System.out.println("I was created " + rokVytvoreni + ".");
        System.out.println("What's your name?");
    }

    static void tellMeYourName() {
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        int answer;
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        do {
          answer = scanner.nextInt();
          if (answer != 2) {
              System.out.println("Please, try again.");

          } else {
              end();
          }
        } while (answer != 2);





    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
