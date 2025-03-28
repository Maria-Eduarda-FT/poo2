public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", Queijo";
    }

    @Override
    public double getCusto() {
        return pizza.getCusto() + 5.0; 
    }
}