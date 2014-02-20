package br.edu.infnet.primeiro_exemplo_maven;

import java.util.List;

import br.edu.infnet.primeiro_exemplo_maven.dominio.Aluno;
import br.edu.infnet.primeiro_exemplo_maven.repository.AlunoRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AlunoRepository rep = new AlunoRepository();
        List<Aluno> alunos = rep.Selecionar();
        for(Aluno aluno : alunos)
        {
        	System.out.println(aluno.getNome());
        }
        Aluno aluno444 = rep.Selecionar("444");
        System.out.println(aluno444.getNome());
    }
}
