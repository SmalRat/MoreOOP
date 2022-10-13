package lotr;

import game.GameManager;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
        setKick_obj(GameManager.kicksConstructor.create_kick(this));
    }
    public String toString(){
        return "Elf{hp=" + this.getHp() + ", power=" + this.getHp() + "}";
    }
}
