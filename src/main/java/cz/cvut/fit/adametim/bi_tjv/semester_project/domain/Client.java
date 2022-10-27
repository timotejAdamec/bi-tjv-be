package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public final class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long clientId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + clientId +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }
}
