package uk.ac.ebi.pride.archive.web.service.model.protein;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since 1.08
 */
public class ProteinDetailList  extends ObjectList<ProteinDetail> implements Serializable {

    public ProteinDetailList() {
        super();
    }

    public ProteinDetailList(Collection<ProteinDetail> list) {
        super(list);
    }

    public ProteinDetail getProteinByAccession(String accession) {
        for (ProteinDetail proteinDetail : getList()) {
            if (proteinDetail.getAccession().equalsIgnoreCase(accession)) {
                return proteinDetail;
            }
        }
        return null;
    }

}
