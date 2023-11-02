import beverages.Beverage;
import beverages.coffee.Espresso;
import beverages.coffee.HouseBlend;
import beverages.condiments.Mocha;
import beverages.condiments.Soy;
import beverages.condiments.Whip;

public class Main {
    public static void main(String[] args){
        // 에스프레소
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() +": "+ beverage1.cost() + "원");

        // 에스프레소 + 모카 + 휘핑크림 + 모카
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() +": "+ beverage2.cost() + "원");

        // 하우스 블랜드 커피 + 두유 + 모카 + 휘핑크림
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +": "+ beverage3.cost() + "원");
    }
}
