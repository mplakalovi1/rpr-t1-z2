package etf.unsa.ba;

import java.util.Scanner;

public class Main {
public static int sumaCifara(int broj){
    int suma=0;
    while(broj!=0){
        suma+=broj%10;
        broj/=10;
    }
return suma;}

    public static void main(String[] args) {
    System.out.println("Unesite prirodan broj n :");
        Scanner ulaz= new Scanner(System.in);
        int n=ulaz.nextInt();
        System.out.println("Brojevi izmedju 1 i " + n + " koji su djeljivi sa sumom svojih cifara su: ");

        for(int i =1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }
}
