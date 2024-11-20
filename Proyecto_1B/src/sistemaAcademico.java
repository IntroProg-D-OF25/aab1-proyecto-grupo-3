/*
 * 2. Sistema académico de la UTPL
 * La UTPL, le contrata para realizar una aplicación pequeña que permita la gestión de
 * calificaciones de los estudiantes en una materia.
 * Del Estudiante se registra su: nombre, cédula y la materia a cruzar. (Auto genere estos datos
 * con la función ALEATORIO/RAMDOM)
 * Se debe verificar la aprobación de una materia dadas tres calificaciones: ACD (3.5/10), APE
 * (3.5/10) y AA (3/10). Se aprueba si la sumatoria es de al menos 70%, si cumple con este
 * requisito, se considera que ha aprobado, caso contrario informar al estudiante que deberá rendir
 * un examen de recuperación sobre 3.5/10 pts. agregado al 60% acumulado de los componentes
 * ACD, APE y AA.
 * Ahora, debe implementar los siguientes requisitos en su programa:
 * 1. El programa debe permitir al usuario ingresar los datos de un estudiante, incluyendo su
 * nombre y cédula. (Nota: realizarlo por medio de simulación – random/aleatorio en el main())
 * 2. El programa debe permitir auto generar simulación de los datos de una materia, incluyendo
 * su nombre y las calificaciones del estudiante en las categorías ACD, APE y AA.
 * 3. El programa debe verificar si un estudiante ha aprobado la materia. Para ello, se deben
 * evaluar las calificaciones del estudiante en las tres categorías (ACD, APE y AA).
 * 4. Al finalizar, el programa debe mostrar las estadísticas/porcentajes de aprobación y/o
 * reprobación de la materia de un X curso.
 */

import java.util.Random;

public class sistemaAcademico {
    public static void main(String[] args) {
        float acd, ape, aa, promedio;
        int course, id, nStudent = 9;
        String name, nApprovedC1, nApprovedC2, nApprovedC3;
        Random rand = new Random();

        System.out.printf("%s\t%s\t\t\t%s\t%s\t\t\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
                "|", "Nombre", "|", "id", "|", "curso", "|", "Promedio", "|", "Aprueba/Reprueba", "|");
        for (int i = 0; i < nStudent; i++) {
            id = 1000000000 + rand.nextInt(900000000);
            name = "Estudiante" + rand.nextInt(nStudent);
            course = 1 + rand.nextInt(3);
            acd = rand.nextFloat(3.5F);
            ape = rand.nextFloat(3.5F);
            aa = rand.nextFloat(3);
            promedio = acd + ape + aa;

            if (course == 1) {

                if (promedio >= 7)
                    nApprovedC1 = "aprueba ";
                else {
                    nApprovedC1 = "reprueba";
                }

                System.out.printf("%s\t%s\t\t%s\t%d\t%s\t%d\t\t%s\t%.3f\t\t%s\t\t%s\t\t%s\n", "|", name, "|", id, "|",
                        course, "|", promedio, "|", nApprovedC1, "|");
            } else if (course == 2) {

                if (promedio >= 7)
                    nApprovedC2= "aprueba ";
                else {
                    nApprovedC2= "reprueba";
                }
                System.out.printf("%s\t%s\t\t%s\t%d\t%s\t%d\t\t%s\t%.3f\t\t%s\t\t%s\t\t%s\n", "|", name, "|", id, "|",
                        course, "|", promedio, "|", nApprovedC2, "|");
            } else {
                if (promedio >= 7)
                    nApprovedC3="aprueba ";
                else {
                    nApprovedC3="reprueba";
                }
                System.out.printf("%s\t%s\t\t%s\t%d\t%s\t%d\t\t%s\t%.3f\t\t%s\t\t%s\t\t%s\n", "|", name, "|", id, "|",
                        course, "|", promedio, "|", nApprovedC3, "|");
            }

        }

    }
}
/*
 * |	Nombre			|	id			|	curso	|	Promedio	|	Aprueba/Reprueba	|
 * |	Estudiante3		|	1277425531	|	2		|	5.149		|		reprueba		|
 * |	Estudiante3		|	1677486026	|	2		|	3.257		|		reprueba		|
 * |	Estudiante4		|	1254930284	|	1		|	7.817		|		aprueba 		|
 * |	Estudiante7		|	1498466353	|	1		|	6.167		|		reprueba		|
 * |	Estudiante8		|	1051538470	|	2		|	4.752		|		reprueba		|
 * |	Estudiante8		|	1306598593	|	3		|	3.109		|		reprueba		|
 * |	Estudiante2		|	1474777809	|	1		|	6.024		|		reprueba		|
 * |	Estudiante5		|	1485329311	|	2		|	5.000		|		reprueba		|
 * |	Estudiante0		|	1134377411	|	3		|	3.774		|		reprueba		|
 */
