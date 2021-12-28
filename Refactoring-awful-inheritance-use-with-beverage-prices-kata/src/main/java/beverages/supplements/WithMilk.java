package beverages.supplements;

import beverages.Beverage;

public final class WithMilk implements Beverage {
    private final Beverage beverage;

    public WithMilk (final Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.10;
    }
}
