package uk.ac.ebi.pride.archive.web.service.model.peptide;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import uk.ac.ebi.pride.archive.web.service.model.common.ModifiedLocation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.2.2
 */
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PsmDetail {
    private Double calculatedMZ;
    private String assayAccession;
    private String sequence;
    private Integer startPosition;
    private Integer endPosition;
    private String proteinAccession;
    private String projectAccession;
    private Double experimentalMZ;
    private Integer charge;
    private String preAA;
    private String postAA;
    private Double retentionTime;
    private Set<String> searchEngines;
    private Set<String> searchEngineScores;
    private String spectrumID;
    private String id;
    private String reportedID;
    private Set<ModifiedLocation> modifications;

    public PsmDetail() {
        this.searchEngines = new HashSet<String>();
        this.searchEngineScores = new HashSet<String>();
        this.modifications = new HashSet<ModifiedLocation>();
    }

    public Double getCalculatedMZ() {
        return calculatedMZ;
    }

    public void setCalculatedMZ(Double calculatedMZ) {
        this.calculatedMZ = calculatedMZ;
    }

    public String getAssayAccession() {
        return assayAccession;
    }

    public void setAssayAccession(String assayAccession) {
        this.assayAccession = assayAccession;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public Integer getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
    }

    public String getProteinAccession() {
        return proteinAccession;
    }

    public void setProteinAccession(String proteinAccession) {
        this.proteinAccession = proteinAccession;
    }

    public String getProjectAccession() {
        return projectAccession;
    }

    public void setProjectAccession(String projectAccession) {
        this.projectAccession = projectAccession;
    }

    public Double getExperimentalMZ() {
        return experimentalMZ;
    }

    public void setExperimentalMZ(Double experimentalMZ) {
        this.experimentalMZ = experimentalMZ;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public String getPreAA() {
        return preAA;
    }

    public void setPreAA(String preAA) {
        this.preAA = preAA;
    }

    public String getPostAA() {
        return postAA;
    }

    public void setPostAA(String postAA) {
        this.postAA = postAA;
    }

    public Double getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Double retentionTime) {
        this.retentionTime = retentionTime;
    }

    public Set<String> getSearchEngines() {
        return searchEngines;
    }

    public void setSearchEngines(Set<String> searchEngines) {
        this.searchEngines = searchEngines;
    }

    public Set<String> getSearchEngineScores() {
        return searchEngineScores;
    }

    public void setSearchEngineScores(Set<String> searchEngineScores) {
        this.searchEngineScores = searchEngineScores;
    }

    public String getSpectrumID() {
        return spectrumID;
    }

    public void setSpectrumID(String spectrumID) {
        this.spectrumID = spectrumID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReportedID() {
        return reportedID;
    }

    public void setReportedID(String reportedID) {
        this.reportedID = reportedID;
    }

    public Set<ModifiedLocation> getModifications() {
        return modifications;
    }

    public void setModifications(Set<ModifiedLocation> modifications) {
        this.modifications = modifications;
    }
}
