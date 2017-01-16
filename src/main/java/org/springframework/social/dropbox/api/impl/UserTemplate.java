package org.springframework.social.dropbox.api.impl;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.social.dropbox.api.DropboxProfile;
import org.springframework.social.dropbox.api.UserOperations;
import org.springframework.web.client.RestTemplate;

public class UserTemplate extends AbstractDropboxOperations implements UserOperations{
	private final RestTemplate restTemplate;
	public UserTemplate(DropboxTemplate dropboxTemplate, RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}

	@Override
	public DropboxProfile getUserProfile() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?>httpEntity=new HttpEntity<>(headers);
		DropboxProfile user=restTemplate.exchange(buildUri("users/get_current_account"), HttpMethod.POST, httpEntity, DropboxProfile.class).getBody();
		
		return user;

	}

}
