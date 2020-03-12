package com.company;


public class Main {
    //problema2
    public static boolean isSymmetric(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = i + 1; j < matr.length; j++) {
                if (matr[i][j] != matr[j][i])
                    return false;
            }
        }
        return true;
    }

    public static void problema1() {
        Coada c = new Coada(4);
        c.push(10);
        c.push(1);
        c.push(12);
        c.push(14);
        System.out.println("--------Problema 1----------");
        System.out.println(c);
        System.out.println("s-a scos elem " + c.pop());
        System.out.println("Coada este goala " + c.isEmpty());
        System.out.println("s-a scos elem " + c.pop());
        System.out.println("s-a scos elem " + c.pop());
        System.out.println("s-a scos elem " + c.pop());
        System.out.println("Coada este goala " + c.isEmpty());
        System.out.println(c);
    }

    public static void problema2() {
        int[][] matrix = {{1, 7, 3}, {7, 4, -5}, {3, -5, 6}};
        System.out.println("--------Problema 2--------");
        System.out.println(isSymmetric(matrix));
    }

    public static void problema3() {
        int[][] matrix1 = {{1, 7, 3}, {7, 4, -5}, {3, 6, -1}};
        int[][] matrix2 = {{1, 7, 8}, {3, -5, 9}, {7, -5, 6}};
        Matrice m1 = new Matrice(matrix1, 3, 3);
        Matrice m2 = new Matrice(matrix2, 3, 3);
        System.out.println("--------Problema 3--------");
        System.out.println(m1.add(m2));
        System.out.println(m1.multiply(m2));
        System.out.println(m1.pow(2));
    }

    public static void problema4() {
        Maximum x = new Maximum(10);
        System.out.println("--------Problema 4--------");
        System.out.println(x.maxim(13));
        System.out.println(x.maxim(13, 17));
        System.out.println(x.maxim(13, 15, 6));
        System.out.println(x.maxim(1, 11, 2, 5));

    }

    public static void problema5() {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, 15);
        Complex c3 = new Complex();
        System.out.println("--------Problema 5--------");
        System.out.println("c1= " + c1.toSting() + "\nc2= " + c2.toSting());
        System.out.println("Sunt egale? " + c1.equals(c2));
        System.out.println("Suma este: " + c1.sum(c2).toSting());

    }

    public static void main(String[] args) {
        problema1();
        problema2();
        problema3();
        problema4();
        problema5();


    }
}

