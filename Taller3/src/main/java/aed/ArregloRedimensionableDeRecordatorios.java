package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private static final int CAPACIDAD_INICIAL = 100;
    private int _cantidad_actual;
    private Recordatorio[] _elementos;

    public ArregloRedimensionableDeRecordatorios() {
        _cantidad_actual = 0;
        _elementos = new Recordatorio[CAPACIDAD_INICIAL];
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        ArregloRedimensionableDeRecordatorios vector_copiado = vector.copiar();
        _cantidad_actual = vector_copiado._cantidad_actual;
        _elementos = vector_copiado._elementos;
    }

    public int longitud() {
        return _cantidad_actual;
    }

    public void agregarAtras(Recordatorio i) {
        _elementos[_cantidad_actual] = i;
        _cantidad_actual += 1;
    }

    public Recordatorio obtener(int i) {
        return _elementos[i];
    }

    public void quitarAtras() {
        _cantidad_actual -= 1; 
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        _elementos[indice] = valor;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios copia = new ArregloRedimensionableDeRecordatorios();
        for (int i = 0; i < _cantidad_actual; i++) {
            copia.agregarAtras(_elementos[i]);
        }
        return copia;
    }
    
}

