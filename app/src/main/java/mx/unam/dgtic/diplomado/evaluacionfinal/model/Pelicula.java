package mx.unam.dgtic.diplomado.evaluacionfinal.model;

public class Pelicula {

    String nombre;
    String tipo;
    String anio;

    public Pelicula(){

    }

    public Pelicula(String nombre, String tipo, String anio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}
