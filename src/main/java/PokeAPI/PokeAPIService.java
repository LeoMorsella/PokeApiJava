package PokeAPI;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import java.util.ArrayList;


public class PokeAPIService {

     public void obtenerPokemon(String pokemon) throws Exception {

          WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/pokemon/"+pokemon);

          ObjectMapper objectMapper = new ObjectMapper();
          objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

          Response response = clientUsers
                  .header("Content-Type", "application/json")
                  .get();

          int status = response.getStatus();
          System.out.println("Status: " + status);
          String responseBody = response.readEntity(String.class);
          if (status == 200) {
               //System.out.println("response = " + responseBody);
               Pokemon newPokemon = objectMapper.readValue(responseBody, Pokemon.class);
                    System.out.println("Nombre: " + newPokemon.getName());
                    System.out.println("Imagen: "+ "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+newPokemon.getId()+".png");




               System.out.println("Habilidad: " + newPokemon.getAbilities());

          } else {
               System.out.println("Error response = " + responseBody);
               throw new Exception("Error en la llamada a /api/user");
          }
     }

     public void pokemonCon(String habilidad) throws Exception {

          WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/ability/"+habilidad);

          ObjectMapper objectMapper = new ObjectMapper();
          objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

          Response response = clientUsers
                  .header("Content-Type", "application/json")
                  .get();

          int status = response.getStatus();
          System.out.println("Status: " + status);
          String responseBody = response.readEntity(String.class);
          if (status == 200) {
                //System.out.println("response = " + responseBody);
               Ability newAbility = objectMapper.readValue(responseBody, Ability.class);


               System.out.println("Nombre: " + newAbility.getName());
               System.out.println("Pokemons " + newAbility.getPokemon());





          } else {
               System.out.println("Error response = " + responseBody);
               throw new Exception("Error en la llamada a /api/user");
          }
     }
     }

