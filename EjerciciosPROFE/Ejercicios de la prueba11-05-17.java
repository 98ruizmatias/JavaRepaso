public class Evaluacion{

	/*Tarea: Implementar fibonachi en c

	fib(0) = 0
	fib(1) = 1
	fib(n) = fib(n-1) + fib(n-2)
	
	*/
	

	//Ejercicio 1

	public static long combinatorio(int p, int q){
		return factorial(p)/(factorial(q)*factorial(p-q));
	}

	public static long factorial(int n){ //en la implementacion hay que chequear que lo ingrsado no sea negativo
		long factorial = 1;
		for (int i = 2; i <= n ; i++) {
			factorial = factorial * i; // factorial *= i;
		}
		return factorial;
	}

	public static long factorial2(int n){ //Caso recursivo de el factorial
		if (n == 0 || n == 1) {
			return 1;
		}
		return n*factorial2(n-1);
	}

	//Ejercicio 2

	public static int productoEscalar(int[] a, int[] b){
		int prod = 0;
		for (int i = 0; i < a.length ; i++) {
			prod += a[i] * b[i];
		}
		return prod;
	}

	//Ejercicio 3

	public static int[] inser(int[]a, int value){
		int i = a.length-1;
		for ( ; i >= 1 && a[i-1] > vlaue; i--) {
			a[i] = a[i-1];
		}
		a[i] = value;
		return a;
	}

	//Ejercicio 4 (busqueda binaria) (hacer en forma de funcion recursiva de TAREA)

	public static boolean conatains(int[] ,int value){
		int l = 0;
		int h = a.length-1;
		while (l >= h) {
			int m = ( ( h - l ) / 2 ) + l; //Esta es la verdadera forma de dividir el arrelgo a la mitad. Otra forma de escribirlo: m = ( h + kl ) / 2
			if (a[m] == value) {
				return true;
			}
			if ( value > a[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return false;
	}

}