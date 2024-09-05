import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cantidad de galones");
        double galones = scanner.nextDouble();
        double resultado = galones * 3785;
        double precioGalon = 15000;

        double sumaGalones = galones * precioGalon;

        System.out.println("Cantidad de litros: " +resultado);
        System.out.println("Venta de leche del dia: " + sumaGalones + "por" + galones + "de leche");
    }
}
