/******************************************************************************
Vou representar um aplicativo que mostra uma galeria de imagens. 
Para melhorar o desempenho, vai ser adiado o carregamento real das 
imagens até que o usuário clique para visualizar uma.
*******************************************************************************/
interface Imagem {
    void exibir();
}

class ImagemReal implements Imagem {
    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando imagem: " + nomeArquivo + " do disco...");
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem: " + nomeArquivo);
    }
}

// proxy que adia o carregamento da imagem
class ImagemProxy implements Imagem {
    private String nomeArquivo;
    private ImagemReal imagemReal;

    public ImagemProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nomeArquivo);
            // só carrega quando necessário
        }
        imagemReal.exibir();
    }
}

// Galeria 
public class Main {
    public static void main(String[] args) {
        Imagem img1 = new ImagemProxy("praia.jpg");
        Imagem img2 = new ImagemProxy("montanha.jpg");

        System.out.println("Galeria carregada!");
        System.out.println("Usuário clica na primeira imagem:");
        img1.exibir(); // carrega e exibe

        System.out.println("\nUsuário clica na segunda imagem:");
        img2.exibir(); // carrega e exibe

        System.out.println("\nUsuário clica novamente na primeira:");
        img1.exibir(); // já está carregada, só exibe
    }
}
