import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nombre del estudiante");
        String nombreEstudiante = scanner.nextLine();

        System.out.println("Nota del Examen 1");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota del Examen 2");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota del Examen 3");
        double nota3 = scanner.nextDouble();


        System.out.println("Nota del Examen 4");
        double nota4 = scanner.nextDouble();

        double sumNotas = nota1 + nota2 + nota3 + nota4;
        double promedioNotas = sumNotas/4;

        System.out.println("El promedio de las notas es de: " + promedioNotas);
    }
}
