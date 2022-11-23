package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public final class Client {
    @Id
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long clientId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<Project> projects;

    public Client(Long clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    public Client() {}

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public Set<Project> getProjects() {
        return projects;
    }


}
