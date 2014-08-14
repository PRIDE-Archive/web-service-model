package uk.ac.ebi.pride.archive.web.service.model.assay;

import java.util.Comparator;

/**
 * @author Florian Reisinger
 * @since 0.1
 */
public class AssayAccessionComparator<T extends AssaySummary> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return  o1.getAssayAccession().compareTo(o2.getAssayAccession());
    }
}
