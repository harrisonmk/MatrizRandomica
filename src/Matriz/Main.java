package Matriz;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random gerador = new Random(); //declara variavel randomica

        int[][] matriz = new int[9][9]; //declara matriz 9 x 9

        //atribui os valores a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = 1 + gerador.nextInt(9);//gera numeros aleatorios de 1 a 9

            }

        }

        //imprime a matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.print(" " + matriz[i][j]);

            }
            System.out.println();
        }

        System.out.println();
    }

}
