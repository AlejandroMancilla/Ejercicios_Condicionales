import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1, N2, N3, N4;
        System.out.print("Ingrese Numero: ");
        N1 = sc.nextInt();
        System.out.print("Ingrese Numero: ");
        N2 = sc.nextInt();
        System.out.print("Ingrese Numero: ");
        N3 = sc.nextInt();
        System.out.print("Ingrese Numero: ");
        N4 = sc.nextInt();
        if(N1 < N2){
            N1 += N2;
            N2 = N1 - N2;
            N1 -= N2;
        }
        if(N1 < N3){
            N1 += N3;
            N3 = N1 - N3;
            N1 -= N3;
        }
        if(N1 < N4){
            N1 += N4;
            N4 = N1 - N4;
            N1 -= N4;
        }
        if(N2 < N3){
            N2 += N3;
            N3 = N2 - N3;
            N2 -= N3;
        }
        if(N2 < N4){
            N2 += N4;
            N4 = N2 - N4;
            N2 -= N4;
        }
        if(N3 < N4){
            N3 += N4;
            N4 = N3 - N4;
            N3 -= N4;
        }
        System.out.println(N4 + ", " + N3 + ", " + N2 + ", " + N1);
    }
}
