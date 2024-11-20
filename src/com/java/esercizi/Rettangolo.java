package com.java.esercizi;
import java.util.Scanner;

public class Rettangolo {
    private double base;
    private double altezza;

    public void scannerDati (Scanner scanner) {
        System.out.println("Scrivi la base");
        this.base = scanner.nextDouble();

        System.out.println("Scrivi l'altezza");
        this.altezza = scanner.nextDouble();
    }

    public double calcoloPerimetro () {
        return 2 * (this.base + this.altezza);
    }

    public double calcoloArea () {
        return this.base * this.altezza;
    }

    public void stampaRettangolo() {
        System.out.println("Base: " + this.base);
        System.out.println("Altezza: " + this.altezza);
        System.out.println("Il perimetro è: " + calcoloPerimetro());
        System.out.println("L'area è: " + calcoloArea());
    }

    public void stampaDueRettangoli(Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Rettangolo " + (i + 1) + ":");
            scannerDati(scanner);
            stampaRettangolo();
        }
    }
}
