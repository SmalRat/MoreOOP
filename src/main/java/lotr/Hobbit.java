package lotr;

public class Hobbit extends Character {
    public Hobbit(){
        super(3,0);
    }

    public String toString(){
        return "Hobbit{hp=" + this.getHp() + ", power=" + this.getHp() + "}";
    }
}
