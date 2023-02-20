package arreglos2;

public class Multiplicacion {

	public static void main(String[] args) {
		int[][] matrizA = {
                {3, 2, 1},
                {1, 1, 3},
                {0, 2, 1},
        };
        int[][] matrizB = {
                {2, 1},
                {1, 0},
                {3, 2},
        };
        
        int[][] producto = new int[matrizB.length][matrizB[0].length];
        for (int a = 0; a < matrizB[0].length; a++) {
            for (int i = 0; i < matrizA.length; i++) {
                int suma = 0;
                for (int j = 0; j < matrizA[0].length; j++) {
                    suma += matrizA[i][j] * matrizB[j][a];
                }
                producto[i][a] = suma;
            }
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.printf("%d ", producto[i][j]);
            }
            System.out.print("\n");
        }
    }
}
