import java.util.Scanner;

public class ReservaVuelo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Declaro variables
        String nombre_Pasajero;
        String Ciudad_origen;
        String Ciudad_destino;
        String fecha_Vuelo;
        String Asiento_pasajero;
        int Numero_Pasajeros;
        double precio_Por_Pasajero;
        double costo_Total;

        // Ingreso de los datos
        System.out.print("Ingrese el nombre del pasajero: ");
        nombre_Pasajero = input.nextLine();

        System.out.print("Ingrese ciudad de origen: ");
        Ciudad_origen = input.nextLine();

        System.out.print("Ingrese ciudad de destino: ");
        Ciudad_destino = input.nextLine();

        System.out.print("Ingrese la fecha del vuelo: ");
        fecha_Vuelo = input.nextLine();

        System.out.print("Ingrese el asiento asignado: ");
        Asiento_pasajero = input.nextLine();

        //El numero de pasajeros debe de ser mayor o igual a 1 
        do {
            System.out.print("Ingrese número de pasajeros: ");
            if (input.hasNextInt()) {
                Numero_Pasajeros = input.nextInt();
                if (Numero_Pasajeros < 1) {
                    System.out.println("Ingrese un numero igual o mayor a 1.");
                }
            } else {
                System.out.println("ingrese un número válido.");
                input.next(); 
                Numero_Pasajeros = 0; 
            }
        } while (Numero_Pasajeros < 1);
        
        input.nextLine();

        // Calculo el precio según el destino
        Ciudad_destino = Ciudad_destino.toLowerCase().trim();
        
        switch(Ciudad_destino) {
            case "medellin":
                precio_Por_Pasajero = 100000;
                break;
            case "bogota":
                precio_Por_Pasajero = 85000;
                break;
            case "barranquilla":
                precio_Por_Pasajero = 65000;
                break;
            default:
                precio_Por_Pasajero = 200000;
        }

        // Costo total
        costo_Total = Numero_Pasajeros * precio_Por_Pasajero;

        // Resultados
        System.out.println("\n=== Resumen de la reserva ===");
        System.out.println("Pasajero: " + nombre_Pasajero);
        System.out.println("Desde: " + Ciudad_origen + " hacia " + Ciudad_destino);
        System.out.println("Fecha del vuelo: " + fecha_Vuelo);
        System.out.println("Asiento: " + Asiento_pasajero);
        System.out.println("Precio por pasajero: $" + precio_Por_Pasajero);
        System.out.println("Total a pagar: $" + costo_Total);

        input.close();
    }
}