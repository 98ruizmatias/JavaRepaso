/**
 * Created by pwnd on 30/5/2017.
 */
public class Guia2 {

    //Ejercicio 1

    public int sumaMatriz(int [][] m){
        int total=0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                total += m[i][j];
            }
        }
        return total;
    }

    //Ejercicio 2

    public int contadorPositivos(int [][] m){
        int contador = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if ( m[i][j] > 0){
                    contador++;
                }
            }
        }
        return contador;
    }

    //Ejercicio 3

    public int posicionMayorFilaIndex(int [][] m, int index){
        int max = m[index][0];
        for (int i = 0; i < m[index].length; i++){
            if ( m[index][i] > max){
                max = m[index][i];
            }
        }
        return max;
    }

    //Ejercicio 4

    public int posicionMayorColumnaIndex(int [][] m, int index){
        int max = m[0][index];
        for (int i = 0; i < m.length; i++){
            if ( m[i][index] > max){
                max = m[i][index];
            }
        }
        return max;
    }

    //Ejercicio 5

    public int maxRow(int [][] m){
        int max = 0;
        int pos=0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if ( m[i][j] > max){
                    max = m[i][j];
                    pos = i;
                }
            }
        }
        return pos;
    }

    //Ejercicio 6

    public int maxCol(int [][] m){
        int max = 0;
        int pos=0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if ( m[i][j] > max){
                    max = m[i][j];
                    pos = j;
                }
            }
        }
        return pos;
    }

    //Ejercicio 7

    public int[] maxPos(int [][] m){
        int max = 0;
        int [] pos = new int[2];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if ( m[i][j] > max){
                    max = m[i][j];
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
    
    //Ejercicio 8

    public int[] indexPosition(int [][] m, int p){
        int [] pos = new int[2];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                if ( m[i][j] == p){
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }else{
                    pos[0] = -1;
                    pos[1] = -1;
                }
            }
        }
        return pos;
    }

    //Ejercicio 9

    public int rowSum(int [][] m, int row){
        int sum = 0;
        for (int i = 0; i < m[row].length; i++){
            sum += m[row][i];
        }
        return sum;
    }

    //Ejercicio 10

    public int colSum(int [][] m, int col){
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            sum += m[i][col];
        }
        return sum;
    }

    //Ejercicio 11

    public int [][] rowsExchange(int [][] m, int r1, int r2){
        int aux = 0;
        for (int i = 0; i < m.length; i++){
            aux = m[r1][i];
            m[r1][i] = m[r2][i];
            m[r2][i] = aux;
        }
        return m;
    }

    //Ejercicio 12

    public int [][] colsExchange(int [][] m, int c1, int c2){
        int aux = 0;
        for (int i = 0; i < m[0].length; i++){
            aux = m[i][c1];
            m[i][c1] = m[i][c2];
            m[i][c2] = aux;
        }
        return m;
    }

    //Ejercicio 13

    public int [][] rotateRigth(int [][] m){
        int a = m[m.length][m[0].length];
        for (int r = m.length; r >= 0 ; r--) {
            for (int c = m[0].length - 2 ; c >= 0 ; c-- ) {
                m[r+1][c+1] = m[r][c];
            }
            if (r >= 1) {
                m[r][0] = m[r-1][m.length-1];
            }
        }
        m[0][0] = a;
        return m;
    }

    //Ejercicio 14

    public int [][] rotateLeft(int [][] m){
        int a = m[0][0];
        for (int r = 0; r <= m.length; r++) {
            for (int c = 0; c < m[0].length ; c++ ) {
                m[r+1][c+1] = m[r][c];
            }
            if (r >= m.length-1) {
                m[r][0] = m[r-1][m.length-1];
            }
        }
        m[m.length-1][m[0].length] = a;
        return m;
    }

    //Ejercicio 15

    public int[][] matAddrMat(int[][] m1, int[][] m2){
        int [][] nu = new int[m1.length][m1[0].length];
        for (int i = 0; i < nu.length; i++){
            for (int j = 0; j < nu[0].length; j++){
                nu[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return nu;
    }

    //Ejercicio 16

    public int[][] matLessMat(int[][] m1, int[][] m2){
        int [][] nu = new int[m1.length][m1[0].length];
        for (int i = 0; i < nu.length; i++){
            for (int j = 0; j < nu[0].length; j++){
                nu[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return nu;
    }

    //Ejercicio 17

    public int[][] matPerMat(int[][] m1, int[][] m2){
        int [][] nu = new int[m1.length][m1[0].length];
        for (int i = 0; i < nu.length; i++){
            for (int j = 0; j < nu[0].length; j++){
                nu[i][j] = m1[i][j] * m2[i][j];
            }
        }
        return nu;
    }

    //Ejercicio 18

    public int[][] traspuesta(int[][]m1){
        int [][] tra = new int[m1[0].length][m1.length];
        for (int c = 0; c < m1.length; c++){
            for (int f = 0; f < m1[0].length; f++){
                tra[f][c] = m1[c][f];
            }
        }
        return tra;
    }

    //Ejercicio 19



}
