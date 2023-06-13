package es.pokemon.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.pokemon.pokedex.entity.Pokemon;
import es.pokemon.pokedex.service.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PomemonController {
  @Autowired
  PokemonService pokemonService;

  @GetMapping
  Page<Pokemon> findAll(@SortDefault(sort = "id", direction = Sort.Direction.ASC) final Pageable pageable){
    return pokemonService.findAll(pageable);
  }
}
