package cz.cvut.fit.adametim.bi_tjv.semester_project.api;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ObjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.business.AbstractCrudService;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/objects")
public final class ObjectController extends AbstractCrudController<Object, ObjectDto, Long> {
    public ObjectController(AbstractCrudService<Object, Long> service,
                            Function<Object, ObjectDto> toDtoConverter,
                            Function<ObjectDto, Object> toEntityConverter) {
        super(service, toDtoConverter, toEntityConverter);
    }
}
