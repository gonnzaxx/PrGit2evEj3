public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    void incrementarEdad(){
        edad+=1;
    }

    void incrementarSueldo(int porcentajeIncremento) {
        this.sueldo += sueldo * (porcentajeIncremento / 100.0);
    }



}
