package VIEW;
import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestEstudiante {
    public static void main(String[] args) {
        
        ProcesarEstudiantes procesadorEstudiante = new ProcesarEstudiantes();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("Seleccione con un numero la opcion que se requiera ejecutar");
            System.out.println("1. Insertar nuevo estudiante");
            System.out.println("2. Presentar Lista de Estudiantes");
            System.out.println("3. Actualizar datos por cedula");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Cerrar Base de Datos");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del nuevo estudiante");
                    String nombre = sc.nextLine();
                    System.out.println("Digite la nota en su primer parcial");
                    int notaP1 = sc.nextInt();
                    System.out.println("Digite la nota en su segundo parcial");
                    int notaP2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el numero de cedula del estudiante llamado " + nombre);
                    String cedula = sc.nextLine();

                    Estudiante est = new Estudiante(nombre, notaP1, notaP2, cedula);
                    procesadorEstudiante.setLstEstudiantes(est);
                    
                    procesadorEstudiante.insertarEstudiante(est);
                    System.out.println("El estudiante " + nombre + " ha sido agregado a la base de datos.");
                    break;
                case 2:
                    ArrayList<Estudiante> lstEst = procesadorEstudiante.getLstEstudiantes();
                    for (Estudiante est1 : lstEst) {
                        System.out.println(est1);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cedula del estudiante a reestablecer datos");
                    String cedulaKey = sc.nextLine();

                    for (int i = 0; i < procesadorEstudiante.getLstEstudiantes().size(); i++) {
                        Estudiante estu = procesadorEstudiante.getLstEstudiantes().get(i);
                        if (estu.getCedula().equals(cedulaKey)) {
                            System.out.println("Ingrese el nuevo nombre");
                            String nNombre = sc.nextLine();
                            System.out.println("Digite la nueva nota del parcial 1");
                            int nNota1 = sc.nextInt();
                            System.out.println("Digite la nueva nota del parcial 2");
                            int nNota2 = sc.nextInt();
                            sc.nextLine();
                            procesadorEstudiante.getLstEstudiantes().get(i).nombreEst = nNombre;
                            procesadorEstudiante.getLstEstudiantes().get(i).nota1 = nNota1;
                            procesadorEstudiante.getLstEstudiantes().get(i).nota2 = nNota2;
                            procesadorEstudiante.calculoPromedios();
                            procesadorEstudiante.calculoEstados();
                            procesadorEstudiante.actualizarEstudiante(estu);
                            System.out.println("El estudiante con cedula" + procesadorEstudiante.getLstEstudiantes().get(i).cedula + "ha sido actualizado en la base de datos.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la cedula del estudiante a eliminar de la base de datos");
                    String cedulaKeyD = sc.nextLine();
                    for (int i = 0; i < procesadorEstudiante.getLstEstudiantes().size(); i++) {
                        Estudiante estu = procesadorEstudiante.getLstEstudiantes().get(i);
                        if (estu.getCedula().equals(cedulaKeyD)) {
                            procesadorEstudiante.eliminarEstudiante(estu);
                        }
                    }
                case 5:
                    System.out.println("Base de Datos Cerrada");
                    break;
                default:
                    System.out.println("Vuelva a intentarlo");
            }

        } while (5 != op);
    }
}
