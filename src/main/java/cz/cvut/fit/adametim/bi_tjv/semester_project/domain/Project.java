package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public final class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String siteAddress;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false)
    private Client client;

    @ManyToOne
    private Manager currentManager;

    @ManyToMany
    private Set<Manager> managers;

    @OneToMany
    private Set<Object> objects;
}
