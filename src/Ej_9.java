import java.util.Scanner;

public class Ej_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P1, P2;
        int L1, L2;
        System.out.print("Palabra 1: ");
        P1 = sc.nextLine();
        System.out.print("Palabra 2: ");
        P2 = sc.nextLine();
        L1 = P1.length();
        L2 = P2.length();
        if (L1 > L2){
            System.out.print("La Palabra " + P1 + " tiene " + (L1-L2) + " letras mas que  " + P2);
        }else if (L2 > L1){
            System.out.print("La Palabra " + P2 + " tiene " + (L2-L1) + " letras mas que  " + P1);
        }else{
            System.out.print("Las dos palabras tienen el mismo largo");
        }
    }
}
