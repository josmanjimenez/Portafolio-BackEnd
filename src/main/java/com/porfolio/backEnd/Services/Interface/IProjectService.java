package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.Project;

import java.util.List;
import java.util.Optional;

public interface IProjectService {

    public List<Project> ShowProjects ();
    public Optional<Project> ShowProject (Long id);
    public void createProject(Project pjt);
    public void deleteProject(Long id );
    public Optional<Project> findProject(Long id );

}
