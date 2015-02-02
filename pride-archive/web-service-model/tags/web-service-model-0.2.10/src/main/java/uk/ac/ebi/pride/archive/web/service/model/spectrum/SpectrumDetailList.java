package uk.ac.ebi.pride.archive.web.service.model.spectrum;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;
import uk.ac.ebi.pride.archive.web.service.model.protein.ProteinDetail;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Jose A. Dianes
 * @since 0.2.6
 */
public class SpectrumDetailList extends ObjectList<SpectrumDetail> implements Serializable {

    public SpectrumDetailList() {
        super();
    }

    public SpectrumDetailList(Collection<SpectrumDetail> list) {
        super(list);
    }

    public SpectrumDetail getSpectrumById(String spectrumId) {
        for (SpectrumDetail spectrumDetail : getList()) {
            if (spectrumDetail.getSpectrumId().equalsIgnoreCase(spectrumId)) {
                return spectrumDetail;
            }
        }
        return null;
    }

}
