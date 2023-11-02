package beverages.condiments;

import beverages.Beverage;

public abstract class ComdimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
