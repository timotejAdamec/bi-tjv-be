package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public final class Project {
    @Id
    @NotNull
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
}