import java.util.Random;

public class mejorEgresado {

    public static void main(String[] args) {
        Random random = new Random();
        int totalEstudiantes = 9;
        String nombre,id;
        double promedio,acd,ape,aa;


        // Variables para rastrear al mejor o mejores egresados
        String mejorNombre1 = "",mejorNombre2 = "",mejorID1 = "",mejorID2 = "";
        double mejorPromedio1 = 0.0, mejorPromedio2 = 0.0;

        System.out.println("Listado de Estudiantes:");

        for (int i = 1; i <= totalEstudiantes; i++) {
            // Generar datos del estudiante
            nombre = "Estudiante" + i;
            id = String.valueOf(1000000000 + random.nextInt(900000000));
            acd = random.nextFloat(2.5F,3.5F);
            ape = random.nextFloat(2.5F,3.5F);
            aa = random.nextFloat(2,3);
            promedio = acd + ape + aa;

            // Mostrar datos del estudiante
//            System.out.printf("|\tNombre: %s\t|\tID: %s\t|\tPromedio: %.2f\t|\n", nombre, id, promedio);
            System.out.println(nombre + id + promedio);

            // Verificar si es el mejor promedio
            if (promedio > mejorPromedio1) {
                // Desplazar al segundo lugar el actual mejor
                mejorNombre2 = mejorNombre1;
                mejorID2 = mejorID1;
                mejorPromedio2 = mejorPromedio1;

                // Actualizar el primer lugar
                mejorNombre1 = nombre;
                mejorID1 = id;
                mejorPromedio1 = promedio;
            } else if (promedio == mejorPromedio1 && promedio > mejorPromedio2) {
                // Si hay empate con el primer lugar, actualizar el segundo lugar
                mejorNombre2 = nombre;
                mejorID2 = id;
                mejorPromedio2 = promedio;
            }
        }

        System.out.println("\n--- Mejor(es) Egresado(s) ---");
        System.out.printf("1. Nombre: %s | ID: %s | Promedio: %.2f%n", mejorNombre1, mejorID1, mejorPromedio1);
        if (mejorPromedio2 == mejorPromedio1) {
            System.out.printf("2. Nombre: %s | ID: %s | Promedio: %.2f%n", mejorNombre2, mejorID2, mejorPromedio2);
        } else {
            System.out.println("No hubo empates.");
        }
    }
}
