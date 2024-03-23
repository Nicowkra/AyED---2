package aed;

import javax.sound.midi.Track;

class Funciones {
    int cuadrado(int x) {
        int res = x*x;   
        return res;
    }

    double distancia(double x, double y) {
        double res = x*x + y*y;
        res =Math.sqrt(res);
        return res;
    }

    boolean esPar(int n) {
        if (n % 2 == 0){
            return true;
        }
        else{
        return false;}
    }

    boolean esBisiesto(int n) {
        if (n%400 == 0){
            return true;
        }
        else if (n % 4 == 0 && n % 100 != 0 ){
            return true;
        }
        else return false;
    }

    int factorialIterativo(int n) {
        int res = 1;
        if (n == 0){return 1;}
        for (;n !=0;n--){
            res = res * n;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res = n;
        if (n == 0){return 1;}
        res = res * factorialIterativo(n-1);
        
        return res;
    }

    boolean esPrimo(int n) {
        if (n==1){return false;}
        for (int i =n - 1;i != 0;i--){   
            if ((i != 1) && (n % i == 0)){ return false;}
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int n = 0;n < numeros.length;n++){
            res = res + numeros[n];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        for (int n = 0;n < numeros.length;n++){
            if (buscado == numeros[n]){return n;}
        }
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        for (int n = 0;n < numeros.length;n++){
            if (esPrimo(numeros[n])){return true;}
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int n = 0;n < numeros.length;n++){
            if (numeros[n] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if ((s1.length() > s2.length())){ return false;}
        for (int n = 0;n < s1.length();n++){
            if (s1.charAt(n) != s2.charAt(n)){
                return false;
            }
            
        }
        return true;
    }
    String reverso (String input){
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }
    boolean esSufijo(String s1, String s2) {
        s1 = reverso(s1);
        s2 = reverso(s2);
        return esPrefijo(s1, s2);
    }

}