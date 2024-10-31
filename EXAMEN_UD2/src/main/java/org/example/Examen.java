package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int pc = 0;
        int usuario = 0;

        for (int i = 1; i <= 3; i++) {
            int op1 = random.nextInt(3) + 1;

            if (op1 == 1) {
                String piedra1 = "Piedra";
            } else if (op1 == 2) {
                String papel1 = "Papel";
            } else {
                String tijera1 = "Tijera";
            }

            System.out.println("Ronda " + i);
            System.out.print("¿Piedra, papel o tijera? (p/a/t): ");
            String op2 = entrada.next();

            if ((op2.equals("p") && op1 == 1) || (op2.equals("a") && op1 == 2) || (op2.equals("t") && op1 == 3)) {
                System.out.println("¡Empate!");
                System.out.println(" ");
                i--;
                continue;
            } else if ((op2.equals("p") && op1 == 2) || (op2.equals("a") && op1 == 3) || (op2.equals("t") && op1 == 1)) {
                System.out.println("¡Has perdido!");
                pc++;
            } else if ((op2.equals("p") && op1 == 3) || (op2.equals("a") && op1 == 1) || (op2.equals("t") && op1 == 2)) {
                System.out.println("¡Has ganado!");
                usuario++;
            }
            System.out.println("Marcador actual (PC-usuario): " + pc + " - " + usuario);
            System.out.println(" ");
        }
        if (usuario > pc) {
            System.out.println("¡GANA EL USUARIO!");
        } else {
            System.out.println("¡GANA EL ORDENADOR!");
        }
    }
    public void ejercicio2() {
        Scanner entrada = new Scanner (System.in);

        LocalDateTime fecha_hoy = LocalDateTime.now();
        int anyo = fecha_hoy.getYear();

        System.out.print("¿En qué año naciste?");
        int anyo_nac = entrada.nextInt();

        int edad = 0;

        if (anyo_nac < 1900 || anyo_nac > anyo) {
            System.out.println("No es posible introducir esta fecha");
        } else {
            while (anyo_nac <= anyo) {
                System.out.println(anyo_nac + " - edad: " + edad);
                anyo_nac++;
                edad++;
            }
        }
    }
}
