package cmoProject.sample;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SampleEntityMapper implements RowMapper<SampleEntity> {

	@Override
	public SampleEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		SampleEntity entity = new SampleEntity();
		entity.setId(rs.getInt("id"));
		entity.setName(rs.getString("name"));
		entity.setAge(rs.getInt("age"));
		return entity;
	}
	
	
}
