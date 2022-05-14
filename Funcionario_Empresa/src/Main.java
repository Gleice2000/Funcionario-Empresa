public class Main {

public static void main(String[] args) {
        
   
    Empresa Pub = new Empresa("Publicidade", null);
    
    Funcionario pedro = new Funcionario("Pedro Pereira", null, 1.600, Pub);
    
    Funcionario leandro = new Funcionario("Leandro Silva", null,  1.900, Pub);
    
    System.out.println(pedro.getNome());
    System.out.println(pedro.getSalario());
    System.out.println(pedro.getEmpresa().getNome() + "\n");
    
    System.out.println("------------- \n");
     
    System.out.println(leandro.getNome());
    System.out.println(leandro.getSalario());
    System.out.println(leandro.getEmpresa().getNome() + "\n");
    
    Pub.adicionafuncionario(pedro);
    Pub.adicionafuncionario(leandro);
    
    for(Funcionario f: Pub.getFuncionarios()){
        System.out.println(f.getNome());
    }
}
    
}
