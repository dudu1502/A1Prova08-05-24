import javax.swing.JOptionPane;

public class Aluno {

    private String nome;
    private String turma;
    private double notaFinal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public Aluno() {

        nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        setNome(nome);

        turma = JOptionPane.showInputDialog("Digite sua turma: ");
        setTurma(turma);

    }

    public void calcularNotaFinal(int numAvaliacoes) {

        double soma = 0;

        for (int i = 1; i <= numAvaliacoes; i++) {

            String notaAvaliacao = JOptionPane.showInputDialog("Digite a nota da avaliação " + i + ": ");
            double nota = Double.parseDouble(notaAvaliacao);
            soma += nota;

        }

        notaFinal = soma / numAvaliacoes;

        JOptionPane.showMessageDialog(null, "A nota final do aluno é: " + notaFinal);

    }
    

}