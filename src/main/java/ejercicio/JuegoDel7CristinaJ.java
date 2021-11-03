/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class JuegoDel7CristinaJ {

    public static void main(String[] args) {
        /*El juego consiste en 5 rondas donde los usuarios general números aleatorios
        entre 1 y 5, se suma ambos resultados, si el resultado es <7 gana jugador 1,
        si es >7 gana j2, si es 7 no cuenta esa ronda.
        Gana el que más victorias lleve en las 5 rondas.*/

        //Random para sacar números random
        Random numeroRandom = new Random();
        //Contador de rondas para que se repita el código 5 veces.
        int rondas = 0;

        //Contadores de victorias de los jugadores.
        int contadorJugador1 = 0, contadorJugador2 = 0;

        do {
            System.out.println("Bienvenido al juego del 7"
                    + "\nEsta es la ronda " + rondas);
            //Para generar el número random del jugador 1
            int numeroRandomJugador1 = numeroRandom.nextInt(5) + 1;
            System.out.println("El jugador 1 ha sacado " + numeroRandomJugador1);

            //Para generar el número random del jugador 2
            System.out.println("------------------------------------");
            int numeroRandomJugador2 = numeroRandom.nextInt(5) + 1;
            System.out.println("El jugador 2 ha sacado " + numeroRandomJugador2);

            //Se hace la suma para ver el ganador
            int suma = numeroRandomJugador1 + numeroRandomJugador2;
            System.out.println("\nEl resultado de la suma es " + suma);

            //Para ver decidir el ganador
            //Mayor de 7
            if (suma < 7) {
                System.out.println("Gana jugador 1");
                //El contador del jugador 1 suma 1
                contadorJugador1++;
                
                //Si hay empate
            } else if (suma == 7) {
                System.out.println("No hay ningún ganador");
                //No cuenta la ronda, por eso se resta 1
                rondas--;
                
                //Si es mayor de 7
            } else {
                //gana el jugador 2
                System.out.println("Gana el jugador 2");
                //Se suma 1 al contador del jugador 2
                contadorJugador2++;
            }

            System.out.println("---------FIN DE PARTIDA-----------\n\n");
            rondas++;
        } while (rondas < 5);

        //Para decir quien es el ganador de las 5 rondas
        if (contadorJugador1 > contadorJugador2) {
            System.out.println("Ha ganado en total el jugador 1"
                    + "\nCon una cantidad de: " + contadorJugador1 + " puntos");
        } else {
            System.out.println("Ha ganado en total el jugador 2"
                    + "\nCon una cantidad de: " + contadorJugador2 + " puntos");
        }
    }

}
