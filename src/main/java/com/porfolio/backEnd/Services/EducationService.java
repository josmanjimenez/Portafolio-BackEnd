package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.Education;
import com.porfolio.backEnd.Repository.EducationRepository;
import com.porfolio.backEnd.Services.Interface.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationService implements IEducationService {
    @Autowired
    public EducationRepository eduRepo;

    public  Long id_created;
    @Override
    public List<Education> ShowEducations() {
        return eduRepo.findAll();
    }

    @Override
    public Optional<Education> ShowEducation(Long id) {
        return eduRepo.findById(id);
    }

    @Override
    public void createEducation(Education ed) {
        eduRepo.save(ed);
        insertId(ed.getId_education());

    }
    public Long insertId(Long ed) {
        return id_created= ed;
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Optional<Education> findEducation(Long id) {
        return eduRepo.findById(id);
    }

    @Override
    public Long showId() {
        return  id_created;
    }
}
