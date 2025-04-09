// Importar Libreria Scanner
import java.util.Scanner;

public class Parcial2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaracion de variables
        int opcion, cantidad;
        double precio = 0, subtotal = 0, descuento = 0, subtotalConDescuento = 0, iva = 0, total = 0;
        double totalGeneral = 0;

        // Mostrar opciones a elegir
        do {
            System.out.println("\nMenu de Compras, Elija una opción por favor:");
            System.out.println("1. Camisetas / Valor: $25.000");
            System.out.println("2. Pantalones / Valor: $45.000");
            System.out.println("3. Chaquetas / Valor: $65.000");
            System.out.println("4. Salir de la aplicación");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();


        // Switch case segun lo que elegio el usuario   
            if (opcion >= 1 && opcion <= 3) {
                String nombre = "";
                switch (opcion) {
                    case 1:
                        nombre = "Camisetas";
                        precio = 25000;
                        break;
                    case 2:
                        nombre = "Pantalones";
                        precio = 45000;
                        break;
                    case 3:
                        nombre = "Chaquetas";
                        precio = 65000;
                        break;
                }

                // Numero de unidades que desea comprar 
                System.out.print("¿Cuántas unidades de " + nombre + " desea comprar? ");
                cantidad = sc.nextInt();


                // Procesos
                subtotal = cantidad * precio;

                if (cantidad >= 3 && cantidad <= 4) {
                    descuento = subtotal * 0.10;
                } else if (cantidad > 4) {
                    descuento = subtotal * 0.15;
                } else {
                    descuento = 0;
                }

                subtotalConDescuento = subtotal - descuento;
                iva = subtotalConDescuento * 0.19;
                total = subtotalConDescuento + iva;
                totalGeneral += total;

                // Resultados

                System.out.println("\nProducto: " + nombre);
                System.out.println("Valor unitario: $" + precio);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Subtotal con descuento: $" + subtotalConDescuento);
                System.out.println("IVA (19%): $" + iva);
                System.out.println("Total a pagar por este producto: $" + total);
            } else if (opcion != 4) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);


        // Total a pagar
        System.out.println("\n===============================");
        System.out.println("TOTAL GENERAL A PAGAR: $" + totalGeneral);
        System.out.println("Gracias por su compra.");

        // Cierra el Scanner
        sc.close();
    }
}

 // Fin programa