package uk.ac.ebi.pride.archive.web.service.model.assay;

import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
public class AssaySummary {

    private String projectAccession;
    private String assayAccession;
    private String title;
    private String shortLabel;
    private Set<String> species;
    private Set<String> sampleDetails;
    private Set<String> ptmNames;
    private Set<String> instrumentNames;
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
