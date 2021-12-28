package unit_tests;

import beverages.*;
import beverages.supplements.WithCinnamon;
import beverages.supplements.WithCream;
import beverages.supplements.WithMilk;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage teaWithMilk = new WithMilk(new Tea());
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_tea_with_cinnamon_price() {
        Beverage teaWithCinnamon = new WithCinnamon(new Tea());
        assertThat(teaWithCinnamon.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_and_cinnamon_price() {
        Beverage teaWithMilkAndCinnamon = new WithCinnamon(new WithMilk(new Tea()));
        assertThat(teaWithMilkAndCinnamon.price(), is(closeTo(1.65, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = new WithMilk(new Coffee());
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price(){
        Beverage coffeeWithCinnamon = new WithCinnamon(new Coffee());
        assertThat(coffeeWithCinnamon.price(), is(closeTo(1.25, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = new WithCream(new WithMilk(new Coffee()));
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        Beverage coffeeWithMilkAndCinnamon = new WithCinnamon(new WithMilk(new Coffee()));
        assertThat(coffeeWithMilkAndCinnamon.price(), is(closeTo(1.35, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_and_cinnamon_price() {
        Beverage coffeeWithMilkAndCreamAndCinnamon = new WithCinnamon(new WithCream(new WithMilk(new Coffee())));
        assertThat(coffeeWithMilkAndCreamAndCinnamon.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new WithCream(new HotChocolate());
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cinnamon_price() {
        Beverage hotChocolateWithCinnamon = new WithCinnamon(new HotChocolate());
        assertThat(hotChocolateWithCinnamon.price(),  is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price(){
        Beverage hotChocolateWithCreamAndCinnamon = new WithCinnamon(new WithCream(new HotChocolate()));
        assertThat(hotChocolateWithCreamAndCinnamon.price(), is(closeTo(1.65, 0.001)));
    }
}
