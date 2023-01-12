package abstracts;

import enums.Clear;

public abstract class Clothes implements WherePourOut {
    private String name;
    private Clear clear;
    public Clothes(String name, Clear clear) {
        this.name = name;
        this.clear = clear;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setClear(Clear clear) {
        this.clear = clear;
    }
    public Clear getClear() {
        return clear;
    }

}
