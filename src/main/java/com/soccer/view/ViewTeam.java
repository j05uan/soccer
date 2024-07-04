package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class ViewTeam {
    public static Controller controlador;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                        System.out.print("\033[H\033[2J");
                        Team equipo = new Team();
                        String codigoEquipo = null;
                        System.out.println("Ingrese el codigo del equipo :");
                        codigoEquipo = scanner.nextLine();
                        System.out.println("Ingrese Nombre del equipo :");
                        equipo.setNombre(scanner.nextLine());
                        System.out.println("Ingrese la ciudad :");
                        equipo.setCiudad(scanner.nextLine());
                        controlador.equipos.put(codigoEquipo, equipo);
                    break;

                case 2:
                        System.out.print("\033[H\033[2J");
                        System.out.println("Digite el codigo del equipo a actualizar:");
                        codigoEquipo = scanner.nextLine();
                        if(!controlador.equipos.containsKey(codigoEquipo)){
                            System.out.print("\033[H\033[2J");
                            System.out.println("No se encontro el equipo");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        }
                    
                    Team equ = controlador.equipos.get(codigoEquipo);
                    System.out.println("1. Cambiar nombre");
                    System.out.println("2. Cambiar ciudad");
                    System.out.println("3. Agregar jugador");
                    System.out.println("4. Salir");
                    int op = scanner.nextInt();
                    scanner.nextLine();
                    switch (op) {
                        case 1:
                            System.out.print("\033[H\033[2J");
                            System.out.println("Ingrese el nuevo nombre");
                            equ.setNombre(scanner.nextLine());
                            System.out.println("Equipo actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        case 2:
                            System.out.print("\033[H\033[2J");
                            System.out.println("Ingrese la nueva ciudad");
                            equ.setNombre(scanner.nextLine());
                            System.out.println("Equipo actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        case 3:
                            System.out.print("\033[H\033[2J");
                            System.out.println("Ingrese el codigo del jugador");
                            String codJugador = scanner.nextLine();
                            equ.setLstJugadores(controlador.getJugadoresById(codJugador));

                        case 4:
                            System.out.print("\033[H\033[2J");
                            break;
                    
                        default:
                            System.out.println("La opcion no es valida");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                    }


                    break;

                case 3:
                    // Team eq = new Team();
                    // String codigoE = "equ-1";
                        System.out.print("\033[H\033[2J");
                        System.out.println("Digite el codigo del equipo a actualizar:");
                        codigoEquipo = scanner.nextLine();
                        if(!controlador.equipos.containsKey(codigoEquipo)){
                            System.out.println("No se encontro el equipo");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        }
                        
                        Team eq = controlador.getEquipoById(codigoEquipo);
                        System.out.println("Mi equipo" + eq.getNombre());
                        break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Ingrese el codigo del equipo a eliminar:");
                    codigoEquipo = scanner.nextLine();
                    if (!controlador.equipos.containsKey(codigoEquipo)) {
                        System.out.println("No se encontró el equipo");
                    } else {
                        controlador.equipos.remove(codigoEquipo);
                        System.out.println("Equipo eliminado correctamente");
                    }
                    scanner.nextLine();
                    break;

                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Listado de todos los equipos:");
                    for (String key : controlador.equipos.keySet()) {
                        Team team = controlador.equipos.get(key);
                        System.out.println("Código: " + key + ", Nombre: " + team.getNombre() + ", Ciudad: " + team.getCiudad());
                        for(Player jug : team.getLstJugadores()){
                            System.out.println("id: " + jug.getId() + " | nombre : " + jug.getNombre());
                        }
                    }
                    scanner.nextLine();
                    break;

                case 6:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Saliendo del programa");
                    return;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Opcion invalida, intentelo de nuevo.");
                    scanner.nextLine();
                    break;
            }
        }
    }
}
