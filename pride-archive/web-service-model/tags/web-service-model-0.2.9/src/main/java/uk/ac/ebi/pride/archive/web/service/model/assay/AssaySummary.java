package uk.ac.ebi.pride.archive.web.service.model.assay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssaySummary {

    @ApiModelProperty(value = "the project this assay belongs to")
    private String projectAccession;
    @ApiModelProperty(value = "the accession assigned to the assay")
    private String assayAccession;
    @ApiModelProperty(value = "the title give to the assay by the submitter")
    private String title;
    @ApiModelProperty(value = "the short label give to the assay by the submitter")
    private String shortLabel;
    @ApiModelProperty(value = "the species reported for this assay")
    private Set<String> species;
    @ApiModelProperty(value = "sample details reported for this assay")
    private Set<String> sampleDetails;
    @ApiModelProperty(value = "reported modifications")
    private Set<String> ptmNames;
    @ApiModelProperty(value = "reported instrument information")
    private Set<String> instrumentNames;
    @ApiModelProperty(value = "additional keywords added to this assay")
    private String keywords;

    public String getProjectAccession() {
        return projectAccession;
    }

    public void setProjectAccession(String projectAccession) {
        this.projectAccession = projectAccession;
    }

    public String getAssayAccession() {
        return assayAccession;
    }

    public void setAssayAccession(String assayAccession) {
        this.assayAccession = assayAccession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortLabel() {
        return shortLabel;
    }

    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

    public Set<String> getSpecies() {
        return species;
    }

    public void setSpecies(Set<String> species) {
        this.species = species;
    }

    public Set<String> getSampleDetails() {
        return sampleDetails;
    }

    public void setSampleDetails(Set<String> sampleDetails) {
        this.sampleDetails = sampleDetails;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
