public class Main {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego");

        //Voy a crear todas las variables del juego
        Pokemon chikorita = new Pokemon(
            "Chikorita",
            120, 
            20, 
            20, 
            25, 
            Tipo.PLANTA, 
            new Movimiento[] {
                Movimiento.LATIGO_CEPA,
                Movimiento.DRENADORAS
            }
        );
        Pokemon vaporeon = new Pokemon(
            "Vaporeon",
            300, 
            40, 
            50, 
            35, 
            Tipo.AGUA, 
            new Movimiento[] {
                Movimiento.CASCADA,
                Movimiento.HIDRO_CANON
            }
        );
        Pokemon fenekin = new Pokemon(
            "Fenekin",
            120, 
            25, 
            15, 
            28, 
            Tipo.FUEGO, 
            new Movimiento[] {
                Movimiento.ASCUAS,
                Movimiento.GIRO_FUEGO
            }
        );
        Pokemon greninja = new Pokemon(
            "Greninja",
            350, 
            50, 
            35, 
            60, 
            Tipo.AGUA, 
            new Movimiento[] {
                Movimiento.SURF,
                Movimiento.HIDRO_CANON
            }
        );
        Pokemon arcanine = new Pokemon(
            "Arcanine",
            250, 
            45, 
            35, 
            40, 
            Tipo.FUEGO, 
            new Movimiento[] {
                Movimiento.LANZA_LLAMAS,
                Movimiento.ONDA_IGNEA
            }
        );
        Pokemon sprigatito = new Pokemon(
            "Sprigatito",
            120, 
            27, 
            20, 
            30, 
            Tipo.PLANTA, 
            new Movimiento[] {
                Movimiento.RAYO_SOLAR,
                Movimiento.HOJAS_NAVAJA
            }
        );

        Jugador ximena = new Jugador(
            "Ximena",
            new Pokemon[] {vaporeon, sprigatito, arcanine}
        );

        Jugador erick = new Jugador(
            "erick",
            new Pokemon[] {greninja, fenekin, chikorita}
        );

        //Batalla tambien es una clase
        Batalla pelea = new Batalla(
            ximena,
            erick
        );

        //Hacer toda la logica de obtener los turnos
        //por velocidad de los pokemon y dar
        //un menu al usuario para poder decidir el ataque
        //finalmente cuando todo el equipo tenga vida <=0
        // gana el jugador contrario
        pelea.inciar();


    }


}
