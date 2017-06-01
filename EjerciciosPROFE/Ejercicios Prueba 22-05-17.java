/*Ejercicio 1*/

public class Vector{
	/*...*/
	public double productoEscalar(Vector o{
		double producto = 0;
		for (int i = 0 ; i < this.size() ; i++) {
			producto += this.get(i) * o.get(i);
		}
		return producto;
	}
}


public static boolean ortogonal(Vector [] a){
	for (int i = 0;i < a.length;i++) {
		for (int j = 0; j < a.length ; j++) {
			if ( i != j ) {
				if ( i != j){
					if ( a[i].productoEscalar(a[j]) != 0) {
						return false;
					}
				} 				
			}
		}
	}
	return true;
}

/*Ejercicio 2*/

public static double area(Figure [] f){
	double a = 0;
	for (int i = 0; i < f[i].length ; i++) {
		a += f.area();
	}
	return a;
}

public static double perimetro(Figure [] f){
	double a = 0;
	for (int i = 0; i < f.length ; i++) {
		a += f[i].perimetro();
	}
	return a;
}


/*Ejercicio 3*/

public class IntegerArrayList{

	public occurrences(int value){
		int count = 0;
		for (int i = 0; i < this.size() ; i ++ ) {
			if ( this.get(i) == value) {
				count++
			}
		}
		return count;
	}

}

/*Ejercicio 4*/

public class Matrix{

	public Matrix rotate(){
		double a = this.get(this.rows-1(), this.cols()-1);
		for (int r = this.rows()-1; r >= 0 ; r--) {
			for (int c = this.cols() - 2 ; c >= 0 ; c-- ) {
				this.set(r,c+1, this.get(r,c));
			}
			if (r >= 1) {
				this.set(r,0,this.get(r-1,this.rows()-1))
			}
		}
		this.set(0,0,a);
		return this;
	}

	public Matrix rotateN(int n){
		for (int i = 0 ; i < n ; n++ ) {
			this.rotate();
		}
		return this;
	}

}
