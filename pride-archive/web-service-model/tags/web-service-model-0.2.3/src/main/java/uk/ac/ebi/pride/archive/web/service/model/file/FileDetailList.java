package uk.ac.ebi.pride.archive.web.service.model.file;

import uk.ac.ebi.pride.archive.web.service.model.common.ObjectList;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Florian Reisinger
 * @since 1.0.6
 */
@SuppressWarnings("UnusedDeclaration")
public class FileDetailList extends ObjectList<FileDetail> implements Serializable {

    public FileDetailList() {
        super();
    }

    public FileDetailList(Collection<FileDetail> list) {
        super(list);
    }
}
