package es.pokemon.pokedex.entity;

import org.springframework.data.annotation.Id;

public class Pokemon {
  @Id
  private String _id;
  private Long id;
  private String name;
  private String[] type;
  private Base base;

  public Pokemon() {
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String[] getType() {
    return type;
  }

  public void setType(String[] type) {
    this.type = type;
  }

  public Base getBase() {
    return base;
  }

  public void setBase(Base base) {
    this.base = base;
  }
  
}
