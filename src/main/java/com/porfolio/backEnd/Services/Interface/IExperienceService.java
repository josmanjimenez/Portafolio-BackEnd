package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.Experience;


import java.util.List;
import java.util.Optional;

public interface IExperienceService {

    public Optional<Experience> ShowExperience (Long id);
    public List<Experience> ShowExperiences ();
    public void createExperience(Experience Us);
    public void deleteExperience(Long id );
    public Optional<Experience> findExperience(Long id );

}


