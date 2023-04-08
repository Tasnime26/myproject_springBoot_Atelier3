package com.tasnime.freelancer.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tasnime.freelancer.entities.Freelancer;

public interface FreelancerService {
	Freelancer saveFreelancer(Freelancer f);
	Freelancer updateFreelancer(Freelancer f);
	void deleteFreelancer(Freelancer f);
	 void deleteFreelancerById(Long id);
	 Freelancer getFreelancer(Long id);
	List<Freelancer> getAllFreelancers();
	Page<Freelancer> getAllFreelancerParPage(int page, int size);
}
