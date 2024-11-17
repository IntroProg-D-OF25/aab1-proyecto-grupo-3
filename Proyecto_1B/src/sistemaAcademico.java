import java.util.Random;

public class sistemaAcademico {
    public static void main(String[] args) {
        float acd, ape, aa;
        int course, id, nStudent = 9;
        String name;
        Random rand = new Random();
        int course1Count = 0, course2Count = 0, course3Count = 0;


        for (int i = 0; i < nStudent; i++) {
            id = 1000000000 + rand.nextInt(900000000);
            name = "Estudiante" + rand.nextInt(nStudent);
            course = 1 + rand.nextInt(3);
            acd = rand.nextFloat(3.5F);
            ape = rand.nextFloat(3.5F);
            aa = rand.nextFloat(3);

            if (course == 1) {
                course1Count++;
                System.out.println("-------------------");
                System.out.println("Name:   " + name);
                System.out.println("Id:     " + id);
                //                System.out.println("Course: " + course);
                System.out.println("acd:    " + acd);
                System.out.println("ape:    " + ape);
                System.out.println("aa:     " + aa);
            } else if (course == 2) {
                course2Count++;
            } else {
                course3Count++;
            }
        }
        System.out.println("Total de estudiantes en el curso 1: " + course1Count);
        System.out.println("Total de estudiantes en el curso 2: " + course2Count);
        System.out.println("Total de estudiantes en el curso 3: " + course3Count);
    }
}
