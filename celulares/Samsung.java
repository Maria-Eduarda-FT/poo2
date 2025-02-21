public class Samsung implements FabricanteCelular{
    @Override public Celular constroiCelular (String modelo){
        if (modelo == "Galaxy8"){
            return new Galaxy8();
        } 
        return null;
    }
}