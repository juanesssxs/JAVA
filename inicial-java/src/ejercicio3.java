import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double capacidadTanqueMetrosCubicos = 50;


        double capacidadTanqueLitros = capacidadTanqueMetrosCubicos * 1000;


        System.out.println("Ingrese la capacidad de la manguera en litros por minuto:");
        double capacidadMangueraLitrosPorMinuto = scanner.nextDouble();


        double tiempoLlenadoMinutos = capacidadTanqueLitros / capacidadMangueraLitrosPorMinuto;
        double tiempoLlenadoHoras = tiempoLlenadoMinutos / 60.0;


        System.out.printf("El tanque se llena en %.2f horas.\n", tiempoLlenadoHoras);
    }
}