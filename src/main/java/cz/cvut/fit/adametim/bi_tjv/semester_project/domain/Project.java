package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public final class Project implements DomainEntity<Long> {
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

    @ManyToOne
    private Manager currentManager;

    @ManyToMany
    private Set<Manager> managers;

    @OneToMany
    private Set<Object> objects;

    public Project(Long projectId, String name, String siteAddress, Client client) {
        this.projectId = projectId;
        this.name = name;
        this.siteAddress = siteAddress;
        this.client = client;
    }

    public Project() {}

    @Override
    public Long getId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", siteAddress='" + siteAddress + '\'' +
                ", client=" + client +
                ", currentManager=" + currentManager +
                ", managers=" + managers +
                ", objects=" + objects +
                '}';
    }

    public Long getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public Client getClient() {
        return client;
    }

    public Manager getCurrentManager() {
        return currentManager;
    }

    public Set<Manager> getManagers() {
        return managers;
    }

    public Set<Object> getObjects() {
        return objects;
    }
}
