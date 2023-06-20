package es.pokemon.pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import es.pokemon.pokedex.entity.Pokemon;
import es.pokemon.pokedex.repository.PokemonRepository;

@Service
public class PokemonService {
  @Autowired
  PokemonRepository pokemonRepository;

  public Page<Pokemon> findAll(Pageable pageable){
    return pokemonRepository.findAll(pageable);
  }

  public Page<Pokemon> findByNameContainingIgnoreCase(String name, Pageable pageable){
    return pokemonRepository.findByNameContainingIgnoreCase(name, pageable);
  }

}
