package com.soccer;

import java.util.Scanner;

import com.soccer.view.ViewPlayer;
import com.soccer.view.ViewTeam;

public class Main {
    public static void main(String[] args) {
        // controlador
        Controller ctrl = new Controller();

        // views
        ViewTeam vt = new ViewTeam();
        ViewPlayer vp = new ViewPlayer();

        // añade el controlador
        ViewTeam.controlador = ctrl;
        ViewPlayer.controlador = ctrl;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese el menu al que va ingresar");
            System.out.println("1. Menu team");
            System.out.println("2. Menu player");
            System.out.println("3. Menu Coach");
            System.out.println("4. Menu player");
            System.out.println("5. salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    vt.start();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    vp.start();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    
                    return;
            
                default:
                    break;
            }
        }


       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}