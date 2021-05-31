package co.edu.ufps.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import co.edu.ufps.entity.Signature;

public interface SignatureDao extends CrudRepository<Signature, Integer> {

}
