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

    public Object(Long objectId, Project project) {
        this.objectId = objectId;
        this.project = project;
    }

    public Object() {}

    @Override
    public String toString() {
        return "Object{" +
                "objectId=" + objectId +
                ", project=" + project +
                '}';
    }

    public Long getObjectId() {
        return objectId;
    }

    public Project getProject() {
        return project;
    }
}
