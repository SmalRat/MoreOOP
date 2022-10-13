package lotr;

import game.GameManager;
import kick.BasicKick;
import kick.KicksConstructor;

public abstract class Character {
  private int power;
  private int hp;
  private BasicKick kick_obj;

  public Character(int hp, int power){
    setPower(power);
    setHp(hp);
  }
  public void setKick_obj(BasicKick kick_obj){
    this.kick_obj = kick_obj;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = Math.max(hp, 0);
  }

  public void reduceHp(int damage){
    setHp(getHp() - damage);
  }

  public void reducePower(int powerDamage){
    setPower(getPower() - powerDamage);
  }

  public void kick(Character other){
    this.kick_obj.hit(other);
  }

  public boolean isAlive(){
    return getHp() > 0;
  }
}