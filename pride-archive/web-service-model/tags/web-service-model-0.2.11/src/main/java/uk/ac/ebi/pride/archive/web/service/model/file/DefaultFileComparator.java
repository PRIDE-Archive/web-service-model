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

        // sort on project accession
        int result = o1.getProjectAccession().compareTo(o2.getProjectAccession());
        if (result != 0) { // if there is a difference, no need to check further
            return result;
        }

        // if the project accessions are the same, sort on assay accession
        result = o1.getAssayAccession().compareTo(o2.getAssayAccession());
        if (result != 0) { // if there is a difference, no need to check further
            return result;
        }

        // if the project and assay accessions are also the same, sort on file type
        result = Integer.compare(o1.getFileType().getSortOrder(), o2.getFileType().getSortOrder());
        if (result != 0) { // if there is a difference, no need to check further
            return result;
        }

        // if project, assay and type are the same, sort on the file name
        return o1.getFileName().compareTo(o2.getFileName());
    }
}
