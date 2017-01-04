package org.springframework.social.dropbox.connect;

import org.springframework.social.dropbox.api.Dropbox;
import org.springframework.social.dropbox.api.impl.DropboxTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

public class DropboxServiceProvider  extends AbstractOAuth2ServiceProvider<Dropbox> {

	public DropboxServiceProvider(String clientId, String clientSecret) {
		super(new DropboxOAuth2Template(clientId, clientSecret));
	}

	@Override
	public Dropbox getApi(String accessToken) {
		return new DropboxTemplate(accessToken);
	}
}
