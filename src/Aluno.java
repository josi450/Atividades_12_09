
public class Aluno {
    String nome;
    String cpf;
    Data dataDeNascimento;
    
    
    public String getImprimir (){
        String aluno= this.nome + "\n"
                + this.cpf + "\n"
                +this.dataDeNascimento.getImprimir();
        return aluno;
    }
    
}
    

