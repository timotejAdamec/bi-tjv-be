package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public final class Manager implements DomainEntity<Long> {
    @Id
    @NotNull
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

    public Manager(Long managerId, String name, String phoneNumber) {
        this.managerId = managerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Manager() {}

    @Override
    public Long getId() {
        return managerId;
    }

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

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProjectsCurrentlyLed(Set<Project> projectsCurrentlyLed) {
        this.projectsCurrentlyLed = projectsCurrentlyLed;
    }

    public void setProjectsLed(Set<Project> projectsLed) {
        this.projectsLed = projectsLed;
    }
}
