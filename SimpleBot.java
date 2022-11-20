package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        pozdrav("Kamilator", "2022");
        zadejJmeno();
        uhodniVek();
        pocitej();
        test();

    }

    static void pozdrav(String botJmeno, String rokVytvoreni) {
        System.out.println("Ahoj! Me jmeno je " + botJmeno + ".");
        System.out.println("Byl jsem vytvoren " + rokVytvoreni + ".");
        System.out.println("Jak se jmenujes ty?");
    }

    static void zadejJmeno() {
        String name = scanner.nextLine();
        System.out.println("Rad te poznavam, " + name + "!");
    }

    static void uhodniVek() {
        System.out.println("Schvalne , kolik ti asi je.");
        System.out.println("Zadej zbytky po deleni tveho veku 3, 5 a 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Je ti " + age + "; To je spravny cas zacit programovat!");
    }

    static void pocitej() {
        System.out.println("Ted ti ukazu , ze umim pocitat do jakehokoliv cisla.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        int odpoved;
        System.out.println("Jdeme otestovat tvoji znalost programovani.");
        System.out.println("Proc pouzivame metody?");
        System.out.println("1. Abychom opakovali prikaz vicekrat.");
        System.out.println("2. Abychom rozlozili program na nekolik malych podprogramu.");
        System.out.println("3. Abychom urcili dobu provedeni programu.");
        System.out.println("4. Abychom prerusili provadeni programu");

        do {
          odpoved = scanner.nextInt();
          if (odpoved != 2) {
              System.out.println("Spatne , zkus to znovu");

          } else {
              konec();
          }
        } while (odpoved != 2);





    }

    static void konec() {
        System.out.println("Vyborne , preju hezky den!");
    }
}
