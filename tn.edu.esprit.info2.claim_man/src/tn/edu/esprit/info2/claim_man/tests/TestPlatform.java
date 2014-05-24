package tn.edu.esprit.info2.claim_man.tests;

import tn.edu.esprit.info2.claim_man.domain.Claim;
import tn.edu.esprit.info2.claim_man.domain.User;

public class TestPlatform {

	public static void main(String[] args) {

		User user = new User();
		user.addUser("Montassar");

		Claim claim = new Claim();
		claim.addClaim("claim1", "power off", 1);
		claim.display();

		Claim claim2 = new Claim();
		claim2.addClaim("technical problem", "boot error", 1);
		claim2.display();

	}
}
