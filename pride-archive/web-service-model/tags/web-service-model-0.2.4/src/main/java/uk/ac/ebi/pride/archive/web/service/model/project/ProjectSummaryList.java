package uk.ac.ebi.pride.archive.web.service.model.project;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Florian Reisinger
 *         Date: 14/03/14
 * @since $version
 */
@SuppressWarnings("UnusedDeclaration")
public class ProjectSummaryList extends ObjectList<ProjectSummary> implements Serializable {

    public ProjectSummaryList() {
        super();
    }

    public ProjectSummaryList(Collection<ProjectSummary> list) {
        super(list);
    }

    public ProjectSummary getProjectByAccession(String accession) {
        for (ProjectSummary projectSummary : getList()) {
            if (projectSummary.getAccession().equalsIgnoreCase(accession)) {
                return projectSummary;
            }
        }
        return null;
    }

}
