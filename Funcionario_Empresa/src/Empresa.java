import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nome;
    private String cnpj;
    private List<Funcionario>funcionarios; 
    private Funcionario pFuncionario;
    
    public Empresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios=new ArrayList<Funcionario>();
    }
    
    public void adicionafuncionario(Funcionario funcionario){
        if(this.funcionarios.size()<3){
            this.funcionarios.add(pFuncionario);
        }
    } 
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getcnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public List<Funcionario>getFuncionarios(){
        return this.funcionarios;
    }
    public void setFuncionario(Funcionario funcionario){
        this.funcionarios = funcionarios;
    }
}
