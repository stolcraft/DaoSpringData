package eu.ensup.demospdtjpa.test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospdtjpa.dao.IEleveDao;
import eu.ensup.demospdtjpa.domaine.Eleve;
import eu.ensup.demospdtjpa.service.EleveService;



public class TestSpringDao {
	
//	private Eleve emp;
//	private IEleveDao springDao;
//	private ClassPathXmlApplicationContext appContext;	
	
	private Eleve emp;
	private EleveService eleveService;
	private ClassPathXmlApplicationContext appContext;	
	
	@Before
	public void initialiation() {
//		emp = new Eleve("douglas","MBIANDOU");
//		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
//		springDao = (IEleveDao) appContext.getBean("IEleveDao");
		emp = new Eleve("kevin","guil");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		eleveService = (EleveService) appContext.getBean("EleveService");
	}
	
	@After
	public void destruction() {
		emp = null;
		appContext = null;
		eleveService = null;
	}
	
	@Test
	public void sauvegarderEleve() {
		eleveService.enregistrerEleve(emp);
	}

}
