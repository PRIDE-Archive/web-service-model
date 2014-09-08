package uk.ac.ebi.pride.archive.web.service.model.assay;

import uk.ac.ebi.pride.archive.web.service.model.contact.ContactDetail;

import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
public class AssayDetail extends AssaySummary {

    private String experimentalFactor;
    private int proteinCount;
    private int peptideCount;
    private int uniquePeptideCount;
    private int identifiedSpectrumCount;
    private int totalSpectrumCount;
    private boolean ms2Annotation;
    private boolean chromatogram;
    private Set<String> softwares;
    private Set<String> diseases;
    private Set<String> quantMethods;
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
