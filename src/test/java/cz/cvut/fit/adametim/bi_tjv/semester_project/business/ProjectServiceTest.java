package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ManagerRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ProjectRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@SpringBootTest
class ProjectServiceTest {

    @Autowired
    ProjectService projectService;

    @MockBean
    ManagerRepository managerRepository;

    @MockBean
    ProjectRepository projectRepository;

    @Test
    void takeOverProjectsOfColleagues() {
        Manager manager = new Manager(0L, "Tomas Kopecky", "775 368 397");

        Collection<Project> colleagueProjects = new ArrayList<>();
        colleagueProjects.add(
                new Project(0L, "DummyProject1", "Site1", Mockito.mock(Client.class))
        );
        colleagueProjects.add(
                new Project(1L, "DummyProject2", "Site2", Mockito.mock(Client.class))
        );

        Mockito.when(managerRepository.findById(manager.getId())).thenReturn(Optional.of(manager));
        Mockito.when(projectRepository.getColleagueProjects(manager)).thenReturn(colleagueProjects);

        projectService.takeOverProjectsOfColleagues(manager.getId());

        for (Project colleagueProject: colleagueProjects) {
            Assertions.assertEquals(colleagueProject.getCurrentManager(), manager);
        }
    }
}