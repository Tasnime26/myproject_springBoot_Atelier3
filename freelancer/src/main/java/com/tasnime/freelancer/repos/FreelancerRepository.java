package com.tasnime.freelancer.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasnime.freelancer.entities.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {

}
