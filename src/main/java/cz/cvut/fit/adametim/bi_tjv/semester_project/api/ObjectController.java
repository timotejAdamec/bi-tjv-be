package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ObjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.web.bind.annotation.*;

import java.util.function.Function;

@RestController
@RequestMapping("/objects")
public final class ObjectController extends GenericController<Object, ObjectDto, Long> {
    public ObjectController(AbstractCrudService<Object, Long> service,
                            Function<Object, ObjectDto> toDtoConverter,
                            Function<ObjectDto, Object> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }

    @PutMapping("/{objectId}")
    public void update(@RequestBody ObjectDto e, @PathVariable("objectId") Long id) {
        service.update(toEntityConverter.apply(e));
    }

    @DeleteMapping("/{objectId}")
    public void deleteById(@PathVariable ("objectId") Long id) {
        service.deleteById(id);
    }
}
