package Prueba.TemplateMethod;

public class Docente extends Persona{
    private String materia;

    public Docente(int edad, String nombre, String materia) {
        super(edad, nombre);
        this.materia = materia;
    }

    @Override
    public void showData() {
        System.out.println(this.getNombre() + " es un docente");
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println(this.getTimeNombre());
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
