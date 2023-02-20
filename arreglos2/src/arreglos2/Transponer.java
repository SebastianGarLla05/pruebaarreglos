package arreglos2;

public class Transponer {
	
	public static void main(String[] args) {
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

}
