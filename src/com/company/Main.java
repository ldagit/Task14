package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int numb[] = new int[10];
        int i;
        Scanner in = new Scanner(System.in);
        //Ввод массива
        System.out.println("Введите в массив 10 целых чисел: ");
        for (i=0; i<10; ++i){
            System.out.printf("numb[%d] = ", i);
            numb[i] = in.nextInt();
        }
        //Сортировка массива
        for(i = 9 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( numb[j] > numb[j+1] ) {
                    int tmp_n = numb[j];
                    numb[j] = numb[j + 1];
                    numb[j + 1] = tmp_n;
                }
            }
        }
        //Вывод отсортированного массива
        for (i=0; i<10; ++i){
            System.out.print(numb[i] + " ");
        }
    }
}