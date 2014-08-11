package uk.ac.ebi.pride.archive.web.service.model.project;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
public class ProjectSummary implements Serializable {

    private String accession;
    private String title;
    private String projectDescription;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date publicationDate;
    private String submissionType;
    private int numAssays;
    private Set<String> species;
    private Set<String> tissues;
    private Set<String> ptmNames;
    private Set<String> instrumentNames;

    public ProjectSummary() {
        this.species = new HashSet<String>();
        this.tissues = new HashSet<String>();
        this.ptmNames = new HashSet<String>();
        this.instrumentNames = new HashSet<String>();
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public int getNumAssays() {
        return numAssays;
    }

    public void setNumAssays(int numAssays) {
        this.numAssays = numAssays;
    }

    public Set<String> getSpecies() {
        return species;
    }

    public void setSpecies(Set<String> species) {
        this.species = species;
    }

    public Set<String> getTissues() {
        return tissues;
    }

    public void setTissues(Set<String> tissues) {
        this.tissues = tissues;
    }

    public Set<String> getPtmNames() {
        return ptmNames;
    }

    public void setPtmNames(Set<String> ptmNames) {
        this.ptmNames = ptmNames;
    }

    public Set<String> getInstrumentNames() {
        return instrumentNames;
    }

    public void setInstrumentNames(Set<String> instrumentNames) {
        this.instrumentNames = instrumentNames;
    }
}
