package uk.ac.ebi.pride.archive.web.service.model.contact;

import java.io.Serializable;

/**
 * @author Florian Reisinger
 *         Date: 14/03/14
 * @since $version
 */
@SuppressWarnings("UnusedDeclaration")
public class ContactDetail implements Serializable {

    private String title;
    private String firstName;
    private String lastName;
    private String email;
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
