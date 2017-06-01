public class Matrix {
	private int rows;
	private int cols;
	private double[][] data;

	//Constructor


	//this: es la primera instruccion del Constructor

	public Matrix(int rows, int	cols){
		
		//Inicializr las variables de instancias
		
		this.rows = rows;
		this.cols = cols;
		this.data = new double[rows][cols];
	
	}

	public Matrix(double[][]data){

		//Inicializar variables de instancia

		this(data.length, data[0].length);
		/*
		this.data = data.length;
		this.cols = data[0].length;
		this.data = new double[rows][cols];
		*/

		for (int i = 0; i < this.rows ;  i++) {
			for (int j = 0; j < this; j++) {
				this.data[i][j] = data[i][j];
			}
		}

	}

	 /*Constructor de copia*/

	public Matrix(Matrix m){
		this.data = new double[rows][cols];
		for (int i = 0; i < m.rows() ; i++) {
			for (int j = 0; j < m.cols() ; j++) {
				this.data[i][j] = m.set(i,j);	
			}
		}
	}


	//Some methods

	public int rows(){
		return this.rows;
	}
	public int cols(){
		return this.cols;
	}

	public double get(int i, int j){
		return this.data[i][j];
	}

	public void set(int i, int j, double value){
		this.data[i][j] = value;
	}


	public Matrix add(Matrix m){
		//completar
	}

	public Matrix prod(Matrix m){

	}

}