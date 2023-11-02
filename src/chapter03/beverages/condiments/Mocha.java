package beverages.condiments;

import beverages.Beverage;

public class Mocha extends ComdimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public int cost() {
        return beverage.cost() + 300;
    }

}
