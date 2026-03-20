package mensajes;

public class App {

    public static void main(String[] args) {

        Aviso aviso = new Aviso(
                "intranet",
                "Grupo SMR1",
                "Cambio de aula",
                "Hoy la clase será en el aula 2.3 por mantenimiento.",
                "2026-02-26"
        );

        Incidencia incidencia = new Incidencia(
                "correo",
                "Tutor/a",
                "Retraso reiterado",
                "Se han detectado 3 retrasos esta semana.",
                "2026-02-26",
                "12345678A",
                "DAM1",
                "ALTA"
        );

        System.out.println(aviso.generar());
        System.out.println(incidencia.generar());
    }
}