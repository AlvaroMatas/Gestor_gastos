import java.util.*;

public class gastos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nombre_gasto = new String[100];
        double[] gasto = new double[100];
        int cantidad_gastos = 0;

        while(true){
            System.out.println("------Gastos------");
            System.out.println("1. Añadir gasto(nombre + gasto)");
            System.out.println("2. Ver todos los gastos");
            System.out.println("3. Ver el gasto total");
            System.out.println("4. Ver gasto más alto");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1){
                cantidad_gastos = añadirGasto(nombre_gasto, gasto, sc, cantidad_gastos);
            }else if (opcion == 2){
                verTodosGastos(nombre_gasto, gasto, cantidad_gastos);
            }else if (opcion == 3){
                verGastoTot(nombre_gasto, gasto, cantidad_gastos);
            }else if (opcion == 4){

            }else{
                System.out.println("Saliendo del programa........");

                break;
            }
        }
    }

    public static int añadirGasto(String[] nombre_gasto, double[] gasto, Scanner sc, int cantidad_gastos) {
        if (cantidad_gastos > 100){
            System.out.println("Has tenido muchos gastos, no puedes añadir más");
            return cantidad_gastos;
        }else{
            System.out.print("Nombre del gasto: ");
            nombre_gasto[cantidad_gastos] = sc.next();
            System.out.print("Gasto (€): ");
            gasto[cantidad_gastos] = sc.nextDouble();

            cantidad_gastos++;

            System.out.println("Gasto añadido correctamente");

            return cantidad_gastos;
        }
    }

    public static void verTodosGastos(String[] nombre_gasto, double[] gasto, int cantidad_gastos){
        if (cantidad_gastos == 0){
            System.out.println("No tienes ningún gasto");
            return;
        }else{
            for (int i = 0; i < cantidad_gastos; i++){
                System.out.println("Gasto " + (i + 1) + ": " + nombre_gasto[i] + " - " + gasto[i] + "€");
            }
        }
    }

    public static void verGastoTot(String[] nombre_gasto, double[] gasto, int cantidad_gastos){
        if (cantidad_gastos == 0){
            System.out.println("No tienes ningún gasto");
            return;
        }else{
            double suma = 0;
            for (int i = 0; i < cantidad_gastos; i++){
                suma += gasto[i];
            }

            System.out.println("Gasto total: " + suma + "€");
        }
    }

    public static void gastoMasAlto(String[] nombre_gasto, double[] gasto, int cantidad_gastos){
        double mas_alto = gasto[0];
        String nombre_mas_alto = nombre_gasto[0];
        for (int i = 1; i < cantidad_gastos; i++){
            if (gasto[i] > mas_alto){
                mas_alto = gasto[i];
                nombre_mas_alto = nombre_gasto[i];

                System.out.println("El gasto más alto es: " + nombre_mas_alto + " - " + mas_alto + "€");
            }else{
                System.out.println("No tienes ningún gasto");
            }
        }
    }
}
