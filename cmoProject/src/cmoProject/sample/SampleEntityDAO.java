package cmoProject.sample;

import java.util.List;

import javax.sql.DataSource;

/**Sample interface used for pseudo DB access
 * Following CRUD (Create, Read, Update & Delete)
 * 
 * @author Ong Hock Leng
 *
 */
public interface SampleEntityDAO {
	// Create
	public void addEntity(String name, int age);
	
	// Read
	public SampleEntity getEntity(int id);
	public List<SampleEntity> getEntities();
	
	// Update
	public void updateName(int id, String name);
	public void updateAge(int id, int age);
	
	// Delete
	public void deleteEntity(int id);
}
