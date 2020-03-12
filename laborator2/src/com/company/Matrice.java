package com.company;

import java.util.Arrays;

public class Matrice {
    private int[][] matrix;
    private int rows, columns;

    public Matrice(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];

    }

    public Matrice(int[][] matrix, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = matrix;
    }

    public Matrice add(Matrice m2) {
        if (this.rows != m2.rows || this.columns != m2.columns)
            return null;
        Matrice m3 = new Matrice(this.rows, this.columns);
        for (int i = 0; i < m2.rows; i++) {
            for (int j = 0; j < m2.columns; j++)
                m3.matrix[i][j] = this.matrix[i][j] + m2.matrix[i][j];
        }
        return m3;
    }

    public Matrice multiply(Matrice m2) {
        if (this.columns != m2.rows)
            return null;
        Matrice m3 = new Matrice(this.rows, m2.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    m3.matrix[i][j] += this.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return m3;
    }
    public Matrice pow(int power){
        Matrice m2 = new Matrice(this.matrix,this.rows, this.columns);

        for(int i = 1; i < power;i++) {
            m2 = m2.multiply(this);
        }
        return m2;
    }


    public String toString() {
        String matr = "";
        for (int[] i : this.matrix)
            matr = matr + Arrays.toString(i) + " ";

        return matr;
    }

}
