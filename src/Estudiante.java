public class Estudiante {
    String nombre;
    int edad;
    int grado;

    public Estudiante (String nombre, int edad, int grado){
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void estudiar (){
        System.out.println(" El estudiante " + nombre + " de edad: " + edad + " esta estudiando en el grado: " + grado);
    }
}
