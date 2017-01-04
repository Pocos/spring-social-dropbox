/**
 * 
 */
package org.springframework.social.dropbox.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Andrea M.G. Pocorobba
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DropboxProfileName {

	private String abbreviated_name;
	private String display_name;
	private String familiar_name;
	private String given_name;
	private String surname;
	
	public DropboxProfileName(){
		
	}
	/**
	 * @param given_name
	 * @param surname
	 * @param familiar_name
	 * @param display_name
	 * @param abbreviated_name
	 */
	public DropboxProfileName(String given_name, String surname, String familiar_name, String display_name,
			String abbreviated_name) {
		this.given_name = given_name;
		this.surname = surname;
		this.familiar_name = familiar_name;
		this.display_name = display_name;
		this.abbreviated_name = abbreviated_name;
	}
	public String getAbbreviated_name() {
		return abbreviated_name;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public String getFamiliar_name() {
		return familiar_name;
	}
	public String getGiven_name() {
		return given_name;
	}
	
	public String getSurname() {
		return surname;
	}
}

