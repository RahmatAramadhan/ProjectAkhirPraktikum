/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectakhirpraktikum;
/**
 *
 * @author macbook
 */
import java.util.Scanner;

public class ProjectAkhirPraktikum {
    
    static Scanner masuk=new Scanner(System.in);
    public static void main(String[] args) {
        int matrix1[][]=masukanmatrix(1);
        int matrix2[][]=masukanmatrix(2);
        pilihan(matrix1,matrix2);   
        
    }
    static int[][] masukanmatrix(int bagian){
        int baris,kolom;
        System.out.println("Masukkan ordo matrix ke "+bagian);
        System.out.print("Baris = ");
        baris=masuk.nextInt();
        System.out.print("Kolom = ");
        kolom=masuk.nextInt();
        return matrix(baris,kolom,bagian);
        
    }
    static int[][]matrix(int baris,int kolom, int bagian){
        int matrix[][]=new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("matrix "+bagian+"["+i+1+"]["+j+1+"]");
                matrix[i][j]=masuk.nextInt();
            }
        }
        return matrix;
    }
    static void pilihan(int matrix1[][],int matrix2[][]){
        int pilihan;
        System.out.println("pilih operasi: ");
        System.out.println("1. Penjumlahan\n2. Pengurangan\n3. perkalian");
        pilihan=masuk.nextInt();
        pilihoperasi(pilihan,matrix1,matrix2);
        
    }
    static void pilihoperasi(int pilihan, int matrix1[][], int matrix2[][]){
        switch(pilihan){
            case 1:
                penjumlahan(matrix1,matrix2);
                ulang();
                break;
            case 2:
                pengurangan(matrix1,matrix2);
                ulang();
                break;
            case 3:
                perkalian(matrix1,matrix2);
                ulang();
                break;
            default:
                System.out.println("maaf pilihan anda tidak tersedia");
                ulang();
        }
    }
    static void penjumlahan(int matrix1[][], int matrix2[][]){
        if (matrix1.length==matrix2.length&&matrix1[0].length==matrix2[0].length) {
            System.out.println("Penjumlahan matriks ");
            System.out.println("Hasil penjumlahan Kedua Matriks Tersebut adalah");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    System.out.printf("%-3d",(matrix1[i][j]+matrix2[i][j])," ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Ordo matrix Berbeda Tidak bisa di jumlahkan");
        }
    }
    static void pengurangan(int matrix1[][], int matrix2[][]){
        if (matrix1.length==matrix2.length&&matrix1[0].length==matrix2[0].length) {
            System.out.println("Penjumlahan matriks ");
            System.out.println("Hasil penjumlahan Kedua Matriks Tersebut adalah");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    System.out.printf("%-3d",(matrix1[i][j]-matrix2[i][j])," ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Ordo matrix Berbeda Tidak bisa di jumlahkan");
        }
    }
    static void perkalian(int matrix1[][],int matrix2[][]){
        if (matrix1[0].length==matrix2.length) {
            int total=0;
            int hasil[][]= new int[matrix2[0].length][matrix2[0].length];
            System.out.println("Perkalian Matriks");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int l = 0; l < matrix2.length; l++) {
                        total = total+matrix1[i][l]*matrix2[l][j];
                    }
                    hasil[i][j]=total;
                    total=0;
                }
            }
            for (int i = 0; i < hasil.length; i++) {
                for (int j = 0; j < hasil[0].length; j++) {
                    System.out.printf("%-3d",hasil[i][j]," ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Maaf matrix tidak bisa dikalikan");
        }
    }
    static void ulang(){
        System.out.println("apakah ingin mengulang ? (Ya/Tidak)");
        masuk.nextLine();
        String pilih=masuk.nextLine();
        if (pilih.equalsIgnoreCase("Ya")) {
            main(null);
        }else{
            System.exit(0);
        }
    }
}
