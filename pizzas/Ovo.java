public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Ovo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 4.0; 
    }
}