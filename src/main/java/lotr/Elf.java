package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }
    public String toString(){
        return "Elf{hp=" + this.getHp() + ", power=" + this.getHp() + "}";
    }
}
