/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg15;
/**
 *
 * @author Raziel 2
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Mostrar tabla 10x10 con numeros aleatorios y que muestre la suma de filas y columnas
        int [][]matriz = new int [11][11],suma; //Tabla
        int [][]m = crearTabla(matriz); // Se llena la tabla 
        mostrarTablaYSumas(m);          //Se muestra la tabla con las sumas al final de cada fila y columna
    }
    public static int[][]crearTabla(int [][]m){
        int x,i,j; 
        for (i=0;i<m.length;i++){
            for (j=0;j<m.length;j++){
            m[i][j] = (int) (Math.random()*10); //numeros aleatorios del 0 al 10
            if(j==10){                          //hasta la columna 10
                x=0;
                for (j=0; j<m.length-1; j++){ 
                    x = m[i][j] + x;            //ir sumando valores
        }
                m[i][j]=x;                      
        } else { m[i][j] = (int) (Math.random()*11);
        
         }
            if(i==10){                           //hasta la fila 10
                x=0;
                for (i=0; i<m.length-1; i++){
                    x = m[i][j] + x;             // ir sumando valores
        }
                m[i][j] = x;
            }
            }
        }
        return m;
    }
    public static void mostrarTablaYSumas(int[][]m){ //Se muestran las filas y las columnas
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                 if(j<10 && i<10){                  // hasta la fila y columna 10
                System.out.print(m [i][j] + "\t" ); //Imprimir matriz
    }else{                                               //En la fila 11 y columna 11...
                 System.out.print("= " +m[i][j]+"\t");  //Suma de filas y columnas
                }
            }
            System.out.print("\n");
    }
}
}