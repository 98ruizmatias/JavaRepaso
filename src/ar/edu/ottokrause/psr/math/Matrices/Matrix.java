package ar.edu.ottokrause.psr.math.Matrices;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Matrix {


    //Vars

    private int row;
    private int col;
    private double [][] data;


    //Getters


    public int rows(){
        return this.row;
    }
    public int cols(){
        return this.col;
    }

    public double get(int i, int j){
        return this.data[i][j];
    }

    public void set(int i, int j, double value){
        this.data[i][j] = value;
    }


    public Matrix(int rows, int	cols){

        //Inicializr las variables de instancias

        this.row = rows;
        this.col = cols;
        this.data = new double[rows][cols];

    }


    public Matrix(Matrix m){
        this.data = new double[row][col];
        for (int i = 0; i < m.rows() ; i++) {
            for (int j = 0; j < m.cols() ; j++) {
                this.data[i][j] = m.get(i,j);
            }
        }
    }

    //

}
