import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Edad;
        double Peso, Estatura, IMC;
        String Resultado;
        System.out.print("Ingrese su Edad: ");
        Edad = sc.nextInt();
        System.out.print("Ingrese su Estatura (m): ");
        Estatura = sc.nextDouble();
        System.out.print("Ingrese su Peso (kg): ");
        Peso = sc.nextDouble();
        IMC = Peso / (Math.pow(Estatura, 2));
        Resultado = (IMC < 22) ? (Edad < 45) ? "Bajo" : "Medio" : (Edad < 45) ? "Medio" : "Alto";
        System.out.println("Condición de Riesgo: " + Resultado);
    }
}
