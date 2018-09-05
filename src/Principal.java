
import java.util.Stack;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Stack<No> pilha = new Stack<>();

        //Menu para controle da lista
        int opcao = -1;
        while (opcao != 9) {
            //Monta o menu de opcoes
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Pilha com Collection ###\n"
                    + "1 - Empilhar\n"
                    + "2 - Desempilhar\n"
                    + "3 - Consultar\n"
                    + "4 - Mostrar Topo\n"
                    + "5 - Contar\n"
                    + "6 - Listar\n"
                    + "9 - Sair\n"));
            switch (opcao) {
                case 1: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o dado"));
                    No novo = new No(dado);
                    pilha.push(novo);
                    break;
                }
                case 2: {
                    pilha.pop();
                    break;
                }
                case 3: {
                    int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser consultado"));
                    No procurar = null;
                    for (No c : pilha) {
                        if (c.getDado() == chave) {
                            procurar = c;
                        }
                    }
                    if (pilha.search(procurar) != -1) {
                        JOptionPane.showMessageDialog(null, "Achei o nó");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não Achei o nó");
                    }
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Topo: " + pilha.peek().getDado());
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Qtde de nó9s" + pilha.size());
                    break;
                }
                case 6: {
                    String saida = "Dados da Pilha:\n";
                    for (No c : pilha) {
                        saida = saida + c.getDado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, saida);
                    break;
                }
                default:
                    break;
            }
        }//Fim While
    }
}
