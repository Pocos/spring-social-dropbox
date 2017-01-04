package org.springframework.social.dropbox.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DropboxProfile {

	private String account_id;

	private String email;

	private DropboxProfileName name;

	public DropboxProfile(){	
	}
	
	public DropboxProfile(String account_id,  DropboxProfileName name, String email) {
		this.account_id = account_id;
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public DropboxProfileName getName() {
		return name;
	}

	public String getAccount_id() {
		return account_id;
	}
}
