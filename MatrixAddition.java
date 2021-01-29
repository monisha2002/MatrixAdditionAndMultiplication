//Matrix addition

package com.company;



public class Main {

    public static void main(String[] args) {
        int firstMatrix[][]={{1,3,4},{2,4,3},{3,4,5}};
        int secondMatrix[][]={{1,3,4},{2,4,3},{1,2,4}};


        int finalMatrix[][]=new int[3][3];


        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                finalMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
                System.out.print(finalMatrix[i][j]+" ");
            }

        }
    }
}
