package arreglos2;

public class numeromayor {
	
	int[] numeros = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
	int mayor = numeros[0]
	for (int x = 1; x < numeros.length; x++) {
		if (numeros[x] > mayor) {
			mayor = numeros[x];
		}
	}
	System.out.println("El mayor es: " + mayor);
}
