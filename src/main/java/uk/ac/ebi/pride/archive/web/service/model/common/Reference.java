package uk.ac.ebi.pride.archive.web.service.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
 * @author Florian Reisinger
 * @since 0.2.11
 */
@SuppressWarnings("UnusedDeclaration")
@ApiModel(value = "Reference", description = "Publication or Reference")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reference {

    @ApiModelProperty(value = "The description of the reference (usually the publication ref line)")
    private String desc;

    @ApiModelProperty(value = "The (prefixed) IDs identifying the reference (prefixes: PMID, PMCID, DOI)")
    private Set<String> ids;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<String> getIds() {
        return ids;
    }

    public void setIds(Set<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reference reference = (Reference) o;

        if (desc != null ? !desc.equals(reference.desc) : reference.desc != null) return false;
        if (ids != null ? !ids.equals(reference.ids) : reference.ids != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = desc != null ? desc.hashCode() : 0;
        result = 31 * result + (ids != null ? ids.hashCode() : 0);
        return result;
    }
}
