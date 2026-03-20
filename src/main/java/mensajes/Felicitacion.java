package mensajes;

public class Felicitacion extends Mensaje{
    public Felicitacion(String canal, String destinatario, String titulo, String cuerpo, String fecha) {
        super(canal, destinatario, titulo, cuerpo, fecha);
    }

    public String generar(){
        return super.generar() + "¡Enhorabuena! " + super.getTitulo() + "\n" +
                super.getDestinatario() + ", " + super.getCuerpo() + "\n";
    }
}
