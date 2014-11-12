package uk.ac.ebi.pride.archive.web.service.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Florian Reisinger
 *         Date: 14/03/14
 * @since $version
 */
@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDetail implements Serializable {

    @ApiModelProperty(value = "the title of the contact person")
    private String title;
    @ApiModelProperty(value = "the first name of the contact person")
    private String firstName;
    @ApiModelProperty(value = "the last/family name of the contact person")
    private String lastName;
    @ApiModelProperty(value = "the contact's email address")
    private String email;
    @ApiModelProperty(value = "the affiliation of the contact person")
    private String affiliation;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}
