package BoECdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import BoECdemo.models.Promotion;
@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Integer>{

}
