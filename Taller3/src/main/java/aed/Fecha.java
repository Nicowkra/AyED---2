package aed;

public class Fecha {
    private int _dia;
    private int _mes;
    public Fecha(int dia, int mes) {
       _dia = dia;
       _mes = mes;
    }

    public Fecha(Fecha fecha) {
       _dia = fecha._dia;
       _mes = fecha._mes;
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        Integer d = _dia;
        Integer m = _mes;
        return d.toString() + "/" + m.toString();
    }

    @Override
    public boolean equals(Object otra) {
        boolean esNull = (otra == null);
        boolean esOtra = otra.getClass() != this.getClass();
        if (esNull || esOtra){return false;}
        Fecha otraFecha = (Fecha) otra;
        return _dia == otraFecha._dia && _mes == otraFecha._mes;
    }

    public void incrementarDia() {

        if (diasEnMes(_mes) == _dia) {
            _dia = 1;
            _mes ++;
        }else{
            _dia ++;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
