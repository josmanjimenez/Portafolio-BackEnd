package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.Skill;
import com.porfolio.backEnd.Repository.SkillRepository;
import com.porfolio.backEnd.Services.Interface.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService  implements ISkillService {
    @Autowired
    public SkillRepository skl;
    @Override
    public List<Skill> ShowSkills() {
        return skl.findAll();
    }

    @Override
    public Optional<Skill> ShowSkill(Long id) {
        return skl.findById(id);
    }

    @Override
    public void createSkill(Skill sk) {
        skl.save(sk);
    }

    @Override
    public void deleteSkill(Long id) {
        skl.deleteById(id);
    }

    @Override
    public Optional<Skill> findSkill(Long id) {
        return skl.findById(id);
    }
}
