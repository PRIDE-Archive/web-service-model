package uk.ac.ebi.pride.archive.web.service.model.protein;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 1.0.8
 */
public class ProteinDetail implements Serializable {


    private String accession;
    private Set<String> synonyms;
    private Set<String> projectAccessions;
    private Set<String> assayAccessions;
    private List<String> description;
    private String sequence;

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

    public void setProjectAccessions(Set<String> projectAccessions) {
        this.projectAccessions = projectAccessions;
    }

    public Set<String> getProjectAccessions() {
        return projectAccessions;
    }

    public void setAssayAccessions(Set<String> assayAccessions) {
        this.assayAccessions = assayAccessions;
    }

    public Set<String> getAssayAccessions() {
        return assayAccessions;
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
}
