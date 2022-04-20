import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");

        int liczba1 = scanner.nextInt();
        System.out.println("Podana pierwsza liczba to: " + liczba1);

        System.out.println("Podaj drugą liczbę");

        int liczba2 = scanner.nextInt();
        System.out.println("Podana druga liczba to: " + liczba2);

        int addiction = liczba1 + liczba2;
        int substraction = liczba1 - liczba2;
        int multiplication = liczba1 * liczba2;
        float division = liczba1 / liczba2;
        int mod = liczba2%liczba1;

        System.out.println("Wynik dodawanie: " + addiction);
        System.out.println("Wynik odejmowanie: " + substraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + mod);


    }
}
