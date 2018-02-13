package uk.ac.ebi.pride.archive.web.service.model.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileSource;
import uk.ac.ebi.pride.archive.dataprovider.file.ProjectFileType;

import java.io.Serializable;
import java.net.URL;

/**
 * @author Florian Reisinger
 * @since 0.1.6
 */
@ApiModel(value = "Details of a dataset file.", description = "Details for one of the dataset files.")
@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileDetail implements Serializable {

    @ApiModelProperty(dataType = "the project the file belongs to")
    private String projectAccession;
    @ApiModelProperty(dataType = "the assay the file belongs to")
    private String assayAccession;
    @ApiModelProperty(dataType = "string")
    private ProjectFileType fileType;
    @ApiModelProperty(value = "SUBMITTED (part of the original dataset)  or GENERATED (added to the submission by PRIDE)", dataType = "string")
    private ProjectFileSource fileSource;
    @ApiModelProperty(value = "size in bytes")
    private long fileSize;
    @ApiModelProperty(value = "the name of the file")
    private String fileName;
    @ApiModelProperty(value = "public FTP download link", dataType = "string")
    private URL ftpDownloadLink;
    @ApiModelProperty(value = "public Aspera download link", dataType = "string")
    private String asperaDownloadLink;

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

    public ProjectFileType getFileType() {
        return fileType;
    }

    public void setFileType(ProjectFileType fileType) {
        this.fileType = fileType;
    }

    public ProjectFileSource getFileSource() {
        return fileSource;
    }

    public void setFileSource(ProjectFileSource fileSource) {
        this.fileSource = fileSource;
    }

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

    public URL getFtpDownloadLink() {
        return ftpDownloadLink;
    }

    public void setFtpDownloadLink(URL ftpDownloadLink) {
        this.ftpDownloadLink = ftpDownloadLink;
    }

    public String getAsperaDownloadLink() {
        return asperaDownloadLink;
    }

    public void setAsperaDownloadLink(String asperaDownloadLink) {
        this.asperaDownloadLink = asperaDownloadLink.toLowerCase();
    }
}
