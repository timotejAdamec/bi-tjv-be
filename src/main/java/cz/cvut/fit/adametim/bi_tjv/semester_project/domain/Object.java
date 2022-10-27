package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;

@Entity
public final class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long objectId;

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long object_id) {
        this.objectId = object_id;
    }
}
