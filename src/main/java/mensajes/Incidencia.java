package mensajes;

public class Incidencia extends Mensaje{
    // Atributos extra para incidencias
    private final String alumno;
    private final String tutoria;
    private final String gravedad;


    public Incidencia(String canal, String destinatario, String titulo, String cuerpo, String fecha, String alumno, String tutoria, String gravedad) {
        super(canal, destinatario, titulo, cuerpo, fecha);
        this.alumno = alumno;
        this.tutoria = tutoria;
        this.gravedad = gravedad;
    }

    public String getAlumno() { return alumno; }
    public String getTutoria() { return tutoria; }
    public String getGravedad() { return gravedad; }

    public String generar(){
        return super.generar() +  "Incidencia (" + this.getGravedad() + "): " + super.getTitulo() + "\n" +
                "Alumno/a: " + this.getAlumno() + "\n" +
                "Tutoría: " + this.getTutoria() + "\n" +
                "Detalle: " + super.getCuerpo() + "\n";
    }
}
