package pratica3;
import javax.swing.JOptionPane;
public class pratica3a {

	public static void main(String[] args) {
	
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
		
		JOptionPane.showMessageDialog(null, "Nome:
				"+nome,"Informa��o",JOptionPane.INFORMATION_MESSAGE);
	}

}
