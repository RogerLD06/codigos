public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, int edad, String genero, String nacionalidad, String direccion, String matricula, String carrera) {
        super(nombre, edad, genero, nacionalidad, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    private void estudiar(String materia) {
        System.out.println(getNombre() + " está estudiando " + materia + ".");
    }

    public void realizarEstudio(String materia) {
        estudiar(materia);
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Pablo Torres", 21, "Masculino", "Mexicana", "Calle Falsa 123", "1293921", "Ingeniería");

        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Edad: " + est1.getEdad());
        System.out.println("Género: " + est1.getGenero());
        System.out.println("Nacionalidad: " + est1.getNacionalidad());
        System.out.println("Dirección: " + est1.getDireccion());
        System.out.println("Matrícula: " + est1.getMatricula());
        System.out.println("Carrera: " + est1.getCarrera());

        est1.comer("pizza");
        est1.dormir(8);
        est1.tomarducha("jabón de coco");
        est1.realizarEstudio("Programación Orientada a Objetos");
    }
}
