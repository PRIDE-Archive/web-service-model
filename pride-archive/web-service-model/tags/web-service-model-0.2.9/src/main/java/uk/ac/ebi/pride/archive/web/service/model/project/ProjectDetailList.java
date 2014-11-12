package uk.ac.ebi.pride.archive.web.service.model.project;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since 1.0.6
 */
@SuppressWarnings("UnusedDeclaration")
public class ProjectDetailList extends ObjectList<ProjectDetail> implements Serializable {

    public ProjectDetailList() {
        super();
    }

    public ProjectDetailList(Collection<ProjectDetail> list) {
        super(list);
    }

    public ProjectDetail getProjectByAccession(String accession) {
        for (ProjectDetail projectDetail : getList()) {
            if (projectDetail.getAccession().equalsIgnoreCase(accession)) {
                return projectDetail;
            }
        }
        return null;
    }


}
