package uk.ac.ebi.pride.archive.web.service.model.file;

import java.io.Serializable;
import java.net.URL;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
//@ApiModel(value = "Details of a dataset file.", description = "Details for one of the dataset files.")
@SuppressWarnings("UnusedDeclaration")
public class FileDetail implements Serializable {

    private String projectAccession;
    private String assayAccession;
    private FileType fileType;
//    @ApiModelProperty(value = "size in bytes", notes = "in bytes", dataType = "bytes", required = true)
    private long fileSize;
    private String fileName;
    private URL downloadLink;

    public String getProjectAccession() {
        return projectAccession;
    }

    public void setProjectAccession(String projectAccession) {
        this.projectAccession = projectAccession;
    }

    public String getAssayAccession() {
        return assayAccession;
    }

    public void setAssayAccession(String assayAccession) {
        this.assayAccession = assayAccession;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    //    @ApiModelProperty(value = "size in bytes", notes = "in bytes", dataType = "bytes", required = true)
    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public URL getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(URL downloadLink) {
        this.downloadLink = downloadLink;
    }
}
