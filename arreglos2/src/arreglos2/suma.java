package arreglos2;

import java.util.Random;

public class suma {
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
}
 
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

static void inicializar(int[][] matriz){
     Random r = new Random();
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            matriz[i][j] = r.nextInt(11); 
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
