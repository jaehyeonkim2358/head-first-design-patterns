package beverages.coffee;

import beverages.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블랜드 커피";
    }

    @Override
    public int cost() {
        return 1600;
    }

}
