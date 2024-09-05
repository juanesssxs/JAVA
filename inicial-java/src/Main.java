import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);

    //Ejercicio 1

    int año1 = 2024;
    int año2 = 2013;
    int resultadoAño;

    resultadoAño = año1 - año2;
    resultadoAño *=12;

    System.out.println("Han pasado " + resultadoAño + " meses desde años anteriores");

  }
}

