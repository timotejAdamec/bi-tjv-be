package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.exceptions.NotFoundException;
import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ProjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;

@RestController
@RequestMapping("/projects")
public final class ProjectController extends GenericController<Project, ProjectDto, Long> {
    public ProjectController(AbstractCrudService<Project, Long> service,
                             Function<Project, ProjectDto> toDtoConverter,
                             Function<ProjectDto, Project> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }

    @GetMapping("/{projectId}")
    public ProjectDto get(@PathVariable("projectId") Long id) {
        var project = service.readById(id);
        if (project.isPresent()) {
            return toDtoConverter.apply(project.get());
        }
        throw new NotFoundException();
    }

    @PutMapping("/{projectId}")
    public void update(@RequestBody ProjectDto e, @PathVariable("projectId") Long id) {
        service.update(toEntityConverter.apply(e));
    }

    @DeleteMapping("/{projectId}")
    public void deleteById(@PathVariable ("projectId") Long id) {
        service.deleteById(id);
    }
}
