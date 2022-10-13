package lotr;

import static game.GameManager.rand;

public class King extends Character {
    public King() {
        super((5 + rand.nextInt(11)), (5 + rand.nextInt(11)));
    }

    public String toString(){
        return "King{hp=" + this.getHp() + ", power=" + this.getHp() + "}";
    }
}
