package com.ojas.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.demo.entity.TeamsEntity;
@Repository
public interface TeamsRepositoy extends JpaRepository<TeamsEntity, Integer> {

}
