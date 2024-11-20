package com.java.esercizi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sim {
    private String phoneNumber;
    private double phoneCredit;
    private List<String> lastCalls;


    public void scannerDati(Scanner scanner) {
        System.out.println("Inserire numero di telefono");
        this.phoneNumber = scanner.nextLine();
        this.phoneCredit = 0;
        this.lastCalls = new ArrayList<>();
    }

    public void stampaSIM() {
        System.out.println("Dettaglio SIM:");
        System.out.println("+39 " + this.phoneNumber);
        System.out.println("Credito residuo: " + this.phoneCredit);
        if (lastCalls.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (String call : lastCalls) {
                System.out.println("- " + call);
            }
        }
    }
}
