import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        /*// potega, pogoda itp.
        int first = 4;
        int second = 6;
        double result = Math.pow(first, second);
        System.out.println(first + " do potęgi " + second + " = " + result);

        String adres = "ul. Wiejska 1";
        int lenght = adres.length();
        char lastChar = adres.charAt(lenght - 1);
        boolean isLastCharDigit = Character.isDigit(lastChar);
        System.out.println("Ostatni znak jest cyfrą: " + isLastCharDigit);

        //losowanie wartości
        System.out.println("----------------------------------------------");
        int percentage = (int)(Math.random() * 100);
        percentage += 30;
        percentage /= 2;
        percentage = percentage + 1;
        percentage += 1;
        percentage++;
        boolean isMoreThan50 = percentage >= 50;
        System.out.println("Jutro bedzie padać na " + percentage + "%");
        */
        /*
        int myInt = 7;
        myInt = myInt + 1;
        myInt += 1;
        myInt++;
        System.out.println("myInt = " + myInt);

        String myString = "My String";
        myString = myString + " !";
        myString += " !";
        System.out.println(myString);

        //zadanie 3 BMI
        int waga = 80;
        double wzrost = 1.80;
        double bmi = waga/Math.pow(wzrost,2);
        System.out.println("Wskaźnik bmi wynosi: " + bmi);
        boolean isAbove = bmi > 24.9;
        boolean isBelow = bmi < 18.5;
        System.out.println("Pacjent z nadwagą: " + isAbove);
        System.out.println("Pacjent z niedowagą: " + isBelow);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Program do wyznaczenia współczynnika BMI ---");
        System.out.println("Proszę podaj swoje imię: ");
        String name = scanner.nextLine();

        System.out.println("a teraz nazwisko: ");
        String lastname = scanner.nextLine();

        System.out.println("Hej " + name + " " + lastname + ", podaj proszę swój wiek: ");
        int age = Integer.parseInt(scanner.nextLine());
        boolean isAdult = age >= 18;
        System.out.println("Jesteś pełnoletni: " + isAdult);

        System.out.println("Podaj swój wzrost w [cm]: ");
        double height = Double.parseDouble(scanner.nextLine())/100.0;

        System.out.println("Podaj swoją wagę [kg]: ");
        double weight = Integer.parseInt(scanner.nextLine());

        double bmi = weight/Math.pow(height, 2);

        System.out.println("Twój wskaźnik BMI wynosi: " + bmi);
        System.out.println("\n--- Dziękuję za skorzystanie z programu! ---");
    }
}