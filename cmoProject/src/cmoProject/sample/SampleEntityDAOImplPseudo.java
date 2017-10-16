package cmoProject.sample;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class SampleEntityDAOImplPseudo implements SampleEntityDAO {
	
	private List<SampleEntity> dbEntities;
	private int idCount;
	
	public SampleEntityDAOImplPseudo() {
		this.dbEntities = new ArrayList<SampleEntity>();
		this.idCount = 0;
	}

	@Override
	public void addEntity(String name, int age) {
		SampleEntity entity = new SampleEntity();
		entity.setId(++idCount);
		entity.setName("$" + name);
		entity.setAge(age);
		dbEntities.add(entity);
	}

	@Override
	public SampleEntity getEntity(int id) {
		for (SampleEntity e : dbEntities) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<SampleEntity> getEntities() {
		return dbEntities;
	}

	@Override
	public void updateName(int id, String name) {
		for (int i = 0; i < dbEntities.size(); i++) {
			if (dbEntities.get(i).getId() == id) {
				dbEntities.get(i).setName(name);
			}
		}
	}

	@Override
	public void updateAge(int id, int age) {
		for (int i = 0; i < dbEntities.size(); i++) {
			if (dbEntities.get(i).getId() == id) {
				dbEntities.get(i).setAge(age);
			}
		}
	}

	@Override
	public void deleteEntity(int id) {
		for (int i = 0; i < dbEntities.size(); i++) {
			if (dbEntities.get(i).getId() == id) {
				dbEntities.remove(i);
			}
		}
	}

}
