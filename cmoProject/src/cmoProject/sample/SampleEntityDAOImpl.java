package cmoProject.sample;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class SampleEntityDAOImpl implements SampleEntityDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(ds);
		
		// reinitialize table SampleEntity
		this.jdbcTemplate.update("drop table if exists sampleentity");
		this.jdbcTemplate.update("create table sampleentity(id int not null auto_increment,"
				+ "name varchar(20) not null, age int not null, primary key (id))");
	}

	@Override
	public void addEntity(String name, int age) {
		String SQL = "insert into sampleentity (name, age) values (?, ?)";
		jdbcTemplate.update(SQL, name, age);
	}

	@Override
	public SampleEntity getEntity(int id) {
		String SQL = "select * from sampleentity where id = ?";
		return (SampleEntity) jdbcTemplate.queryForObject(SQL, new Object[] {id}, new SampleEntityMapper());
	}

	@Override
	public List<SampleEntity> getEntities() {
		String SQL = "select * from sampleentity";
		return (List<SampleEntity>) jdbcTemplate.query(SQL, new SampleEntityMapper());
	}

	@Override
	public void updateName(int id, String name) {
		String SQL = "update sampleentity set name = ? where id = ?";
		jdbcTemplate.update(SQL, name, id);
	}

	@Override
	public void updateAge(int id, int age) {
		String SQL = "update sampleentity set age = ? where id = ?";
		jdbcTemplate.update(SQL, age, id);
	}

	@Override
	public void deleteEntity(int id) {
		String SQL = "delete from sampleentity where id = ?";
		jdbcTemplate.update(SQL, id);
	}

}
