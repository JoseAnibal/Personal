
package matrices;


public class Matrices {

public static void main(String[] args) {
    
        //Matriz de 3 filas y 4 columnas
        int[][] matriz=new int [3][4];
        //Accediendo a la fila 2, columna 0
        System.out.println("ANTES: "+matriz[2][3]);
        matriz[2][3]=45;
        System.out.println("DESPUES: "+matriz[2][3]);
        //--------------------------------------------------
        //Matriz de 3 filas y 2 columnas
        int[][] otra={{3,2},
                      {1,5},
                      {6,7}};
        System.out.println(otra[0][1]);
        //--------------------------------------------------
        char[][] letras={{'g','p','e','x','y'},
                         {'a','e','i','o','u'}
                                            };
        
        //filas que tiene una matriz
        System.out.println(letras.length);
        //saber cuantas columnas tiene una matriz
        System.out.println(letras[0].length);
        
        //Seria totalmente lícito:
        //Matrices irregulares
        //Para nosotros como si no existieran
        int[][] matriz_loca={
            {1,2,3,4},
            {8,9},
            {1},
            {7,8,9,3,4}
        };
        
        
        
        
        
    }
    
}
