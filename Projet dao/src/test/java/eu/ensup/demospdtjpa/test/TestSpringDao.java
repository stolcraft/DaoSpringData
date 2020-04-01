package eu.ensup.demospdtjpa.test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospdtjpa.dao.IEleveDao;
import eu.ensup.demospdtjpa.domaine.Eleve;



public class TestSpringDao {
	
	private Eleve emp;
	private IEleveDao springDao;
	private ClassPathXmlApplicationContext appContext;	
	
	@Before
	public void initialiation() {
		emp = new Eleve("douglas","MBIANDOU");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDao = (IEleveDao) appContext.getBean("IEleveDao");
	}
	
	@After
	public void destruction() {
		emp = null;
		appContext = null;
		springDao = null;
	}
	
	@Test
	public void saveEleve() {	
		springDao.save(emp);
	}
	
	@Test
	public void FindById() {
		Eleve student = springDao.findOne(4);
		System.out.println(student);
		assertNotNull(student);
	
		
	}
	

}
