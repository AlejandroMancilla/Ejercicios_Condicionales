import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {
        double Nc, Nl, C1, C2, C3; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Nota Certamen 1: ");
        C1 = sc.nextDouble();
        System.out.print("Ingrese Nota Certamen 2: ");
        C2 = sc.nextDouble();
        System.out.print("Ingrese Nota Laboratorios: ");
        Nl = sc.nextDouble();
        Nc = (60 - (Nl * 0.3)) / 0.7;
        C3 = 3 * Nc - C1 - C2;
        System.out.println("Necesita Nota " + C3 + " en el Certamen 3");
    }
}
