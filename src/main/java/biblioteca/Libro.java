package biblioteca;

import java.time.LocalDate;

public class Libro {

    protected final String titulo;
    protected String prestadoA;
    protected LocalDate fechaDevolucion;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void prestarA(String dni) {
        if ( !estaPrestado() ){
            this.prestadoA = dni;
            this.fechaDevolucion = LocalDate.now().plusDays(14);
            System.out.println("Prestado: " + this.getTitulo() + " a " + dni);
        }else{
            throw new IllegalStateException("Ya estaba prestado");
        }
    }

    public boolean devolver() {
        this.prestadoA = null;
        this.fechaDevolucion = null;
        return true;
    }

    public boolean estaPrestado(){
        return !(this.prestadoA == null || this.prestadoA.isEmpty()) ;
    }

    public String getTitulo() {
        return titulo;
    }
}