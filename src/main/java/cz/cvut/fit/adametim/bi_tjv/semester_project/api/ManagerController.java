package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ManagerDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;

@RestController
@RequestMapping("/managers")
public final class ManagerController extends GenericController<Manager, ManagerDto, Long> {
    public ManagerController(AbstractCrudService<Manager, Long> service,
                             Function<Manager, ManagerDto> toDtoConverter,
                             Function<ManagerDto, Manager> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }

    @PutMapping("/{managerId}")
    public void update(@RequestBody ManagerDto e, @PathVariable("managerId") Long id) {
        service.update(toEntityConverter.apply(e));
    }

    @DeleteMapping("/{managerId}")
    public void deleteById(@PathVariable ("managerId") Long id) {
        service.deleteById(id);
    }
}
