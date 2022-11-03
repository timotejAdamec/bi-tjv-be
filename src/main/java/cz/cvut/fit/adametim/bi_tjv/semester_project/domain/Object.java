package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public final class Object {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long objectId;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false)
    private Project project;

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long object_id) {
        this.objectId = object_id;
    }
}
