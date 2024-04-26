package aed;

public class Recordatorio {
        private String _mensaje;
        private Fecha _fecha;
        private Horario _horario;
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
       _mensaje = mensaje;
       _fecha = new Fecha(fecha);
       _horario = new Horario(horario);
    }

    public Horario horario() {
        return new Horario(_horario);
    }

    public Fecha fecha() {
        return new Fecha(_fecha);
    }

    public String mensaje() {
        return _mensaje;
    }

    @Override
    public String toString() {
        return _mensaje + " @ " + _fecha.toString() + " " + _horario.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean esNull = (otro == null);
        boolean esOtro = otro.getClass() != this.getClass();
        if (esNull || esOtro){return false;}
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return _mensaje == otroRecordatorio._mensaje && _fecha == otroRecordatorio._fecha && _horario == otroRecordatorio._horario;
    }
}

