package uk.ac.ebi.pride.archive.web.service.model.file;

/**
 * @author Florian Reisinger
 * @since 0.1flo
 */
public enum FileType {
    RESULT("RESULT", 1),
    PEAK("PEAK", 2),
    RAW("RAW", 3),
    SEARCH("SEARCH", 4),
    QUANTIFICATION("QUANTIFICATION", 5),
    GEL("GEL", 6),
    OTHER("OTHER", 7);

    private String name;
    private int sortOrder;

    private FileType(String name, int index) {
        this.name = name;
        this.sortOrder = index;
    }

    public String getName() {
        return name;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public static FileType findForName(String name) {
        for (FileType type : values()) {
            if ( name.equalsIgnoreCase(type.getName()) ) {
                return type;
            }
        }
        return null;
    }
}
