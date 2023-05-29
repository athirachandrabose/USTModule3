package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.Entityclass;

@Repository
public interface EntityRepo extends JpaRepository<Entityclass,Long> { 




}
