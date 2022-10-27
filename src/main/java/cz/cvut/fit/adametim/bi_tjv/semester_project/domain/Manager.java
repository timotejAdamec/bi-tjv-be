package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public final class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long managerId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String phoneNumber;

    @OneToMany
    private Set<Project> projectsCurrentlyLed;

    @ManyToMany
    private Set<Project> projectsLed;

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", projectsCurrentlyLed=" + projectsCurrentlyLed +
                ", projectsLed=" + projectsLed +
                '}';
    }

    public Long getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Set<Project> getProjectsCurrentlyLed() {
        return projectsCurrentlyLed;
    }

    public Set<Project> getProjectsLed() {
        return projectsLed;
    }
}
