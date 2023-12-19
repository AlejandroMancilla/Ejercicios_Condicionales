import java.util.Scanner;

public class Ej_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, Menor;
        String May, Men;
        System.out.print("Juegos Ganados por A: ");
        A = sc.nextInt();
        System.out.print("Juegos Ganados por B: ");
        B = sc.nextInt();
        if(A > B){
            Men = "B";
            May = "A";
        }else{
            Men = "A";
            May = "B";
        }
        Menor = (A > B) ? B : A;
        if(A == 7){
            if(B < 6){
                System.out.println("Invalido");
            }else{
                System.out.println("Ganó A");
            }
        }else if(B == 7){
            if(A < 6){
                System.out.println("Invalido");
            }else{
                System.out.println("Ganó B");
            }
        }else if(A >= 6 || B >= 6){
            switch (Menor){
                case 1: case 2: case 3: case 4:
                    System.out.println("Ganó " + May);
                    break;
                case 5: case 6:
                    System.out.println("Aún no termina");
                    break;
                case 7:
                    System.out.println("Ganó " + Men);
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("Aún no termina");
        }
    }
}
