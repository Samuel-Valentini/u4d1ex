import java.util.Scanner;

public class Ex3 {
    static void main() {
        rectanglePerimeter();

        Scanner watcher = new Scanner(System.in);
        System.out.println("Inserisci un numero, riceverai 0 se pari o 1 se dispari");
        int num = Integer.parseInt(watcher.nextLine());
        System.out.println(evenOdd(num));
        System.out.println("Inserisci 3 lati di un triangolo e verrà calcolata l'area, un lato per riga, anche dotato di decimali");
        double s1 = Double.parseDouble(watcher.nextLine());
        double s2 = Double.parseDouble(watcher.nextLine());
        double s3 = Double.parseDouble(watcher.nextLine());
        System.out.println("Ora inserisci l'unità di misura");
        String unitOfMeasurement = " " + watcher.nextLine();
        System.out.println("L'area è: " + triangleArea(s1, s2, s3) + unitOfMeasurement);


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

    static int evenOdd(int num) {
        return num % 2;
    }

    static double triangleArea(double s1, double s2, double s3) {

        double semiperimeter = (s1 + s2 + s3) / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - s1) * (semiperimeter - s2) * (semiperimeter - s3));
    }
}
