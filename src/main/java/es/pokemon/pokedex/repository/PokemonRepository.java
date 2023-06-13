package es.pokemon.pokedex.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import es.pokemon.pokedex.entity.Pokemon;

public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, String> {
  
}
