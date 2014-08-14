package uk.ac.ebi.pride.archive.web.service.model.project;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class ProjectDetail extends ProjectSummary implements Serializable {

    private String doi;
    private ContactDetail submitter;
    private Set<ContactDetail> lapHeads;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
    private Date submissionDate;
    private String reanalysis;
    private Set<String> experimentTypes;
    private Set<String> quantificationMethods;
    private String keywords;


    private String sampleProcessingProtocol;
    private String dataProcessingProtocol;

    private String otherOmicsLink;

    private int numProteins;
    private int numPeptides;
    private int numSpectra;
    private int numUniquePeptides;
    private int numIdentifiedSpectra;

    public ProjectDetail() {
        this.lapHeads = new HashSet<ContactDetail>();
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

    public Set<ContactDetail> getLapHeads() {
        return lapHeads;
    }

    public void setLapHeads(Set<ContactDetail> lapHeads) {
        this.lapHeads = lapHeads;
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
