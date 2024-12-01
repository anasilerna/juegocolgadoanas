package juegocolgadoanas;
import java.util.Scanner;
public class juegocolgadoanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 // Iniciar el juego
	        System.out.println("Bienvenidos al Juego del Colgado");
	        
	        // Preguntar cuántas rondas jugarán
	        System.out.print("¿Cuántas rondas quieren jugar?: ");
	        int numRondas = scanner.nextInt();
	        scanner.nextLine(); 
	        
	        // Puntajes iniciales
	        int puntosJugador1 = 0;
	        int puntosJugador2 = 0;

	        // Inicio de Rondas
	        for (int ronda = 1; ronda <= numRondas; ronda++) {
	            System.out.println(" Ronda " + ronda + " ---");
	            
	            
	            // Administrador elige la palabra secreta
	            System.out.print("Administrador, ingresa la palabra secreta (sin espacios): ");
	            String palabraSecreta = scanner.nextLine().toLowerCase();
	            
	         // Pasa la palabra adivinada como un array de '_'
	            char[] palabraAdivinada = new char[palabraSecreta.length()];
	            for (int i = 0; i < palabraSecreta.length(); i++) {
	                palabraAdivinada[i] = '_';
	            }
	        // Inicializar intentos
	            int intentosJugador1 = 6;
	            int intentosJugador2 = 6;
	            boolean palabraAdivinadaEntera = false;
	            
	         // Rondas de jugadores
	            while (intentosJugador1 > 0 && intentosJugador2 > 0 && !palabraAdivinadaEntera) {
	                // Jugador 1 intenta adivinar
	                if (intentosJugador1 > 0 && !palabraAdivinadaEntera) {
	                    System.out.println("Palabra actual: " + String.valueOf(palabraAdivinada));
	                    System.out.println("Intentos restantes del Jugador 1: " + intentosJugador1);
	                    System.out.print("Jugador 1, adivina una letra: ");
	                    char letra = scanner.nextLine().toLowerCase().charAt(0);

	                    // Comprobar si la letra está en la palabra
	                    boolean acierto = false;
	                    for (int i = 0; i < palabraSecreta.length(); i++) {
	                        if (palabraSecreta.charAt(i) == letra) {
	                            palabraAdivinada[i] = letra;
	                            acierto = true;
	                            
	                        }
	                    }
	                    // Actualizar estado del juego
	                    if (acierto) {
	                        System.out.println("¡Correcto!");
	                        if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
	                            System.out.println("\n¡" + "Jugador1" + " ha adivinado la palabra: " + palabraSecreta + "!");
	                            puntosJugador1++;
	                            palabraAdivinadaEntera = true;
	                        }
	                    } else {
	                        System.out.println("Fallaste.");
	                        intentosJugador1--;
	                    }
	                }
	                // Jugador 2 intenta adivinar
	                if (intentosJugador2 > 0 && !palabraAdivinadaEntera) {
	                    System.out.println("\nPalabra actual: " + String.valueOf(palabraAdivinada));
	                    System.out.println("Intentos restantes del Jugador 2: " + intentosJugador2);
	                    System.out.print("Jugador2" + ", adivina una letra: ");
	                    char letra = scanner.nextLine().toLowerCase().charAt(0);

	                    // Comprobar si la letra está en la palabra
	                    boolean acierto = false;
	                    for (int i = 0; i < palabraSecreta.length(); i++) {
	                        if (palabraSecreta.charAt(i) == letra) {
	                            palabraAdivinada[i] = letra;
	                            acierto = true;
	                        }
	                    }

	                    // Actualizar estado del juego
	                    if (acierto) {
	                        System.out.println("¡Correcto!");
	                        if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
	                            System.out.println("\n¡" + "Jugador2" + " ha adivinado la palabra: " + palabraSecreta + "!");
	                            puntosJugador2++;
	                            palabraAdivinadaEntera = true;
	                        }
	                    } else {
	                        System.out.println("Fallaste.");
	                        intentosJugador2--;
	                    }
	                }
	            }

	            // Si nadie adivinó la palabra
	            if (!palabraAdivinadaEntera) {
	                System.out.println("\nNadie adivinó la palabra. Era: " + palabraSecreta);
	            }
	        }

	   }
	}
	        }

