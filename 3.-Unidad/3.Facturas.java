package facturas;

import java.util.Scanner;


public class Facturas {

    
    public static void main(String[] args) {
        int CantidadFacturas = 5;
        double ImporteTotal = 0;
        int LitrosDelProducto1 = 0;
        int FacturasMayoresA10000 = 0;
        double MaximoFactura = Double.MIN_VALUE;
        double MinimoFactura = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= CantidadFacturas; i++) {
            System.out.println("Factura #" + i);

            System.out.print("Ingrese el número de factura: ");
            int NumeroDeFactura = scanner.nextInt();

            System.out.print("Ingrese el código de producto: ");
            int CodigoProducto = scanner.nextInt();

            System.out.print("Ingrese la cantidad de litros comprados: ");
            int CantidadDeLitros = scanner.nextInt();

            System.out.print("Ingrese el precio por litro: ");
            double PrecioDeLitro = scanner.nextDouble();

            double importeFactura = CantidadDeLitros * PrecioDeLitro;
            ImporteTotal += importeFactura;
            
            if (CodigoProducto == 1) {
                LitrosDelProducto1 += CantidadDeLitros;
            }
            if (importeFactura > 10000) {
                FacturasMayoresA10000++;
            }
            if (importeFactura > MaximoFactura) {
                MaximoFactura = importeFactura;
            }
            if (importeFactura < MinimoFactura) {
                MinimoFactura = importeFactura;
            }

            System.out.println(); 
        }
        
        System.out.println("Resumen de las ventas");
        System.out.println("Importe total de las facturas: " + ImporteTotal);
        System.out.println("Litros comprados del producto 1: " + LitrosDelProducto1);
        System.out.println("Facturas mayores a 10,000: " + FacturasMayoresA10000);
        System.out.println("Valor máximo de las facturas: " + MaximoFactura);
        System.out.println("Valor mínimo de las facturas: " + MinimoFactura);
    }
}
