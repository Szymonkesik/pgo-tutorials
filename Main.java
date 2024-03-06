import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = scanner.nextInt();

            if (liczba > 0) {
                System.out.println("Liczba jest dodatnia");
            } else if (liczba < 0) {
                System.out.println("Liczba jest ujemna");
            } else {
                System.out.println("Wartość równa się 0");
            }

            scanner.close();
        }

}
