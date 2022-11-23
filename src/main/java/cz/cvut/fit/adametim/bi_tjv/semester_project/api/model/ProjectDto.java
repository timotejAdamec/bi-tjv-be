package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model;

public record ProjectDto(
        Long projectId,
        String name,
        String siteAddress,
        Long clientId
) {
}
