package arreglos2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        int[][] matrizD = {
                {10, 5, 12},
                {98, 5, 6},
                {8, 4, 6},
                };

        int[] numeros = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
        int mayor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
        	if (numeros[x] > mayor) {
     		mayor = numeros[x];
        	}
        }
     System.out.println("El mayor es: " + mayor);
     
     int[][] matriz1 = new int[5][5];
     int[][] matriz2 = new int[5][5];
     inicializar(matriz1);
     System.out.println("MATRIZ 1");
     visualizar(matriz1);
     inicializar(matriz2);
     System.out.println("\nMATRIZ 2");
     visualizar(matriz2);
     int[][] matrizSuma = sumaMatrices(matriz1, matriz2);
     if(matrizSuma==null){
         System.out.println("\nNo se puede realizar la suma de las matrices.");
     } else {
         System.out.println("\nMATRIZ SUMA");
         visualizar(matrizSuma);
     }
     
     System.out.println("El resultado de la multiplicación de matrices es: ");
        
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
        
        System.out.println("La matriz es (suma de la diagonal): ");
    	imprimirMatriz(matrizD);
    	int sumaPrincipal = sumarDiagonal(matrizD, "p");
    	int sumaSecundaria = sumarDiagonal(matrizD, "s");
    	System.out.printf("La suma de la diagonal principal es %d y la de la secundaria es %d\n", sumaPrincipal, sumaSecundaria);
    	
    	
        
///////////////////////////////////////////
        
        int[][] matrizCuadrada = new int[5][5];
        inicializar(matrizCuadrada);
        System.out.println("Matriz cuadrada original\n");
        visualizar(matrizCuadrada);
        transponerMatrizCuadrada(matrizCuadrada);
        System.out.println("\n\nMatriz cuadrada transpuesta\n");
        visualizar(matrizCuadrada);
         
        int[][] matriz = new int[5][3];
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        inicializar(matriz);
        System.out.println("\nMatriz original\n");
        visualizar(matriz);     
        transponerMatriz(matriz, transpuesta);
        System.out.println("\n\nMatriz transpuesta\n");
        visualizar(transpuesta);
    }
     
    static void transponerMatriz(int[][] matriz, int[][] transpuesta){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
     
    static void transponerMatrizCuadrada(int[][] matriz){
        int aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){ if(i>j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }
    }
     
    static void inicializar(int[][] matriz){
         Random r = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(25) + 1; 
            }
        }
    }
 
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
///////////////////////////////////////////////////////////
static void imprimirMatriz(int[][] matrizD) {
    for (int y = 0; y < matrizD.length; y++) {
        for (int x = 0; x < matrizD[y].length; x++) {
            int numeroActual = matrizD[y][x];
            System.out.printf("%5d", numeroActual);
        }
        System.out.println();
    }
}

static int sumarDiagonal(int[][] matriz, String diagonal) {
    int suma = 0;
    if (diagonal.equals("p")) {
        int x = 0, y = 0;
        while (x < matriz.length && y < matriz[0].length) {
            suma += matriz[y][x];
            x++;
            y++;
        }
    } else {
        int x = 0, y = matriz.length - 1;
        while (x < matriz.length && y >= 0) {
            suma += matriz[y][x];
            x++;
            y--;
        }
    }
    return suma;
}

//////////////////////////////

static int[][] sumaMatrices(int[][] pMatriz1, int[][] pMatriz2){
    int[][] matrizSuma;
    int filas1 =pMatriz1.length;
    int columnas1 = pMatriz1[0].length;
    int filas2 =pMatriz2.length;
    int columnas2 = pMatriz2[0].length;
     
    if(filas1 == filas2 && columnas1 == columnas2){
        matrizSuma = new int[filas1][columnas1];
        for(int i=0;i<pMatriz1.length;i++){
            for(int j=0;j<pMatriz1[0].length;j++){
                matrizSuma[i][j] = pMatriz1[i][j] + pMatriz2[i][j];
            }
        }
        return matrizSuma;
    } else {
        return null;
    }
}

static void inicializar2(int[][] matrizS){
     Random r = new Random();
    for(int i=0;i<matrizS.length;i++){
        for(int j=0;j<matrizS[i].length;j++){
            matrizS[i][j] = r.nextInt(11); 
        }
    }
}

static void visualizar2(int[][] matrizS){
    for(int i=0;i<matrizS.length;i++){
        for(int j=0;j<matrizS[i].length;j++){
            System.out.print(matrizS[i][j] + "\t");
        }
        System.out.println();
    }
}
}

    