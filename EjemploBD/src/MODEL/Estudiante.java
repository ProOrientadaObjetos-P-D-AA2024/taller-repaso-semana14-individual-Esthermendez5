package MODEL;
public class Estudiante {
    public String nombreEst, estado, cedula;
    public double nota1, nota2, promedio;
    public Estudiante(String nombreEst, double nota1, double nota2, String cedula) {
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.cedula = cedula;
    }
    public Estudiante(String nombreEst, double nota1, double nota2, double promedio,  String estado, String cedula) {
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
        this.estado = estado;
        this.cedula = cedula;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombreEst=" + nombreEst + ", nota1=" + nota1 + ", nota2=" + nota2 + ", promedio=" + promedio + ", estado=" + estado + ", cedula=" + cedula + '}' ;
    }
    
}
