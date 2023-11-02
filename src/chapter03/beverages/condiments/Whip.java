package beverages.condiments;

import beverages.Beverage;

public class Whip extends ComdimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public int cost() {
        return beverage.cost() + 100;
    }
}
