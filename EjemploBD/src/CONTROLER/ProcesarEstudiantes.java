package CONTROLER;
import MODEL.Estudiante;
import MODEL.ConeccionDB;
import java.sql.Connection;
import java.util.ArrayList;
public class ProcesarEstudiantes {
    public ArrayList<Estudiante> lstEstudiantes;
    
    public ProcesarEstudiantes() {
        lstEstudiantes = new ArrayList<>();
    }
    public void calculoPromedios(){
        for(Estudiante est : lstEstudiantes)
            est.promedio = (est.nota1 + est.nota2) / 2;
    }
    public void calculoEstados(){
        for(Estudiante est : lstEstudiantes)
            est.estado = (est.promedio >= 7) ? "Aprobado" : "Reprobado";
    }
    public void insertarEstudiante(Estudiante estudiante){
        System.out.println("Insertar....");
        (new ConeccionDB()).insertarEstudiante(estudiante);
    }
    public void actualizarEstudiante(Estudiante estudiante) {
        (new ConeccionDB()).actualizarEstudiante(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        (new ConeccionDB()).EliminarEstudiante(estudiante);
    }
    
    public ArrayList<Estudiante> getLstEstudiantes() {
        return lstEstudiantes;
    }

    public void setLstEstudiantes(Estudiante est) {
        calculoPromedios();
        calculoEstados();
        lstEstudiantes.add(est);

    }
}
