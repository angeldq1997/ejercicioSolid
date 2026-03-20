package mensajes;

public class Mensaje {

    private final String canal;
    private final String destinatario;
    private final String titulo;
    private final String cuerpo;
    private final String fecha;
    public Mensaje(String canal,
                   String destinatario,
                   String titulo,
                   String cuerpo,
                   String fecha) {
        this.canal = canal;
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getCanal() { return canal; }
    public String getDestinatario() { return destinatario; }
    public String getTitulo() { return titulo; }
    public String getCuerpo() { return cuerpo; }
    public String getFecha() { return fecha; }

    public String generar() {
        return  "[" + this.getCanal().toUpperCase() + "] ";
    }
}