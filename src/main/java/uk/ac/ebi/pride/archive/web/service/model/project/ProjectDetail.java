package uk.ac.ebi.pride.archive.web.service.model.project;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import uk.ac.ebi.pride.archive.web.service.model.contact.ContactDetail;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 1.0.6
 */
@SuppressWarnings("UnusedDeclaration")
@ApiModel(value = "ProjectDetail", description = "Detailed information about a project")
public class ProjectDetail extends ProjectSummary implements Serializable {

    @ApiModelProperty(value = "the Digital Object Identifier (DOI) for the project (if available)")
    private String doi;
    @ApiModelProperty(value = "details of the submitter of the dataset")
    private ContactDetail submitter;
    @ApiModelProperty(value = "the Lab-Head or PI associated to the dataset")
    private Set<ContactDetail> labHeads;
    @ApiModelProperty(value = "the date the project has been submitted")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date submissionDate;
    @ApiModelProperty(value = "annotation to indicate that the dataset is a re-analysis based on other public data")
    private String reanalysis;
    @ApiModelProperty(value = "the type(s) of experiment preformed")
    private Set<String> experimentTypes;
    @ApiModelProperty(value = "the quantification method(s) used with the dataset (if any)")
    private Set<String> quantificationMethods;
    @ApiModelProperty(value = "relevant keywords associated with the project")
    private String keywords;

    @ApiModelProperty(value = "roject meta-data: information about the sample processing")
    private String sampleProcessingProtocol;
    @ApiModelProperty(value = "project meta-data: information about the data processing")
    private String dataProcessingProtocol;

    @ApiModelProperty(value = "links to other datasets related to this project (if available)")
    private String otherOmicsLink;

    @ApiModelProperty(value = "project statistics: number of reported proteins")
    private int numProteins;
    @ApiModelProperty(value = "project statistics: number of reported peptides")
    private int numPeptides;
    @ApiModelProperty(value = "project statistics: number of spectra")
    private int numSpectra;
    @ApiModelProperty(value = "project statistics: number of unique peptides")
    private int numUniquePeptides;
    @ApiModelProperty(value = "project statistics: number of identified spectra")
    private int numIdentifiedSpectra;

    public ProjectDetail() {
        this.labHeads = new HashSet<ContactDetail>();
        this.experimentTypes = new HashSet<String>();
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public ContactDetail getSubmitter() {
        return submitter;
    }

    public void setSubmitter(ContactDetail submitter) {
        this.submitter = submitter;
    }

    public Set<ContactDetail> getLabHeads() {
        return labHeads;
    }

    public void setLabHeads(Set<ContactDetail> labHeads) {
        this.labHeads = labHeads;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getReanalysis() {
        return reanalysis;
    }

    public void setReanalysis(String reanalysis) {
        this.reanalysis = reanalysis;
    }

    public Set<String> getExperimentTypes() {
        return experimentTypes;
    }

    public void setExperimentTypes(Set<String> experimentTypes) {
        this.experimentTypes = experimentTypes;
    }

    public Set<String> getQuantificationMethods() {
        return quantificationMethods;
    }

    public void setQuantificationMethods(Set<String> quantificationMethods) {
        this.quantificationMethods = quantificationMethods;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSampleProcessingProtocol() {
        return sampleProcessingProtocol;
    }

    public void setSampleProcessingProtocol(String sampleProcessingProtocol) {
        this.sampleProcessingProtocol = sampleProcessingProtocol;
    }

    public String getDataProcessingProtocol() {
        return dataProcessingProtocol;
    }

    public void setDataProcessingProtocol(String dataProcessingProtocol) {
        this.dataProcessingProtocol = dataProcessingProtocol;
    }

    public String getOtherOmicsLink() {
        return otherOmicsLink;
    }

    public void setOtherOmicsLink(String otherOmicsLink) {
        this.otherOmicsLink = otherOmicsLink;
    }

    public int getNumProteins() {
        return numProteins;
    }

    public void setNumProteins(int numProteins) {
        this.numProteins = numProteins;
    }

    public int getNumPeptides() {
        return numPeptides;
    }

    public void setNumPeptides(int numPeptides) {
        this.numPeptides = numPeptides;
    }

    public int getNumSpectra() {
        return numSpectra;
    }

    public void setNumSpectra(int numSpectra) {
        this.numSpectra = numSpectra;
    }

    public int getNumUniquePeptides() {
        return numUniquePeptides;
    }

    public void setNumUniquePeptides(int numUniquePeptides) {
        this.numUniquePeptides = numUniquePeptides;
    }

    public int getNumIdentifiedSpectra() {
        return numIdentifiedSpectra;
    }

    public void setNumIdentifiedSpectra(int numIdentifiedSpectra) {
        this.numIdentifiedSpectra = numIdentifiedSpectra;
    }
}
