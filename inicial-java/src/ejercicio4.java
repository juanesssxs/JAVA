import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

// Ejercicio 4

    System.out.println(("Nombre del cliente"));
String nombre = scanner.nextLine();

int sandalias = 30000;
int tenis = 60000;
int mocasines = 80000;
int cantidad;
double descuento = 8;
double operacionDescuento;
double precioDescuento;
double iva = 19;
double operacionIva;
int resultadoVenta;
double resultadoVentaIva;

resultadoVenta = sandalias + tenis + mocasines;
operacionDescuento = descuento/100 * resultadoVenta;
precioDescuento = resultadoVenta - operacionDescuento;
operacionIva = iva/100 * precioDescuento;
resultadoVentaIva = precioDescuento + operacionIva;

    System.out.println("El precio sin descuento es: " + resultadoVenta);
    System.out.println("El descuento de los articulos es: " + descuento);
    System.out.println("El precio con descuento es: " + precioDescuento);
    System.out.println("El precio total con iva es:  " + resultadoVentaIva);


  }
          }