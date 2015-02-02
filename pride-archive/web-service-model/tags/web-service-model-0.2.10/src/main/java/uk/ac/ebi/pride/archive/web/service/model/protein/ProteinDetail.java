package uk.ac.ebi.pride.archive.web.service.model.protein;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 1.0.8
 */
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProteinDetail implements Serializable {


    @ApiModelProperty(value = "the submitted accession of the identified protein")
    private String accession;
    @ApiModelProperty(value = "accession synonyms; either UniProt accession or EnsEMBL ID")
    private Set<String> synonyms;
    @ApiModelProperty(value = "the project that identified the protein")
    private String projectAccession;
    @ApiModelProperty(value = "the assay within the project that identified the protein")
    private String assayAccession;
    @ApiModelProperty(value = "a description of the protein (usually inferred from protein accession)")
    private List<String> description;
    @ApiModelProperty(value = "the AA sequence of the identified protein (may be inferred from protein accession)")
    private String sequence;
    @ApiModelProperty(value = "SUBMITTED (provided with dataset) or INFERRED (inferred by PRIDE based on protein accession)", dataType = "string")
    private SequenceType sequenceType;

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getAccession() {
        return accession;
    }

    public void setSynonyms(Set<String> synonyms) {
        this.synonyms = synonyms;
    }

    public Set<String> getSynonyms() {
        return synonyms;
    }

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

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    public SequenceType getSequenceType() {
        return sequenceType;
    }

    public void setSequenceType(SequenceType sequenceType) {
        this.sequenceType = sequenceType;
    }

    public enum SequenceType {
        INFERRED,
        SUBMITTED,
        NOT_AVAILABLE
    }
}
