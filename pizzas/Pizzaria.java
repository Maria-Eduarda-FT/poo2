 public class Pizzaria {
    public static void main(String[] args) {
         
        Pizza pizzaMarguerita = new MassaFinaPizza();
        pizzaMarguerita = new Queijo(pizzaMarguerita);
        pizzaMarguerita = new Tomate(pizzaMarguerita);

        System.out.println("Pizza Marguerita:");
        System.out.println(pizzaMarguerita.getDescricao());
        System.out.println("Custo: R$ " + pizzaMarguerita.getCusto());

         
        Pizza pizzaPortuguesa = new MassaEspessaPizza();
        pizzaPortuguesa = new Queijo(pizzaPortuguesa);
        pizzaPortuguesa = new Ovo(pizzaPortuguesa);
        pizzaPortuguesa = new Tomate(pizzaPortuguesa);

        System.out.println("\nPizza Portuguesa:");
        System.out.println(pizzaPortuguesa.getDescricao());
        System.out.println("Custo: R$ " + pizzaPortuguesa.getCusto());
    }
}





