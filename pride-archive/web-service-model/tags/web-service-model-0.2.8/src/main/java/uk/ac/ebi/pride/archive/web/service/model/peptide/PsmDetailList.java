package uk.ac.ebi.pride.archive.web.service.model.peptide;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since $version
 */
public class PsmDetailList extends ObjectList<PsmDetail> implements Serializable {

        public PsmDetailList() {
            super();
        }

        public PsmDetailList(Collection<PsmDetail> list) {
            super(list);
        }


}
