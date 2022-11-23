package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.project;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ProjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ProjectToDtoConverter implements Function<Project, ProjectDto> {
    @Override
    public ProjectDto apply(Project project) {
        return new ProjectDto(
                project.getProjectId(),
                project.getName(),
                project.getSiteAddress(),
                project.getClient().getClientId()
        );
    }
}
