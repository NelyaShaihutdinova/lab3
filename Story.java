
import abstracts.*;
import enums.*;
import sceneObjects.*;

public class Story {
    public static void main(String[] args) {
        Hero spruts = new Hero("Спрутс", new Pants("Штаны", Clear.CLEAR), ListOfDuties.COOKING, ListOfDuties.KNEADTHEDOUGH, ListOfDuties.KINDLEAFIRE);
        Hero julio = new Hero("Джулио", null, ListOfDuties.DELIVERYFOOD, ListOfDuties.COOKING, ListOfDuties.DIRECTTHEWORK);
        Room kitchen = new Kitchen("Кухня");
        spruts.changeRoom(kitchen);
        julio.changeRoom(kitchen);
        CanBroke chair1 = new Chair("Стул 1", kitchen, Brokenness.NOTBROKEN);
        CanBroke chair2 = new Chair("Стул 2", kitchen, Brokenness.NOTBROKEN);
        spruts.broke(chair1, chair2);
        CanBroke egg = new Egg("Яйцо");
        spruts.broke(egg);
        RowFood[] food = {new Egg("Яйцо"), new Egg("Яйцо"), new Egg("Яйцо") , new Egg("Яйцо"), new Egg("Яйцо"), new Egg("Яйцо")};
        spruts.takeRowFood(food);
        spruts.pourOut(spruts.getClothes(), (CanBePourOut) egg);
        julio.think(spruts);
        julio.takeAway(spruts);
        TableWare pan = new FryingPan("Сковорода", kitchen, Size.BIG);
        julio.chooseTableWare(pan);
        julio.cookScramble();
        Dish scramble = new Scramble("Яичница");
        Sittable chair3 = new Chair("Стул 3", kitchen, Brokenness.NOTBROKEN);
        Sittable chair4 = new Chair("Стул 4", kitchen, Brokenness.NOTBROKEN);
        spruts.sit(chair3);
        julio.sit(chair4);
        julio.eat(scramble);
        spruts.eat(scramble);
        spruts.thinkAboutLifeWithSbd(julio);
        spruts.suggest(Suggestions.LIVETOGETHER, julio);
        spruts.setLifeSatisfaction(LifeSatisfaction.SATISFACTION);
    }
}
