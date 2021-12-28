package beverages.supplements;

import beverages.Beverage;

public final class WithCream implements Beverage {

    private final Beverage beverage;

    public WithCream (final Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.15;
    }
}
