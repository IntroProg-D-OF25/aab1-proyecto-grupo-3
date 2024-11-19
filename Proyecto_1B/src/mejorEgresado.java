import java.util.Random;

public class mejorEgresado {
    public static void main(String[] args) {
        float acd, ape, aa, promedio;
        int course, id, nStudent = 9;
        String name;
        Random rand = new Random();
        int course1Count = 0, course2Count = 0, course3Count = 0, nApprovedC1 = 0, nFailedC1 = 0, nApprovedC2 = 0,
                nFailedC2 = 0, nApprovedC3 = 0, nFailedC3 = 0;

        for (int i = 0; i < nStudent; i++) {
            id = 1000000000 + rand.nextInt(900000000);
            name = "Estudiante" + rand.nextInt(nStudent);
            course = 1 + rand.nextInt(3);
            acd = rand.nextFloat(2.5F, 3.5F);
            ape = rand.nextFloat(2.5F, 3.5F);
            aa = rand.nextFloat(2, 3);
            promedio = acd + ape + aa;

            if (course == 1) {
                course1Count++;
                System.out.println(" -----------------------------");
                System.out.println("| Name:      |   " + name + "  |");
                System.out.println(" -----------------------------");
                System.out.println("| Id:        |   " + id + "   |");
                System.out.println(" -----------------------------");
                System.out.println("| Course:    |   " + course + "            |");
                System.out.println(" -----------------------------");
                /*
                 * System.out.println("| acd:       |   " + acd);
                 * System.out.println("| ape:       |   " + ape);
                 * System.out.println("| aa:        |   " + aa);
                 */
                System.out.printf("| promedio:  |   %.3f        |%n", (promedio));
                System.out.println(" -----------------------------\n");
                // System.out.println("-------------------------------");

                if (promedio >= 7)
                    nApprovedC1++;
                else {
                    nFailedC1++;
                }

            } else if (course == 2) {
                course2Count++;

                if (promedio >= 7)
                    nApprovedC2++;
                else {
                    nFailedC2++;
                }
            } else {
                course3Count++;

                if (promedio >= 7)
                    nApprovedC3++;
                else {
                    nFailedC3++;
                }
            }

        }

        System.out.println(" ----------------------------------------------------");
        System.out.println(
                "| Total de estudiantes en el curso 1 :  " + course1Count + "  |  " + nApprovedC1 + "  |  " + nFailedC1
                        + " |");
        System.out.println(
                "| Total de estudiantes en el curso 2 :  " + course2Count + "  |  " + nApprovedC2 + "  |  " + nFailedC2
                        + " |");
        System.out.println(
                "| Total de estudiantes en el curso 3 :  " + course3Count + "  |  " + nApprovedC3 + "  |  " + nFailedC3
                        + " |");
        System.out.println(" ----------------------------------------------------");
    }
}