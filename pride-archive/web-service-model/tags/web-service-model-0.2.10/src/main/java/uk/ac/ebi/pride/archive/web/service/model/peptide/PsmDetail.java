package uk.ac.ebi.pride.archive.web.service.model.peptide;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModelProperty;
import uk.ac.ebi.pride.archive.web.service.model.common.ModifiedLocation;
import uk.ac.ebi.pride.archive.web.service.model.common.Pair;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.2.2
 */
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PsmDetail {

    @ApiModelProperty(value = "the theoretical mz value of the peptide")
    private Double calculatedMZ;
    @ApiModelProperty(value = "the assay in which this peptide was reported")
    private String assayAccession;
    @ApiModelProperty(value = "the peptide sequence identified")
    private String sequence;
    @ApiModelProperty(value = "the reported position on the protein where the peptide starts")
    private Integer startPosition;
    @ApiModelProperty(value = "the reported position on the protein where the peptide ends")
    private Integer endPosition;
    @ApiModelProperty(value = "the reported accession of the protein containing the peptide")
    private String proteinAccession;
    @ApiModelProperty(value = "the project in which this peptide was reported")
    private String projectAccession;
    @ApiModelProperty(value = "the experimental/reported mz value of the peptide")
    private Double experimentalMZ;
    @ApiModelProperty(value = "the reported charge")
    private Integer charge;
    @ApiModelProperty(value = "reported amino acid preceding the peptide")
    private String preAA;
    @ApiModelProperty(value = "reported amino acid following the peptide")
    private String postAA;
    @ApiModelProperty(value = "the reported retention time")
    private Double retentionTime;
    @ApiModelProperty(value = "the search engine(s) used to generate the identification")
    private Set<String> searchEngines;
    @ApiModelProperty(value = "the scores reported by the search engine(s) represented as key - value pairs")
    private Set<Pair<String, Double>> searchEngineScores;
    @ApiModelProperty(value = "the ID of the spectrum used for the identification")
    private String spectrumID;
    @ApiModelProperty(value = "a unique ID assigned by PRIDE to this peptide identification")
    private String id;
    @ApiModelProperty(value = "the reported ID of this peptide identification (usually, but not necessarily, unique to an assay)")
    private String reportedID;
    @ApiModelProperty(value = "the modifications reported for this peptide")
    private Set<ModifiedLocation> modifications;

    public PsmDetail() {
        this.searchEngines = new HashSet<String>();
        this.searchEngineScores = new HashSet<Pair<String, Double>>();
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

    public Set<Pair<String, Double>> getSearchEngineScores() {
        return searchEngineScores;
    }

    public void setSearchEngineScores(Set<Pair<String, Double>> searchEngineScores) {
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
