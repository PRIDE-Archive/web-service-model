package uk.ac.ebi.pride.archive.web.service.model.file;

import java.util.Comparator;

/**
 * @author Florian Reisinger
 * @since 0.1
 */
public class DefaultFileComparator implements Comparator<FileDetail> {

  @Override
  public int compare(FileDetail o1, FileDetail o2) {
    if (o1 == o2) { // if the objects are the same, we don't need to check further
      return 0;
    }
    int result = o1.getProjectAccession().compareTo(o2.getProjectAccession()); // sort on project accession
    if (result != 0) { // if there is a difference, no need to check further
      return result;
    }
    result = o1.getAssayAccession().compareTo(o2.getAssayAccession());  // then, sort on assay accession
    if (result != 0) { // if there is a difference, no need to check further
      return result;
    }
    result = Integer.compare(o1.getFileType().getSortOrder(), o2.getFileType().getSortOrder());  // then sort on file type
    if (result != 0) { // if there is a difference, no need to check further
      return result;
    }
    return o1.getFileName().compareTo(o2.getFileName()); // then, sort on the file name
  }
}
