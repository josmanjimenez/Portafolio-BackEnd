package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.Project;
import com.porfolio.backEnd.Repository.ProjectRepository;
import com.porfolio.backEnd.Services.Interface.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProjectService implements IProjectService {
    @Autowired
    public ProjectRepository proRepo;

    @Override
    public List<Project> ShowProjects() {
        return proRepo.findAll();
    }

    @Override
    public Optional<Project> ShowProject( Long id ) {
        return proRepo.findById(id);
    }

    @Override
    public void createProject(Project pjt) {
        proRepo.save(pjt);
    }

    @Override
    public void deleteProject(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Optional<Project> findProject(Long id) {
        return proRepo.findById(id);
    }
}
