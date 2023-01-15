package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.Experience;
import com.porfolio.backEnd.Repository.ExperienceRepository;
import com.porfolio.backEnd.Services.Interface.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService implements IExperienceService {
    @Autowired
    public ExperienceRepository expeRepo;


    @Override
    public Optional<Experience> ShowExperience(Long id) {
        return expeRepo.findById(id);
    }

    @Override
    public List<Experience> ShowExperiences() {
        return expeRepo.findAll();
    }

    @Override
    public void createExperience(Experience Us) {
         expeRepo.save(Us);
    }


    @Override
    public void deleteExperience(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Optional<Experience> findExperience(Long id) {
        return expeRepo.findById(id);
    }
}
