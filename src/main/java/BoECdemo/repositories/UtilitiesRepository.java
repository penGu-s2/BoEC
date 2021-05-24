package BoECdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Utilities;

@Repository
public interface UtilitiesRepository extends CrudRepository<Utilities, Integer>{
@Query(value="SELECT * From utilities WHERE roleid =?1", nativeQuery =true )
List<Utilities> getListUser(int userid);
}
