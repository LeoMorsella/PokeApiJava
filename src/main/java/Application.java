import PokeAPI.PokeAPIService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import PokeAPI.PokeAPIService;

public class Application {

    private void obtenerPokemon() {
        PokeAPIService service = new PokeAPIService();

    }

    private void obtenerHabilidades() {
        PokeAPIService service = new PokeAPIService();
    }

    public static void main(String[] args) throws Exception {
        //String path = "https://pokeapi.co/api/v2/";

        System.out.println("Ingrese el nombre del pokemon: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        PokeAPIService pokeAPIService = new PokeAPIService();

        pokeAPIService.obtenerPokemon(s);





    }


}
