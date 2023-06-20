package es.pokemon.pokedex.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import es.pokemon.pokedex.entity.Pokemon;

public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, String> {
  Page<Pokemon> findByNameContainingIgnoreCase(String name, org.springframework.data.domain.Pageable pageable);
}
