package Prueba.TemplateMethod;

public class Director extends Persona{
    private String colegio;

    public Director(int edad, String nombre, String colegio) {
        super(edad, nombre);
        this.colegio = colegio;
    }

    @Override
    public void showData() {
        System.out.println(this.getNombre() + " es un Director");
        System.out.println("Tiene " + this.getEdad() + " años");
        System.out.println("Se hace cargo del Colegio" + colegio);
        System.out.println(this.getTimeNombre());
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
}
