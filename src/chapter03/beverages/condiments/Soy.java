package beverages.condiments;

import beverages.Beverage;

public class Soy extends ComdimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public int cost() {
        return beverage.cost() + 150;
    }

}
