import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela{

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();

        System.out.println("A tela tem resolucao " + largura + "x" + altura);
    }
}