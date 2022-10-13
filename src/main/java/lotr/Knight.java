package lotr;

import static game.GameManager.rand;

public class Knight extends Character {
    public Knight() {
        super((2 + rand.nextInt(11)), (2 + rand.nextInt(11)));
    }

    public String toString(){
        return "Knight{hp=" + this.getHp() + ", power=" + this.getHp() + "}";
    }
}
