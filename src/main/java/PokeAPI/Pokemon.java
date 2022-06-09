package PokeAPI;

import java.util.ArrayList;

public class Pokemon {
    private int id;
    private String name;
    private String image;
    private ArrayList<Ability> abilities;



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

    public ArrayList<Ability> getAbilities() {

        return abilities;
    }



    public String getHabilidad() {
        return abilities.get(1).getName();
    }



    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }
}
