package uk.ac.ebi.pride.archive.web.service.model.assay;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@SuppressWarnings("UnusedDeclaration")
public class AssaySummaryList extends ObjectList<AssaySummary> {

    public AssaySummaryList() {
        super();
    }

    public AssaySummaryList(Collection<AssaySummary> list) {
        super(list);
    }
}
