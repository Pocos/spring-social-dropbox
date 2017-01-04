package org.springframework.social.dropbox.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.dropbox.api.Dropbox;

public class DropboxConnectionFactory extends OAuth2ConnectionFactory<Dropbox> {

	public DropboxConnectionFactory(String clientId, String clientSecret) {
		super("dropbox", new DropboxServiceProvider(clientId, clientSecret), new DropboxAdapter());
	}
}
