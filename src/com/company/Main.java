package com.company;
import java.util.Scanner;

public class Main {

    private String[] mas= new String[5];

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.Masyvas();
        objektas.Rasymas();
    }

    public void Masyvas(){
        Scanner sc = new Scanner(System.in);
        mas = new String[5];
        for (int i=0; i<mas.length; i++){
            System.out.println("Įveskite žodį: ");
            mas[i]=sc.nextLine();
        }
    }

    public void Rasymas(){
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " zodis yra "+mas[i]);
        }
    }
}