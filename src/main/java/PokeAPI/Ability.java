package PokeAPI;

import java.util.ArrayList;

public class Ability {
    String name;
    ArrayList<Pokemon> pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
