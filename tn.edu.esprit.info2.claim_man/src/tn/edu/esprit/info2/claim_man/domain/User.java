package tn.edu.esprit.info2.claim_man.domain;

import tn.edu.esprit.info2.claim_man.utilities.IdGenerator;

public class User {
	public int id;
	public String name;
	public String login;
	public String password;

	public User() {

	}

	public void addUser(String name) {
		this.id = IdGenerator.hetId();
		this.name = name;
	}

}
