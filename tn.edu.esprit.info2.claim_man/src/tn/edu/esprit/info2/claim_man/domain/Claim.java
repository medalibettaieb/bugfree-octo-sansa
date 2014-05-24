package tn.edu.esprit.info2.claim_man.domain;

import tn.edu.esprit.info2.claim_man.utilities.IdGenerator;

public class Claim {
	public int id;
	public String title;
	public String description;

	public int refUser;

	public Claim() {
	}

	public void addClaim(String titleGiven, String descriptionGiven, int idUser) {

		this.id = IdGenerator.hetId();
		this.title = titleGiven;
		this.description = descriptionGiven;
		this.refUser = idUser;
	}

	public void display() {
		System.out.println("your claim's id is : " + id + " Intitled: " + title
				+ " And it's about:  " + description + " from the user's id: "
				+ refUser);

	}

}
