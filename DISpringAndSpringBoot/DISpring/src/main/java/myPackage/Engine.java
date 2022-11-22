package myPackage;

public class Engine {
    private Integer hp;

    Engine( Integer hp ){
        this.hp = hp;
    }

    public String sound(){
        return "Engine sound with " + hp.toString() + " horse power";
    }
}
