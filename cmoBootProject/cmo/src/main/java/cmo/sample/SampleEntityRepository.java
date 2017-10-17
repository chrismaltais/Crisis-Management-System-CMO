package cmo.sample;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * CRUD implementation for SampleEntity as DAO
 * 
 * @author Ong Hock Leng
 *
 */
public interface SampleEntityRepository extends CrudRepository<SampleEntity, Long> {

	public SampleEntity findById(int id);
	
	public List<SampleEntity> findAll();

}
