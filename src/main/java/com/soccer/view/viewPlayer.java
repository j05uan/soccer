package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;

public class viewPlayer {

       public static Controller controlador;

       public void start(){
              Scanner scanner = new Scanner(System.in);
              
              while (true){
                     System.out.println("1. Crear Jugador");
                     System.out.println("2. Actualizar Jugador");
                     System.out.println("3. Buscar Jugador");
                     System.out.println("4. Eliminar Jugador");
                     System.out.println("5. Listar todos Jugador");
                     System.out.println("6. Salir");
                     int choice = scanner.nextInt();
                     scanner.nextLine();

                     switch (choice) {
                            case 1:
                                   Player jugador = new Player();
                                   String codigoJugador = null;
                                   System.out.println("Ingrese el codigo del Jugador: ");
                                   codigoJugador = scanner.nextLine();
                                   System.out.println("Ingrese el nombre del Jugador: ");
                                   jugador.setNombre(scanner.nextLine());
                                   System.out.println("Ingrese los Apellidos del Jugador: ");
                                   jugador.setApellido(scanner.nextLine());
                                   System.out.println("Ingrese la edad del jugador:  ");
                                   jugador.setEdad(scanner.nextInt());
                                   System.out.println("Ingrese el numero del dorsal del Jugador: ");
                                   jugador.setDorsal(scanner.nextInt());
                                   System.out.println("Ingrese la posicion del Jugador: ");
                                   jugador.setPosicion(scanner.nextLine());
                                   controlador.jugadores.put(codigoJugador, jugador);
                                   break;
                            case 2:
                                   System.out.println("----Menu de Actualizacion de jugadro -----");
                                   System.out.println("Ingrese el ocdigo del Jugador");
                                   codigoJugador = scanner.nextLine();
                                   if(!controlador.jugadores.containsKey(codigoJugador)){
                                          System.out.println("No se encontro el Jugador");
                                          System.out.println("Oprima neter para continuar- ");
                                          scanner.nextLine();
                                          break;
                                   }
                                   Player jugadorr = controlador.jugadores.get(codigoJugador);
                                   System.out.println("Seleccione la opcion que deseas actulizar: ");
                                   System.out.println("1. Actualizar el nombre");
                                   System.out.println("2. Actualizar los Apellidos");
                                   System.out.println("3. Actualizar la edad");
                                   System.out.println("4. Actualizar el numero del dorsal");
                                   System.out.println("5. Actualizar la posicion");
                                   System.out.println("6. Salir.");
                                   int op = scanner.nextInt();
                                   scanner.nextLine();
                                   switch (op) {
                                          case 1:
                                                 System.out.println(" Ingrese el nuevo la acrualizacion del nombre: ");
                                                 jugadorr.setNombre(scanner.nextLine());
                                                 System.out.println("Jugador actualizado exitosamente");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                          case 2:
                                                 System.out.println("Ingrese el nuevo Apellido:  ");
                                                 jugadorr.setApellido(scanner.nextLine());
                                                 System.out.println("Jugador actualizado exitosamente");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                          case 3:
                                                 System.out.println("Ingrese la acutilizacion de la edad: ");
                                                 jugadorr.setEdad(scanner.nextInt());
                                                 System.out.println("Jugador actualizado exitosamente");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                          case 4:
                                                 System.out.println("Ingrese la actulizacion del dorsal: ");
                                                 jugadorr.setDorsal(scanner.nextInt());
                                                 System.out.println("Jugador actualizado exitosamente");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                          case 5:
                                                 System.out.println("Ingrese la actulizacion de la posicion: ");
                                                 jugadorr.setPosicion(scanner.nextLine());
                                                 System.out.println("Jugador actualizado exitosamente");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                          default:
                                                 System.out.println("La opcion no es valida");
                                                 System.out.println("Oprima enter para continuar");
                                                 scanner.nextLine();
                                                 break;
                                   }
                                   break;
                            case 3:
                            System.out.println("----Menu de Busqueda -----");
                            System.out.println("Ingrese el codigo del jugador: ");
                            codigoJugador = scanner.nextLine();
                            if(!controlador.jugadores.containsKey(codigoJugador)){
                                   System.out.println("No se encontro el Jugador");
                                   System.out.println("Oprima enter para continuar");
                                   scanner.nextLine();
                                   break;
                            }
                            Player jugadoor = controlador.getJugadoresById(codigoJugador);
                            

                         default:
                             throw new AssertionError();
                     }

              }
       }
       

}
