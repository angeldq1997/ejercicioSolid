package mensajes;

public class Aviso extends Mensaje{

    public Aviso(String canal, String destinatario, String titulo, String cuerpo, String fecha) {
        super(canal, destinatario, titulo, cuerpo, fecha);
    }

    @Override
    public String generar() {
        return super.generar() + "Aviso: " + super.getTitulo() + "\n" +
                "Hola " + super.getDestinatario() + ",\n" +
                super.getCuerpo() + "\n" +
                "Fecha: " + super.getFecha() + "\n";
    }
}