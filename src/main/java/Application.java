import PokeAPI.PokeAPIService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import PokeAPI.PokeAPIService;

public class Application {

    private void obtenerPokemon() {
        PokeAPIService service = new PokeAPIService();

    }

    private void obtenerHabilidades() {
        PokeAPIService service = new PokeAPIService();
    }

    public static void main(String[] args) throws Exception {
        PokeAPIService pokeAPIService = new PokeAPIService();
        Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
         int select = -1;


        while(select != 0) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Bienvenido al Sistema PokeDex UTN:");
                System.out.println("Elige una opción:\n" +
                    "1.- Buscar por nombre de pokemon \n" +
                    "2. Buscar por nombre de habilidad\n" +
                    "0.- Salir");

                select = Integer.parseInt(scanner.nextLine());

                switch (select) {
                    case 1:
                        System.out.println("Ingrese el nombre del pokemon: ");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                        String s = bufferedReader.readLine();


                        pokeAPIService.obtenerPokemon(s);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre de la habilidad: ");
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));

                        String a = bufferedReader2.readLine();

                        pokeAPIService.pokemonCon(a);
                        break;
                    case 0:
                        System.out.println("Recuerda cuidar bien a tus pokemon!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Error!");
            }

        }
        


    }


}
