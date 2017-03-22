package org.springframework.social.dropbox.connect;

import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Parameters;
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
	
	@Override
	public String buildAuthorizeUrl(OAuth2Parameters parameters) {
		if(parameters.containsKey("_csrf")){
			parameters.remove("_csrf");
		}
		return super.buildAuthorizeUrl(parameters);
	}

	@Override
	public String buildAuthorizeUrl(GrantType grantType, OAuth2Parameters parameters) {
		if(parameters.containsKey("_csrf")){
			parameters.remove("_csrf");
		}
		return super.buildAuthorizeUrl(grantType, parameters);
	}

	@Override
	public String buildAuthenticateUrl(OAuth2Parameters parameters) {
		if(parameters.containsKey("_csrf")){
			parameters.remove("_csrf");
		}
		return super.buildAuthenticateUrl(parameters);
	}

	@Override
	public String buildAuthenticateUrl(GrantType grantType, OAuth2Parameters parameters) {
		if(parameters.containsKey("_csrf")){
			parameters.remove("_csrf");
		}
		return super.buildAuthenticateUrl(grantType, parameters);
	}

}
