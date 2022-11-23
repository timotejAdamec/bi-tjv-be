package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ProjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/projects")
public final class ProjectController extends AbstractCrudController<Project, ProjectDto, Long> {
    public ProjectController(AbstractCrudService<Project, Long> service,
                             Function<Project, ProjectDto> toDtoConverter,
                             Function<ProjectDto, Project> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }
}
