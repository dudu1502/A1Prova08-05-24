import javax.swing.JOptionPane;

public class TesteMain {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        String avaliacoes = JOptionPane.showInputDialog("Digite o número de avaliações realizadas pelo aluno:");
        int numAvaliacoes = Integer.parseInt(avaliacoes);

        aluno.calcularNotaFinal(numAvaliacoes);
        
        JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " da turma " + aluno.getTurma() + " recebeu a nota: " + aluno.getNotaFinal());

}


}
