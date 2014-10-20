package uk.ac.ebi.pride.archive.web.service.model.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
@ApiModel(value = "ProjectSummary", description = "Summary information about a project")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectSummary implements Serializable {

    @ApiModelProperty(value = "the project's accession number")
    private String accession;
    @ApiModelProperty(value = "the title given to the project")
    private String title;
    @ApiModelProperty(value = "the description provided for the project")
    private String projectDescription;
    @ApiModelProperty(value = "the date the project has been made public")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date publicationDate;
    @ApiModelProperty(value = "the type of submission (complete or partial)")
    private String submissionType;
    @ApiModelProperty(value = "the number of assays associated with this project")
    private int numAssays;
    @ApiModelProperty(value = "the species annotation for the project")
    private Set<String> species;
    @ApiModelProperty(value = "the tissue annotation for the project")
    private Set<String> tissues;
    @ApiModelProperty(value = "the Post Translational Modifications (PTM) annotated for the project")
    private Set<String> ptmNames;
    @ApiModelProperty(value = "the instrument annotation for the project")
    private Set<String> instrumentNames;
    @ApiModelProperty(value = "specific tags added to the project for classification")
    private Set<String> projectTags;

    public ProjectSummary() {
        this.species = new HashSet<String>();
        this.tissues = new HashSet<String>();
        this.ptmNames = new HashSet<String>();
        this.instrumentNames = new HashSet<String>();
        this.projectTags = new HashSet<String>();
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

    public Set<String> getProjectTags() {
        return projectTags;
    }

    public void setProjectTags(Set<String> projectTags) {
        this.projectTags = projectTags;
    }
}
