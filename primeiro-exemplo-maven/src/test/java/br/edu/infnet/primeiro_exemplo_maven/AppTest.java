package br.edu.infnet.primeiro_exemplo_maven;

import br.edu.infnet.primeiro_exemplo_maven.dominio.Aluno;
import br.edu.infnet.primeiro_exemplo_maven.repository.AlunoRepository;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        
    	AlunoRepository rep = new AlunoRepository();
    	Aluno aluno = rep.Selecionar("444");
    	assertTrue(aluno != null);
    	
    	
    }
}
