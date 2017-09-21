package com.software.technology.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software.technology.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
