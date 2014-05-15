package uk.ac.ebi.pride.archive.web.service.model.file;

import java.util.Comparator;

/**
 * @author Florian Reisinger
 * @since 0.1
 */
public class DefaultFileComparator implements Comparator<FileDetail> {

    @Override
    public int compare(FileDetail o1, FileDetail o2) {
        // if the objects are the same, we don't need to check further
        if (o1 == o2) {
            return 0;
        }

        // compare the file type first
        int result = Integer.compare(o1.getFileType().getSortOrder(), o2.getFileType().getSortOrder());

        // if the types are the same, we use the file name for sorting
        if (result == 0) {
            // the file name alone may not be unique, but there should never
            // be two files with the same name in the same assay!
            String uniqueFileName1 = o1.getAssayAccession() + o1.getFileName();
            String uniqueFileName2 = o2.getAssayAccession() + o2.getFileName();
            result = uniqueFileName1.compareTo(uniqueFileName2);
        }

        return result;
    }
}
