package uk.ac.ebi.pride.archive.web.service.model.peptide;

import java.util.List;

/**
 * @author Florian Reisinger
 * @since $version
 */
@SuppressWarnings("unused")
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
    private List<String> searchEngine;
    private List<String> searchEngineScore;
    private String spectrumID;
    private String id;
    private String reportedID;
    private List<String> modifications;

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

    public List<String> getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(List<String> searchEngine) {
        this.searchEngine = searchEngine;
    }

    public List<String> getSearchEngineScore() {
        return searchEngineScore;
    }

    public void setSearchEngineScore(List<String> searchEngineScore) {
        this.searchEngineScore = searchEngineScore;
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

    public List<String> getModifications() {
        return modifications;
    }

    public void setModifications(List<String> modifications) {
        this.modifications = modifications;
    }
}
