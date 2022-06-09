package PokeAPI;

import java.util.ArrayList;

public class HabilidadesPokemon {

    String name;
    ArrayList<Pokemones> pokemones;

    public ArrayList<Pokemones> getPokemones() {
        return pokemones;
    }

    public ArrayList<String> getPokemon() {
        ArrayList<String> pokemons = new ArrayList<>();

        for(Pokemones pokemon: pokemones) {
            pokemons.add(pokemon.getPokemonHabilidad().getName());
        }
        return pokemons;
    }

    public String getName() {
        return name;
    }




}
