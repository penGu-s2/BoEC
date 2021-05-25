package BoECdemo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Utilities;

@Repository
public interface UtilitiesRepository extends JpaRepository<Utilities, Integer>{
@Query(value="SELECT * From utilities WHERE roleid =?1", nativeQuery =true )
List<Utilities> getAll();
Optional<Utilities> getById(Long id);

}
