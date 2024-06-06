package main;

import consult.ConsultaMoneda;
import model.Moneda;

import java.nio.DoubleBuffer;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = null;
        int opcion = 0;
        Double monto = 0.0;

        while(opcion != 9) {
            System.out.println("********************************************");
            System.out.println("Sean bienvenidos al conversor de monedas =)");
            System.out.println("""
                    1. Dolares a Soles.
                    2. Soles a Dolares.
                    3. Dolares a Pesos Colombianos.
                    4. Pesos Colombianos a Dolares.
                    5. Dolares a Real Brasileño.
                    6. Real Brasileño a Dolares
                    7. Dolares a Pesos Argentinos.
                    8. Pesos Argentinos a Dolares
                    9. SALIR.""");
            System.out.println("********************************************");
            System.out.println("Ingrese la opción que desea:");
            try{
                opcion = Integer.parseInt(scan.nextLine());

                    switch (opcion) {
                            case 1:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("USD","PEN", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 2:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("PEN","USD", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 3:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("USD","BOB", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 4:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("BOB","USD", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 5:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("USD","BRL", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 6:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("BRL","USD", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 7:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("USD","ARS", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 8:
                                System.out.println("Ingrese el monto a convertir:");
                                monto  = Double.parseDouble(scan.nextLine());
                                moneda = consulta.buscaMoneda("ARS","USD", monto);

                                System.out.println("El monto es: " + moneda.conversion_result());
                                break;
                            case 9:
                                break;
                            default:
                            System.out.println("Ingrese un numero valido");
                    }
            }catch (NumberFormatException e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
