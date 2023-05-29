package com.ust.responses.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.responses.model.Response;

public interface responseRepository extends JpaRepository<Response,Long>{

	

}
