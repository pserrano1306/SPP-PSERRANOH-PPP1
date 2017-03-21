/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.ppp1;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHPPP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     mostrarMenu();
    }
    static void mostrarMenu(){
        int n;
        System.out.println("Programa para calcuular matrices");
        System.out.println("Cual operacion quiere utilizar en sus matrices");
        System.out.println("1.- Suma de matrices");
        System.out.println("2.- Resta de matrices");
        System.out.println("3.- Multiplicacion de matrices");
        Scanner kb = new Scanner (System.in);
        n= kb.nextInt();
        switch(n){
           case 1:
                sumaArreglos();
                break;
           case 2:
                restaArreglos();
                break;
            case 3:
                 multiplicarArreglo();
                 break;
        }
    
}
    static void sumaArreglos(){
        int arreglo1[][];
        int f,c;
        int datoCasilla1;
        int arreglo2[][];
        int datoCasilla2;
        int s;
        Scanner kb = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas");
        f= kb.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c= kb.nextInt();
        arreglo1 = new int [f][c];
        for(int i = 0; i<arreglo1.length ; i++){
        for(int j = 0; j<arreglo1.length ; j++){  
            System.out.println("Ingrese el dato que se guardara en esta casilla");
            Scanner entradaCasilla1 = new Scanner (System.in);
            datoCasilla1= entradaCasilla1.nextInt();
            arreglo1[i][j]=datoCasilla1;
        }
        }
        arreglo2 = new int [f][c];
        for(int i=0; i<arreglo2.length; i++){
        for(int j=0; j<arreglo2.length; j++){
            System.out.println("Ingrese el dato que se guardara en la casilla");
            Scanner entradaCasilla2 = new Scanner(System.in);
            datoCasilla2= entradaCasilla2.nextInt();
            arreglo2[i][j]= datoCasilla2;
            
        }
}
        for(int i=0; i<arreglo1.length; i++){
        for(int j=0;j<arreglo1.length;j++){
            s= arreglo1[i][j] + arreglo2[i][j];
            System.out.println("La suma de las matrices es "+s);
        }    
        }
}
     static void restaArreglos(){
        int arreglo1[][];
        int f,c;
        int datoCasilla1;
        int arreglo2[][];
        int datoCasilla2;
        int s;
        Scanner kb = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas");
        f= kb.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c= kb.nextInt();
        arreglo1 = new int [f][c];
        for(int i = 0; i<arreglo1.length ; i++){
        for(int j = 0; j<arreglo1.length ; j++){  
            System.out.println("Ingrese el dato que se guardara en esta casilla");
            Scanner entradaCasilla1 = new Scanner (System.in);
            datoCasilla1= entradaCasilla1.nextInt();
            arreglo1[i][j]=datoCasilla1;
        }
        }
        arreglo2 = new int [f][c];
        for(int i=0; i<arreglo2.length; i++){
        for(int j=0; j<arreglo2.length; j++){
            System.out.println("Ingrese el dato que se guardara en la casilla");
            Scanner entradaCasilla2 = new Scanner(System.in);
            datoCasilla2= entradaCasilla2.nextInt();
            arreglo2[i][j]= datoCasilla2;
            
        }
}
        for(int i=0; i<arreglo1.length; i++){
        for(int j=0;j<arreglo1.length;j++){
            s= arreglo1[i][j] - arreglo2[i][j];
            System.out.println("La resta de las matrices es "+s);
        }    
        }
}
      static void multiplicacionArreglos(){
        int arreglo1[][];
        int f,c;
        int datoCasilla1;
        int arreglo2[][];
        int datoCasilla2;
        int s;
        Scanner kb = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas");
        f= kb.nextInt();
        System.out.println("Ingrese el numero de columnas");
        c= kb.nextInt();
        arreglo1 = new int [f][c];
        for(int i = 0; i<arreglo1.length ; i++){
        for(int j = 0; j<arreglo1.length ; j++){  
            System.out.println("Ingrese el dato que se guardara en esta casilla");
            Scanner entradaCasilla1 = new Scanner (System.in);
            datoCasilla1= entradaCasilla1.nextInt();
            arreglo1[i][j]=datoCasilla1;
        }
        }
        arreglo2 = new int [f][c];
        for(int i=0; i<arreglo2.length; i++){
        for(int j=0; j<arreglo2.length; j++){
            System.out.println("Ingrese el dato que se guardara en la casilla");
            Scanner entradaCasilla2 = new Scanner(System.in);
            datoCasilla2= entradaCasilla2.nextInt();
            arreglo2[i][j]= datoCasilla2;
            
        }
}
        for(int i=0; i<arreglo1.length; i++){
        for(int j=0;j<arreglo1.length;j++){
            s= arreglo1[i][j] * arreglo2[i][j];
            System.out.println("La multiplicacion de las matrices es "+s);
        }    
        }
}
}