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
            System.out.println("Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1){
                cantidad_gastos = añadirGasto(nombre_gasto, gasto, sc, cantidad_gastos);
            }else if (opcion == 2){

            }else if (opcion == 3){

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
}
