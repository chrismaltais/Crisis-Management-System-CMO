package cmo.login;

import org.springframework.stereotype.Repository;

@Repository
public class loginDAO {

	public boolean authenticate(String username, String password, String domain) {
		if (username.equals("analyst") && password.equals("analyst") && domain.equals("analyst"))
			return true;
		else if (username.equals("general") && password.equals("general") && domain.equals("general"))
			return true;
		else
			return false;

	}

}
