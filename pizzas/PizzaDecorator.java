public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return pizza.getCusto();
    }
}