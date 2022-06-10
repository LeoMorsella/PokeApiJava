package PokeAPI.AbilitiesService;

import java.util.ArrayList;

public class Ability {
  String name;
  ArrayList<Pokemons> pokemon;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

 /* public ArrayList<Pokemons> getPokemon() {
    return pokemon;
  }*/

  public ArrayList<String> getPokemon() {
    ArrayList<String> pokemons = new ArrayList<>();

    for(Pokemons pokemon: pokemon) {
      pokemons.add(pokemon.getPokemon().getName());
    }
    return pokemons;
  }

  public void setPokemon(ArrayList<Pokemons> pokemon) {
    this.pokemon = pokemon;
  }
}
