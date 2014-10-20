package uk.ac.ebi.pride.archive.web.service.model.common;

/**
 * @author florian@ebi.ac.uk.
 * @since 0.2.3
 */
@SuppressWarnings("unused")
public class ModifiedLocation {

    private String modification;
    private int location;

    public ModifiedLocation(String modification, int location) {
        this.modification = modification;
        this.location = location;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifiedLocation that = (ModifiedLocation) o;

        if (location != that.location) return false;
        if (modification != null ? !modification.equals(that.modification) : that.modification != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modification != null ? modification.hashCode() : 0;
        result = 31 * result + location;
        return result;
    }
}
