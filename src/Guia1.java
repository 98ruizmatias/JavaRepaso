/**
 * Created by pwnd on 29/5/2017.
 */
public class Guia1 {

    //Ejercicio 1

    public int menorElemento(int [] v){
        int pos = 0;
        int min = v[0];
        for (int i = 1; i < v.length; i++){
            if ( v[i] < min){
                min = v[i];
                pos = i;
            }
        }
        return pos;
    }

    //Ejercicio 2

    public int mayorElemento(int [] v){
        int pos = 0;
        int may = v[0];
        for (int i = 1; i < v.length; i++){
            if ( v[i] > may){
                may = v[i];
                pos = i;
            }
        }
        return pos;
    }

    //Ejercicio 3

    public boolean todosNegativcs(int [] v){
        for (int i = 0; i > v.length; i++){
            if (v[i] < 0){
                return false;
            }
        }
        return true;
    }

    //Ejercicio 4

    public int parPorImpar( boolean [] v){
        int par = 0;
        int impar = 0;
        for (int i = 0; i < v.length; i++){
            if (i%2 == 0 && v[i] == true){
                par++;
            }
            else if (i%2 !=0 && v[i] == false){
                impar++;
            }
        }
        return par*impar;
    }

    //Ejercicio 5

    //Se da por hecho que a y b tienen la misma longitud

    public static int[] nuPnUArray(int [] a, int [] b){
        if (a.length != b.length){
            throw new IllegalArgumentException();
        }
        int [] c = new int[a.length];
        for (int i = 0; i < c.length; i++){
            if (i%2 == 0){
                c[i] = a[i];
            }else {
                c[i] = b[i];
            }

        }
        return c;
    }

    //Ejercicio 6

    public static int[] aPorBMuno(int []a, int b[]){
        int [] c = new int[a.length];
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] * b[b.length-i];
        }
        return c;
    }

    //Ejercicio 7

    public int[] inverso(int [] v){
        int [] inverso = new int[v.length];
        for (int i =0; i < v.length; i++){
            inverso[i] = v[v.length-i];
        }
        return inverso;
    }

    //Ejercicio 8

    public double[] piEscalar(double [] v){
        double [] pi = new double[v.length];
        for (int i = 0; i < v.length; i++){
            pi[i] = v[i] * 3.14;
        }
        return pi;
    }

    //Ejercicio 9

    public int productoEscalar(int [] a, int [] b){
        int prod = 0;
        for (int i = 0; i < a.length ; i++){
            prod += a[i] *b[i];
        }
        return prod;
    }

    //Ejercicio 10

    public int escalarDelInverso(int [] a){
        int prod = 0;
        for (int i = 0; i < a.length; i++){
            prod += a[i] * a[a.length - i];
        }
        return prod;
    }

    //Ejercicio 11

    public int posicionDondeTa(int [] a, int n){
        for (int i = 0; i < a.length; i++){
            if (a[i] == n){
                return i;
            }
        }
        return -1;
    }

    //Ejercicio 12

    public int [] ascendente(int [] a){
        int aux;
        for (int i = a.length; i >= 1; i--){
            if (a[i-1] > a[i]){
                aux = a[i];
                a[i] = a[i-1];
                a[i-1] = aux;
            }
        }
        return a;
    }

    public int [] descendente(int [] a){
        int aux;
        for (int i = a.length; i >= 1; i--){
            if (a[i-1] < a[i]){
                aux = a[i];
                a[i] = a[i-1];
                a[i-1] = aux;
            }
        }
        return a;
    }

    //Ejercicio 13


    public boolean binarySearch(int [] a, int n){

        /*Fijas cual es el primer elemento, el ultimo y el del medio que en este caso solo se crea la var*/

        int primero = 0;
        int ultimo = a.length-1;
        int medio = 0;

        /*v Desarrollo de binary search v*/

        while (primero <= ultimo){  /*< Mientras el primer elemnto se menor que el ultimo*/

            /*v Determinar la mitad del array actual v*/

            medio = ( ( ultimo -1 ) / 2 ) + 1;

            /* v Presentacion de los casos a analizar v */

            if (a[medio] == n){
                return true; // < el numero ingresado se encuentra en el diome
            }
            if (n > a[medio]){
                primero = medio + 1; // < el numero ingresado es mayor al del medio por ende se achica la wea hacia la derecha
            } else {
                ultimo = medio - 1; // < el numero ingresado es menor al del medio por ende se desplazarte hacia la izquierda
            }

        }

    return false; // < el numero ingrsado no esta en el array

    }


    public static boolean binarySearchRecursive(int [] a, int n, int primero, int ultimo){
        int medio = 0;
        while (primero < ultimo){
            medio = ( ( ultimo -1 ) / 2 ) + 1;
            if (a[medio] == n){
                return true;
            }
            if (n > a[medio]){
                return binarySearchRecursive(a, n, medio+1, ultimo);
            } else {
                return binarySearchRecursive(a, n, primero, medio-1);
            }
        }
        return false;
    }




    //Ejercicio 14

    public int [] tenArray(int [] a){
        int [] b = new int[a.length*2];
        for (int i = 0; i < b.length; i ++){
            if (i < a.length){
                b[i] = a[i];
            }else {
                b[i] = 10;
            }
        }
        return b;
    }

    //Ejercicio 15

    public int [] insertionSort(int [] a, int num){
        int aux = 0;
        int [] b = new int[a.length+1];
        ascendente(a);
        for (int i = 0; i < a.length; ){
            b[i] = a[i];
        }
        b[b.length-1] = num;
        for (int i = a.length-1; i < 0; i++){
            if( b[i] < b[-1] ){
                aux = b[i-1];
                b[i-1] = b[i];
                b[i] = aux;
            }
        }
        return b;
    }

    //Ejerecicio 16

    public boolean estrictamenteCreciente(int [] a){
        for (int i = 0; i < a.length; i++){
            if ( a[i] > a[i+1] ){
                return false;
            }
        }
        return true;
    }

    //Ejercicio 17

    public int estCrec(int [] a){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if ( a[i] > a[i+1] ){
                count++;
            }
        }
        if (count == 0){
            return -1;
        }
        return count;
    }



}

