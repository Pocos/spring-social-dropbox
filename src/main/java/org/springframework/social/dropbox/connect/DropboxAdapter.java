package org.springframework.social.dropbox.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.dropbox.api.Dropbox;
import org.springframework.social.dropbox.api.DropboxProfile;

public class DropboxAdapter implements ApiAdapter<Dropbox>{

	@Override
	public boolean test(Dropbox api) {
		try {
			api.userOperations().getUserProfile();
			return true;
		} catch(ApiException e) {
			return false;
		}
	}

	@Override
	public void setConnectionValues(Dropbox api, ConnectionValues values) {
		DropboxProfile profile = api.userOperations().getUserProfile();
		values.setProviderUserId(profile.getAccount_id());
	}

	@Override
	public UserProfile fetchUserProfile(Dropbox api) {
		DropboxProfile profile=api.userOperations().getUserProfile();
		
		return new UserProfileBuilder()
				.setFirstName(profile.getName().getGiven_name())
				.setLastName(profile.getName().getSurname())
				.setEmail(profile.getEmail())
				.build();
	}

	@Override
	public void updateStatus(Dropbox api, String message) {
		// TODO Auto-generated method stub
		
	}

}
