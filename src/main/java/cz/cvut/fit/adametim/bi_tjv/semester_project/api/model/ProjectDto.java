package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model;

public final class ProjectDto {

    private Long projectId;

    private String name;

    private String siteAddress;

    private Long clientId;

    public Long getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public Long getClientId() {
        return clientId;
    }
}
