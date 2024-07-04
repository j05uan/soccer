package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;

public class ViewCoach {
    public static Controller controlador;

    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Menu coach ----");
            System.out.println(" 1. Crear Coach");
            System.out.println("2. Actualizar Coach");
            System.out.println("3. Buscar Coach");
            System.out.println("4. Eliminar Coach");
            System.out.println("5. Listar todos Coach");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Coach entrenador = new Coach();
                    String codigoEntrenador = null;
                    System.out.println(" Ingrese el codigo del Entrenador: ");
                    codigoEntrenador = scanner.nextLine();
                    entrenador.setId(codigoEntrenador);
                    System.out.println(" Ingrese el nombre del Jugador : ");
                    entrenador.setNombre(scanner.nextLine());
                    System.out.println(" Ingrese el apellido del entrenador: ");
                    entrenador.setApellido(scanner.nextLine());
                    System.out.println("Ingrese la edad del entrenador: ");
                    entrenador.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el id de Federacion del Entrenador: ");
                    entrenador.setIdFederacion(scanner.nextInt());
                    controlador.entrenadores.put(codigoEntrenador, entrenador);
                    
                    break;
                case 2: 
                    
                    System.out.println(" --- Menu de Actulizacion de Entrenador -----");
                    System.out.println("Ingrese el codigo del Entrenador: ");
                    codigoEntrenador = scanner.nextLine();
                    if (!controlador.entrenadores.containsKey(codigoEntrenador)) {
                        System.out.println("No se encontro el Entrenador");
                        System.out.println("Oprima cualquier tecla para continuar ");
                        scanner.nextLine();
                        break;
                    }
                    Coach entrenadorr = controlador.entrenadores.get(codigoEntrenador);
                    System.out.println("1. Actualizar el nombre");
                    System.out.println("2. Actualizar los Apellidos");
                    System.out.println("3. Actualizar la edad");
                    System.out.println("4. Actualizar Federacion");
                    System.out.println("5. Salir.");
                    int op = scanner.nextInt();
                    scanner.nextLine();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la actualizacion del nombre: ");
                            entrenadorr.setNombre(scanner.nextLine());
                            System.out.println("Entrenador actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        case 2:
                            System.out.println(" Ingrese la actualizacion del Apellido :");
                            entrenadorr.setApellido(scanner.nextLine());
                            System.out.println("Entrenador actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        case 3:
                            System.out.println("Ingrese la actualizacion de la edad: ");
                            entrenadorr.setEdad(scanner.nextInt());
                            System.out.println("Entrenador actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                        
                        case 4:
                            System.out.println("Ingrese la actualizacion de la Federacion: ");
                            entrenadorr.setIdFederacion(scanner.nextInt());
                            System.out.println("Entrenador actualizado exitosamente");
                            System.out.println("Oprima enter para continuar");
                            scanner.nextLine();
                            break;
                        case 5:
                            break;

                        default:
                            break;
                    }

                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.println("--- Menu de Busqueda ---");
                    System.out.println("Ingrese el codigo del Entrenador: ");
                    codigoEntrenador = scanner.nextLine();
                    if(!controlador.entrenadores.containsKey(codigoEntrenador)){
                        System.out.print("\033[H\033[2J");    
                        System.out.println("No se encontro el Entrenador");
                        System.out.println("Oprima enter para continuar");
                        scanner.nextLine();
                        break;   
                    }
                    Coach Entrenador = controlador.getEntrenadoresById(codigoEntrenador);
                    System.out.println("");                    
                    default:
                    break;
            }
            
        }
    }
}
