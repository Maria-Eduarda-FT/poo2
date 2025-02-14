public class SingleResponsibility {
    
    public SingleResponsibility() {
        doIncorrectImplementation();
        doCorrectImplementation();
    }
   
    public void doIncorrectImplementation() {
        /*Ter um método que imprime o nome do autor nessa classe viola o Princípio da Responsabilidade Única*/
        //book.printAuthorName();
    }
    
    public void doCorrectImplementation() {
        /**Adicione aqui seu código com referências a métodos e classes contidas no pacote singleresponsibility.correct*/
          Book book = new Book("Clean Architecture", "Robert Martin", "Science");
          System.out.println("Nome do autor -> "+ book.getAuthor());
    }
    
    public static void main(String [] args ) {
        SingleResponsibility sr = new SingleResponsibility();
      
    }
}