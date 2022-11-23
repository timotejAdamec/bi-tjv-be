package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.ProjectRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.stereotype.Service;

@Service
public final class ProjectService extends AbstractCrudService<Project, Long> {

    public ProjectService(ProjectRepository repository) {
        super(repository);
    }
}
