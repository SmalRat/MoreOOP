package kick;

import lotr.Character;

public class BasicKick {
    Character owner = null;
    BasicKick(Character owner){
        setOwner(owner);
    }

    public void hit(Character c) {
    }

    void setOwner(Character owner){
        this.owner = owner;
    }
    Character printOwner(){
        return this.owner;
    }
}
