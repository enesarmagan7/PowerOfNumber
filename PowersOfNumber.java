package Letcode;

import java.util.Scanner;

public class PowersOfNumber {
    public static void main(String[] args) {
        int n,k;
        int power=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        n=sc.nextInt();
        System.out.println("Sayının üssünü giriniz: ");
        k=sc.nextInt();
        for(int i=0; i<k; i++){
            power*=n;
        }
        System.out.println("Cevap: "+ power);
    }
}
