package abstracts;

import enums.Brokenness;

public interface CanBroke {
    void broke(Brokenness brokenness);
    String getName();
}
