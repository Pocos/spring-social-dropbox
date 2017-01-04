package org.springframework.social.dropbox.security;

import org.springframework.social.dropbox.api.Dropbox;
import org.springframework.social.dropbox.connect.DropboxConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class DropboxAuthenticationService extends OAuth2AuthenticationService<Dropbox>{
	
	public DropboxAuthenticationService(String clientId, String clientSecret){
		super(new DropboxConnectionFactory(clientId, clientSecret));
	}

}
