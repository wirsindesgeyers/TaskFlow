package service;

import model.project.Project;
import model.project.dto.ProjectRequestDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.ProjectRepository;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceTest {

    @InjectMocks
    private ProjectService projectService;

    @Mock
    private ProjectRepository projectRepository;

    private final Long existentProjectId = 1L;
    private final Long nonExistentProjectId = 999L;
    private Project existentProject;


    @BeforeEach
    void setUp() {
        existentProject = new Project(existentProjectId, "Test Project", "This is a test project.", null);
    }


    @Test
    @DisplayName("Should return project when found by id")
    void getById() {
        //arrange
        Mockito.when(projectRepository.findById(existentProjectId)).thenReturn(java.util.Optional.of(existentProject));
        //act
        Project foundProject = projectService.getById(existentProjectId);
        //assert
        assertNotNull(foundProject);
        assertEquals(existentProjectId, foundProject.getId());
        assertEquals("Test Project", foundProject.getTitle());
        //verify
        Mockito.verify(projectRepository, Mockito.times(1)).findById(existentProjectId);
    }
}