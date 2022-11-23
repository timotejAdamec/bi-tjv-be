package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.project;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ProjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ProjectToEntityConverter implements Function<ProjectDto, Project> {
    @Override
    public Project apply(ProjectDto projectDto) {
        return null;
    }
}
