import java.util.Scanner;

public class Ex2 {
    static void main() {
        threeStrings();
    }

    static void threeStrings() {
        Scanner watcher = new Scanner(System.in);
        System.out.println("Inserisci tre stringhe separate da un a capo");
        String first = watcher.nextLine();
        String second = watcher.nextLine();
        String third = watcher.nextLine();
        System.out.println(first + second + third);
        System.out.println(third + second + first);
        System.out.println("con gli spazi:");
        System.out.println(first + " " + second + " " + third);
        System.out.println(third + " " + second + " " + first);
    }
}
