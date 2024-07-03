package com.soccer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller ctrlTeams = new Controller();
        viewTeam.controlador = ctrlTeams;
        viewTeam vt = new viewTeam();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el menu al que va ingresar");
            System.out.println("1. Menu team");
            System.out.println("2. salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    vt.start();
                    break;
                case 2:
                    sc.close();
                    return;
            
                default:
                    break;
            }
        }


       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}