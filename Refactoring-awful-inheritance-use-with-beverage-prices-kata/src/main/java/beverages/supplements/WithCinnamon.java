package beverages.supplements;

import beverages.Beverage;

public final class WithCinnamon implements Beverage {
    private final Beverage beverage;

    public WithCinnamon(final Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double price() {
        return beverage.price() + 0.05;
    }
}
