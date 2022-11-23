package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.project;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ProjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.ClientRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ProjectToEntityConverter implements Function<ProjectDto, Project> {

    private final ClientRepository clientRepository;

    @Autowired
    public ProjectToEntityConverter(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Project apply(ProjectDto projectDto) {
        return new Project(
                projectDto.projectId(),
                projectDto.name(),
                projectDto.siteAddress(),
                clientRepository.getReferenceById(projectDto.clientId())
        );
    }
}
