/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20250901;

/**
 *
 * @author UFG
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        // TODO code application logic here
      matriz();
    }
    
    public static void matriz(){
        
        Scanner scanner = new Scanner(System.in);//scanner para lectura
        
        int[][] matriz = new int[3][3];
        
        int suma = 0;//var para digitos
        int total_elementos = 0;//contador matriz
        double promedio = 0d;//calc promedio de edades digitadas
        //indica al usuario que ingrese datos
        System.out.println("Ingrese los valores para matriz 3 x 3");
        //se recorre primero las filas
        for(int i= 0; i <matriz.length; i++){
            //cantidad de columnas
            total_elementos += matriz[i].length;      //+ se agrega para que          
            for(int j=0; j < matriz[i].length; j++){
                //se recorren las columna, obteniendo la celdda
                System.out.println("Elemento[ "+i+" ] [ "+j+" ]" );//imprime para peticion
                matriz[i][j] = scanner.nextInt();//lectura del teclado
                               
            }//cierre para obtener columnas
            
        }//cierre para obtener filas
        
        //Salida de valores para el usuario
        
        System.out.println("Matriz ingresada: ");
        //se recorren las fials de la matriz
        for(int x = 0; x < matriz.length; x++ ){
            //se recoreen las columnas de la matriz
            for(int y = 0; y < matriz[x].length; y++){//se vuelve un array
                System.out.print(matriz[x][y]+" ");//imprime el valor de cada celda de la matriz(fila,columna)(x,y), solo print para que no haga salto de linea
                //se suman los valores digitados en cada celda
                suma+= matriz[x][y];
                
            }
            //se imprime un salto de linea
            System.out.println();
            
        }
        
        //calculo de los valores
        
        promedio = (double) suma/total_elementos; //double para que pase a decimal
        //se imprime la salida del programa con los valores calculados
        System.out.println(suma+" es la  sumatoria total de los elementos, la cantidad total de elementos digitados es: "+total_elementos);
        System.out.println("El promedio de edad es: "+promedio);
        //se cierra el uso de la clase scanner
        scanner.close();
    }
    
    
    
    
}
