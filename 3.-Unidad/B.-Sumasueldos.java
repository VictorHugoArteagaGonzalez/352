package sumasueldos;

import java.util.Scanner;


public class SumaSueldos {

    
    public static void main(String[] args) {
       
        int cantidadDeSueldos = 10;
        double sumaDeSueldos = 0;
        int SueldosMayoresA1000 = 0;
        double sueldoMaximo = Double.MIN_VALUE;
        double sueldoMinimo = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= cantidadDeSueldos; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            double Sueldo = scanner.nextDouble();
            sumaDeSueldos += Sueldo;
            if (Sueldo > 1000) {
                SueldosMayoresA1000++;
            }
            if (Sueldo > sueldoMaximo) {
                sueldoMaximo = Sueldo;
            }
            if (Sueldo < sueldoMinimo) {
                sueldoMinimo = Sueldo;
            }
        }

        double promedioSueldos = sumaDeSueldos / cantidadDeSueldos;
        System.out.println("Suma de sueldos: " + sumaDeSueldos);
        System.out.println("Cantidad de los sueldos mayores a 1000: " + SueldosMayoresA1000);
        System.out.println("Promedio de los sueldos: " + promedioSueldos);
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);

        
    }
}
