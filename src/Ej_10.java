import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day;
        System.out.println("INGRESE SU FECHA DE NACIMIENTO");
        System.out.print("Día: ");
        day = sc.nextInt();
        System.out.print("Mes: ");
        month = sc.nextInt();
        System.out.print("Año: ");
        year = sc.nextInt();
        LocalDate Nacimiento = LocalDate.of(year,month,day);
        LocalDate Actual = LocalDate.now();
        long Edad = ChronoUnit.YEARS.between(Nacimiento, Actual);
        System.out.println("Usted tiene " + Edad + "Años");
    }
}
