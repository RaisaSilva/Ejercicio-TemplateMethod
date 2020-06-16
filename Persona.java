package Prueba.TemplateMethod;
import java.time.LocalDateTime;
public abstract class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public final String getTimeNombre(){
        return this.nombre + " " + LocalDateTime.now();
    }

    public abstract void showData();

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
