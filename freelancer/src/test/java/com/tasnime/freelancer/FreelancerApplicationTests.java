package com.tasnime.freelancer;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.tasnime.freelancer.entities.Freelancer;

import com.tasnime.freelancer.repos.FreelancerRepository;
import com.tasnime.freelancer.service.FreelancerService;

@SpringBootTest
class FreelancerApplicationTests {

	@Autowired
	private FreelancerRepository freelancerRepository;
	@Autowired
	private FreelancerService  freelancerService ;
	@Test
	public void testCreateFreelancer() {
		Freelancer freel = new Freelancer("mayssa elgarsi",3000.500,new Date());
		freelancerRepository.save(freel);
	}
	@Test
	public void testFindFreelancer()
	{
		Freelancer f = freelancerRepository.findById(1L).get(); 
	System.out.println(f);
	}
	@Test
	public void testUpdateFreelancer()
	{
		Freelancer f = freelancerRepository.findById(1L).get();
	f.setSalaireFreelancer(1000.0);
	freelancerRepository.save(f);
	}
	@Test
	public void testDeleteFreelancer()
	{
		freelancerRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousFreelancers()
	{
	List<Freelancer> freels = freelancerRepository.findAll();
	for (Freelancer f : freels)
	{
	System.out.println(f);
	}
	}
	@Test
	public void testFindByNomFreelancerContains()
	{
	Page<Freelancer> freel = freelancerService.getAllFreelancerParPage(0,3);
	System.out.println(freel.getSize());
	System.out.println(freel.getTotalElements());
	System.out.println(freel.getTotalPages());
	freel.getContent().forEach(f -> {System.out.println(f.toString());
	 });
	/*ou bien
	for (Produit p : prods)
	{
	System.out.println(p);
	} */
	}

}
