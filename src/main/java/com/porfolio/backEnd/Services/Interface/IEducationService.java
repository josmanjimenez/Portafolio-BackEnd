package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.Education;


import java.util.List;
import java.util.Optional;

public interface IEducationService {
    public List<Education> ShowEducations ();
    public Optional<Education> ShowEducation(Long id);
    public void createEducation(Education ed);
    public void deleteEducation(Long id );
    public Optional<Education> findEducation(Long id );
    public Long showId();
}
