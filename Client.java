package Prueba.TemplateMethod;


public class Client {
    public static void main(String[] args) {
        Persona persona = new Docente(40, "Mario", "Matemática");
        Persona persona1 = new Estudiante(20, "Miguel", 8);
        Persona persona2 = new Director(60, "Fernando", "San Ignacio");

        System.out.println("*******************************");
        persona.showData();
        System.out.println("*******************************");
        persona1.showData();
        System.out.println("*******************************");
        persona2.showData();
        }
    }

