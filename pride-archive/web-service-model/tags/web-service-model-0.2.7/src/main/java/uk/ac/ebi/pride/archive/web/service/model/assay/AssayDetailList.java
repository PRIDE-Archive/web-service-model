package uk.ac.ebi.pride.archive.web.service.model.assay;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since 0.1
 */
@SuppressWarnings("UnusedDeclaration")
public class AssayDetailList extends ObjectList<AssayDetail> {

    public AssayDetailList() {
        super();
    }

    public AssayDetailList(Collection<AssayDetail> list) {
        super(list);
    }

}
