package PokeAPI;

import java.util.ArrayList;

public class Pokemon {
    private int id;
    private String name;
    private String image;
    private ArrayList<Abilities> abilities;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Abilities> getAbilities() {

        return abilities;
    }



    public ArrayList<String> getHabilidades() {
        ArrayList<String> habilidades = new ArrayList<>();
        for(Abilities ability: abilities) {
            habilidades.add(ability.getAbility().getName());
        }
        return habilidades;
    }


    public void setAbilities(ArrayList<Abilities> abilities) {
        this.abilities = abilities;
    }
}
