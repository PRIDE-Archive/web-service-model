package uk.ac.ebi.pride.archive.web.service.model.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Florian Reisinger
 * @since 0.1
 */
@SuppressWarnings("UnusedDeclaration")
public class ObjectList<T> {

    List<T> list;

    public ObjectList() {
        list = new ArrayList<T>();
    }

    public ObjectList(Collection<T> list) {
        this.list = new ArrayList<T>();
        this.list.addAll(list);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int size() {
        return this.list.size();
    }

}
