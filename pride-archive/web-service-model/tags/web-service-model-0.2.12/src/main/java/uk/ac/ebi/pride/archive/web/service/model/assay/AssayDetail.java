package uk.ac.ebi.pride.archive.web.service.model.assay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModelProperty;
import uk.ac.ebi.pride.archive.web.service.model.contact.ContactDetail;

import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssayDetail extends AssaySummary {

    @ApiModelProperty(value = "experimental factors reported for this assay")
    private String experimentalFactor;
    @ApiModelProperty(value = "number of proteins in this assay")
    private int proteinCount;
    @ApiModelProperty(value = "number of peptides in this assay")
    private int peptideCount;
    @ApiModelProperty(value = "number of unique peptides in this assay")
    private int uniquePeptideCount;
    @ApiModelProperty(value = "number of identified spectra in this assay")
    private int identifiedSpectrumCount;
    @ApiModelProperty(value = "total number of spectra in this assay")
    private int totalSpectrumCount;
    @ApiModelProperty(value = "flag if ms level 2 annotation is available")
    private boolean ms2Annotation;
    @ApiModelProperty(value = "flag to indicate if a chromatogram is available")
    private boolean chromatogram;
    @ApiModelProperty(value = "software used for the data/result generation")
    private Set<String> softwares;
    @ApiModelProperty(value = "disease annotation provided for this assay (if applicable)")
    private Set<String> diseases;
    @ApiModelProperty(value = "quantification methods used")
    private Set<String> quantMethods;
    @ApiModelProperty(value = "contact persons, usually the submitter of the dataset")
    private Set<ContactDetail> contacts;

    public String getExperimentalFactor() {
        return experimentalFactor;
    }

    public void setExperimentalFactor(String experimentalFactor) {
        this.experimentalFactor = experimentalFactor;
    }

    public int getProteinCount() {
        return proteinCount;
    }

    public void setProteinCount(int proteinCount) {
        this.proteinCount = proteinCount;
    }

    public int getPeptideCount() {
        return peptideCount;
    }

    public void setPeptideCount(int peptideCount) {
        this.peptideCount = peptideCount;
    }

    public int getUniquePeptideCount() {
        return uniquePeptideCount;
    }

    public void setUniquePeptideCount(int uniquePeptideCount) {
        this.uniquePeptideCount = uniquePeptideCount;
    }

    public int getIdentifiedSpectrumCount() {
        return identifiedSpectrumCount;
    }

    public void setIdentifiedSpectrumCount(int identifiedSpectrumCount) {
        this.identifiedSpectrumCount = identifiedSpectrumCount;
    }

    public int getTotalSpectrumCount() {
        return totalSpectrumCount;
    }

    public void setTotalSpectrumCount(int totalSpectrumCount) {
        this.totalSpectrumCount = totalSpectrumCount;
    }

    public boolean isMs2Annotation() {
        return ms2Annotation;
    }

    public void setMs2Annotation(boolean ms2Annotation) {
        this.ms2Annotation = ms2Annotation;
    }

    public boolean isChromatogram() {
        return chromatogram;
    }

    public void setChromatogram(boolean chromatogram) {
        this.chromatogram = chromatogram;
    }

    public Set<String> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(Set<String> softwares) {
        this.softwares = softwares;
    }

    public Set<String> getDiseases() {
        return diseases;
    }

    public void setDiseases(Set<String> diseases) {
        this.diseases = diseases;
    }

    public Set<String> getQuantMethods() {
        return quantMethods;
    }

    public void setQuantMethods(Set<String> quantMethods) {
        this.quantMethods = quantMethods;
    }

    public Set<ContactDetail> getContacts() {
        return contacts;
    }

    public void setContacts(Set<ContactDetail> contacts) {
        this.contacts = contacts;
    }

}
