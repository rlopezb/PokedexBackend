package es.pokemon.pokedex.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Base {
  @Field("HP")
  private Short hp;
  @Field("Attack")
  private Short attack;
  @Field("Defense")
  private Short defense;
  @Field("Sp. Attack")
  private Short spAttack;
  @Field("Sp. Defense")
  private Short spDefense;
  @Field("Speed")
  private Short speed;
  public Base() {
  }
  public Short getHp() {
    return hp;
  }
  public void setHp(Short hp) {
    this.hp = hp;
  }
  public Short getAttack() {
    return attack;
  }
  public void setAttack(Short attack) {
    this.attack = attack;
  }
  public Short getDefense() {
    return defense;
  }
  public void setDefense(Short defense) {
    this.defense = defense;
  }
  public Short getSpAttack() {
    return spAttack;
  }
  public void setSpAttack(Short spAttack) {
    this.spAttack = spAttack;
  }
  public Short getSpDefense() {
    return spDefense;
  }
  public void setSpDefense(Short spDefense) {
    this.spDefense = spDefense;
  }
  public Short getSpeed() {
    return speed;
  }
  public void setSpeed(Short speed) {
    this.speed = speed;
  }
  
}
