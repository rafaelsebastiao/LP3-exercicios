package desafio_rapido;

public class Aluno {
    private String nome;
    private String cpf;
    private String ra;

    private int atividRealizadas;
    private boolean matriculaAtiva;


    public Aluno(String nome, String cpf, String ra){
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;

        this.atividRealizadas = 0;
        this.matriculaAtiva = true;

    }

    public void realizarAtividade(){
        this.atividRealizadas += 1;
    }

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public int getAtividRealizadas() {
        return atividRealizadas;
    }

    public void trancarMatricula(){
        this.matriculaAtiva = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", ra='" + ra + '\'' +
                ", atividRealizadas=" + atividRealizadas +
                ", matriculaAtiva=" + matriculaAtiva +
                '}';
    }
}
