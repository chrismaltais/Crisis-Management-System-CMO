package cmoProject.dao;

import org.springframework.stereotype.Repository;

@Repository
public class loginDAO {

	public boolean authenticate(String username, String password, String domain) {
		if ((username == "analyst") & (password == "analyst") & (domain == "analyst"))
			return true;
		else
			return false;

	}

}
