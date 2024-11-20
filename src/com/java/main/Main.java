package com.java.main;
import com.java.esercizi.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Esercizio 1
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.stampaDueRettangoli(scanner);

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        //Esercizio 2
        Sim sim = new Sim();
        sim.scannerDati(scanner);
        sim.stampaSIM();

        scanner.close();
    }
}