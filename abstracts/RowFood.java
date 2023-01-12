package abstracts;

import enums.Brokenness;

public abstract class RowFood extends Food implements CanBroke {
    private Brokenness brokenness;
    @Override
    public void broke(Brokenness brokenness) {
        this.brokenness = brokenness;
    }
    public RowFood(String name) {
        super(name);
    }


}
