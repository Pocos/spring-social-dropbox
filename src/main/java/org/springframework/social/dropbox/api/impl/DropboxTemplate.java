package org.springframework.social.dropbox.api.impl;

import org.springframework.social.dropbox.api.Dropbox;
import org.springframework.social.dropbox.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;

public class DropboxTemplate extends AbstractOAuth2ApiBinding implements Dropbox{

	private UserOperations userOperations;
	
	public DropboxTemplate() {
		initialize();
	}

	public DropboxTemplate(String accessToken) {
		super(accessToken);
		initialize();
	}
	
	
	private void initialize() {
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();

	}

	private void initSubApis() {
		userOperations = new UserTemplate(this, getRestTemplate(), isAuthorized());
	}

	@Override
	public UserOperations userOperations() {
		return userOperations;
	}
}
