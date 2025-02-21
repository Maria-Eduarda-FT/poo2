public class Apple implements FabricanteCelular{
    
    @Override public Celular constroiCelular (String modelo){
        if (modelo == "iphoneX"){
            return new iphoneX();
        } 
        returnnull;
    }
}