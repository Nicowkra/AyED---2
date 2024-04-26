package aed;

public class Horario {
        private int _hora;
        private int _min;
    public Horario(int hora, int minutos) {
        _hora = hora;
        _min = minutos;
    }
    public Horario(Horario horario) {
        _hora = horario._hora;
        _min = horario._min;
    }

    public int hora() {
        return _hora;
    }

    public int minutos() {
        return _min;
    }

    @Override
    public String toString() {
        Integer h = _hora;
        Integer m = _min;
        return h.toString()+":"+m.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean esNull = (otro == null);
        boolean esOtra = otro.getClass() != this.getClass();
        if (esNull || esOtra){return false;}
        Horario otroHorario = (Horario) otro;
        return _hora == otroHorario._hora && _min == otroHorario._min;
    }

}
