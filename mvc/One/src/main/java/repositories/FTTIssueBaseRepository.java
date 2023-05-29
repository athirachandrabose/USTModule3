package repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.FTTIssueBase;


@Repository
public interface FTTIssueBaseRepository extends JpaRepository<FTTIssueBase,String>{

	Optional<FTTIssueBase> findById(String id);

	

	

}
