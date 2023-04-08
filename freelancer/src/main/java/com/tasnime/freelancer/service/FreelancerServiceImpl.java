package com.tasnime.freelancer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.tasnime.freelancer.entities.Freelancer;
import com.tasnime.freelancer.repos.FreelancerRepository;
@Service

public class FreelancerServiceImpl implements FreelancerService{
	@Autowired
	FreelancerRepository freelancerRepository;
	@Override
	public Freelancer saveFreelancer(Freelancer f) {
	return freelancerRepository.save(f);
	}
	@Override
	public Freelancer updateFreelancer(Freelancer f) {
	return freelancerRepository.save(f);
	}
	@Override
	public void deleteFreelancer(Freelancer f) {
		freelancerRepository.delete(f);
	}
	@Override
	public void deleteFreelancerById(Long id) {
		freelancerRepository.deleteById(id);
	}
	@Override
	public Freelancer getFreelancer(Long id) {
	return freelancerRepository.findById(id).get();
	}
	@Override
	public List<Freelancer> getAllFreelancers() {
	return freelancerRepository.findAll();
	}
	@Override
	public Page<Freelancer> getAllFreelancerParPage(int page, int size) {
	return freelancerRepository.findAll(PageRequest.of(page, size));
	}
}
