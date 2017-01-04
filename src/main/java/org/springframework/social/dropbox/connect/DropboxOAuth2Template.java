package org.springframework.social.dropbox.connect;

import org.springframework.social.oauth2.OAuth2Template;
/**
 * 
 * @author Andrea M.G. Pocorobba
 *
 */
public class DropboxOAuth2Template extends OAuth2Template{

	private static String AUTHORIZE_URL = "https://www.dropbox.com/oauth2/authorize";
	private static String ACCESS_TOKEN_URL = "https://api.dropboxapi.com/oauth2/token";
	
	/**
	 * @param clientId
	 * @param clientSecret
	 */
	public DropboxOAuth2Template(String clientId, String clientSecret) {
		super(clientId, clientSecret,AUTHORIZE_URL, ACCESS_TOKEN_URL);
		setUseParametersForClientAuthentication(true);
	}

}
