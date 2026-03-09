import java.util.Scanner;

public class Ex3 {
    static void main() {
        rectanglePerimeter();
    }

    static void rectanglePerimeter() {
        Scanner watcher = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del lato e lungo e del lato corto del rettangolo separate da un a capo");
        double side1 = Double.parseDouble(watcher.nextLine());
        double side2 = Double.parseDouble(watcher.nextLine());
        System.out.println("Ora inserisci l'unità di misura");
        String unitOfMeasurement = watcher.nextLine();
        System.out.println("Il perimetro è " + (side1 * 2 + side2 * 2) + " " + unitOfMeasurement);


    }
}
