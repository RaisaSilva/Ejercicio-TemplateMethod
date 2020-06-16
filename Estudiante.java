package Prueba.TemplateMethod;

public class Estudiante extends Persona{
    private int grado;

    public Estudiante(int edad, String nombre, int grado) {
        super(edad, nombre);
        this.grado = grado;
    }

    @Override
    public void showData() {
        System.out.println(this.getNombre() + " es un estudiante");
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println("Se encuentra en " + grado + " año estudiantil");
        System.out.println(this.getTimeNombre());
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
}
