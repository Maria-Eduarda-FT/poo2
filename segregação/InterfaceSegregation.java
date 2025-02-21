public class InterfaceSegregation {
    
    public InterfaceSegregation() {
        doIncorrectImplementation();
        doCorrectImplementation();
    }
    
    public void doIncorrectImplementation() {
        birdFly.corvo c = new birdFly.corvo();
        bird. penguin = new interfacesegregation.incorrect.Penguin();
        /*Os metodos funcionam bem para um passaro que pode comer, dormir e voar*/
        crow.eat();
        crow.sleep();
        crow.fly();
        /* Os metodos nao funcionam bem para o Penguin que pode comer e dormir, mas nao pode voar*/
        penguin.eat();
        penguin.sleep();
        penguin.fly();
    }
    
    public static void main(String [] args) {
        InterfaceSegregation is = new InterfaceSegregation();
    }
    
}