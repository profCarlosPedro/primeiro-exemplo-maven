package br.edu.infnet.primeiro_exemplo_maven.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import br.edu.infnet.primeiro_exemplo_maven.dominio.Aluno;

public class AlunoRepository {

	private Session sessao;
	
	private Session criarSession()
	{
		if (sessao == null)
		{
		Configuration configuracao = new Configuration().configure();
		
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuracao.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		SessionFactory sessionFactory = configuracao.buildSessionFactory(serviceRegistry);
		
		sessao = sessionFactory.openSession(); 
		
		}
		return sessao;
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> Selecionar()
	{
		Session session = criarSession();
		return (List<Aluno>)session.createCriteria(Aluno.class).list();
	}
	
	
	public Aluno Selecionar(String matricula)
	{
		
		Session session = criarSession();
		Aluno aluno = 
		(Aluno) session.createCriteria(Aluno.class).
				add(Restrictions.eq("matricula", matricula)).uniqueResult();
		
		return aluno;
	 
		
	}
	
}
