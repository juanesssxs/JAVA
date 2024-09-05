public class ejercicio12{
    public static void main(String[] args){

        int cantidadDeDias = 7;
        double costoHotelPorDia = 80000;
        double costoTotalDelHotel = cantidadDeDias * costoHotelPorDia;
        double costoComidaPorDia = 80000;
        double costoTotalDeComida = costoComidaPorDia * cantidadDeDias;
        double otrosGastosPorDia = 100000;
        double costoTotalDeOtrosGastos = otrosGastosPorDia * cantidadDeDias;
        double totalDelMonto = costoTotalDelHotel + costoTotalDeComida + costoTotalDeOtrosGastos;
        System.out.println("El total del monto de un cheque es: " + totalDelMonto);
    }
}