package aed;

import java.util.Vector;

public class Agenda {
    private Fecha _fechaActual;
    private Vector<Recordatorio> _recordatorios;

    public Agenda(Fecha fechaActual) {
        _fechaActual = new Fecha(fechaActual);
        _recordatorios = new Vector<Recordatorio>();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        _recordatorios.addElement(recordatorio);

    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append(_fechaActual.toString()+"\n");
        a.append("=====\n") ;
        for (int i = 0;i <_recordatorios.size();i++){
            Recordatorio r = _recordatorios.get(i);
            if (r.fecha().equals(_fechaActual)){
                a.append(r.toString() + "\n");
            }
        }
        return a.toString();
         

    }

    public void incrementarDia() {
        _fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return _fechaActual;
    }

}
