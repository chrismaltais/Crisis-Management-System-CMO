package cmo.sample;

import org.springframework.data.repository.CrudRepository;

public interface SampleEntityRepository extends CrudRepository<SampleEntity, Long> {
	
	public SampleEntity findById(int id);

}
