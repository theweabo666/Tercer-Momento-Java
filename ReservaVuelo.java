import java.util.Scanner;

public class ReservaVuelo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n=== SISTEMA DE RESERVA DE VUELOS ===");
            System.out.println("1. Ver reservas");
            System.out.println("2. Crear una nueva reserva");
            System.out.println("3. Editar una reserva");
            System.out.println("4. Eliminar una reserva");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch(opcion) {
                case 1:
                    verReservas();
                    break;
                case 2:
                    crearNuevaReserva(input);
                    break;
                case 3:
                    editarReserva();
                    break;
                case 4:
                    eliminarReserva();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        input.close();
    }

    // Método para ver reservas (placeholder)
    public static void verReservas() {
        System.out.println("\n--- VER RESERVAS ---");
        System.out.println("Funcionalidad en desarrollo...");
    }

    // Método para crear nueva reserva 
    public static void crearNuevaReserva(Scanner input) {
        System.out.println("\n--- CREAR NUEVA RESERVA ---");
        

        // Declaro variables
        String nombre_Pasajero;
        String Ciudad_origen;
        String Ciudad_destino;
        String fecha_Vuelo;
        String Asiento_pasajero;
        int cantidad_Pasajeros;
        double precio_Por_Pasajero;
        double costo_Total;

        // Ingreso de los datos
        System.out.print("Inicio de reserva de vuelo\n");

        System.out.print("1. Ingrese el nombre del pasajero: ");
        nombre_Pasajero = input.nextLine();

        System.out.print("2. Ingrese ciudad de origen: ");
        Ciudad_origen = input.nextLine();

        System.out.print("3. Ingrese ciudad de destino: ");
        Ciudad_destino = input.nextLine();

        System.out.print("4. Ingrese la fecha del vuelo: ");
        fecha_Vuelo = input.nextLine();

        System.out.print("5. Ingrese el asiento asignado: ");
        Asiento_pasajero = input.nextLine();

        //El numero de pasajeros debe de ser mayor o igual a 1 
        do {
            System.out.print("Ingrese la cantidad de pasajeros: ");
            if (input.hasNextInt()) {
                cantidad_Pasajeros = input.nextInt();
                if (cantidad_Pasajeros < 1) {
                    System.out.println("Ingrese un numero igual o mayor a 1.");
                }
            } else {
                System.out.println("ingrese un número válido.");
                input.next(); 
                cantidad_Pasajeros = 0; 
            }
        } while (cantidad_Pasajeros < 1);
        
        input.close();

        // Calculo el precio según el destino
        Ciudad_destino = Ciudad_destino.toLowerCase().trim();

        //precio por defecto al inicio para evitar errores
        precio_Por_Pasajero = 0.0;
        
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
        costo_Total = cantidad_Pasajeros * precio_Por_Pasajero;

        // Resultados
        System.out.println("\n=== Resumen de la reserva ===");
        System.out.println("Pasajero: " + nombre_Pasajero);
        System.out.println("Desde: " + Ciudad_origen + " hacia " + Ciudad_destino);
        System.out.println("Fecha del vuelo: " + fecha_Vuelo);
        System.out.println("Asiento: " + Asiento_pasajero);
        System.out.println("Precio por pasajero: $" + precio_Por_Pasajero);
        System.out.println("Total a pagar: $" + costo_Total);
    }

    // Editar reserva (placeholder)
    public static void editarReserva() {
        System.out.println("\n--- EDITAR RESERVA ---");
        System.out.println("Estamos trabajando para mejorar tu experiencia");
    }

    // Eliminar reserva (placeholder)
    public static void eliminarReserva() {
        System.out.println("\n--- ELIMINAR RESERVA ---");
        System.out.println("Estamos trabajando para mejorar tu experiencia");
    }
}
