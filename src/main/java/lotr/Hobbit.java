package lotr;

import game.GameManager;

public class Hobbit extends Character {
    public Hobbit(){
        super(3,0);
        setKick_obj(GameManager.kicksConstructor.create_kick(this));
    }

    public String toString(){
        return "Hobbit{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
