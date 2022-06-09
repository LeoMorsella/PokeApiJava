package PokeAPI;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;


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
               System.out.println("response = " + responseBody);
               PokemonResponse newPokemon = objectMapper.readValue(responseBody, PokemonResponse.class);


                    System.out.println("Nombre: " + newPokemon.getResultado().getName());


          } else {
               System.out.println("Error response = " + responseBody);
               throw new Exception("Error en la llamada a /api/user");
          }
     }
     }

