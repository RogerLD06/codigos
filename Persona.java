public class Persona {
    private String nombre;
    protected int edad;
    private String genero;
    private String nacionalidad;
    protected String direccion;

    public Persona(String nombre, int edad, String genero, String nacionalidad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida + ".");
    }

    public void dormir(int horas) {
        System.out.println(nombre + " está durmiendo por " + horas + " horas.");
    }

    protected void tomarducha(String tipoDeJabon) {
        System.out.println(nombre + " se está duchando con " + tipoDeJabon + ".");
    }
}