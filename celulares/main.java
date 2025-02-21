public class main{
    
    public static void main (String ...args){
        ConstrutorFabricante constroi = new ConstrutorFabricante();
        FabricanteCelular apple = constroi.getInstance(fabrica: "Apple");
        
        apple.constroiCelular(modelo: "iphoneX");
    }
}
    
