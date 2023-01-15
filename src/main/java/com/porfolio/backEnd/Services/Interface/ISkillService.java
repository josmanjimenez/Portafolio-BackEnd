package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.Skill;

import java.util.List;
import java.util.Optional;

public interface ISkillService {
    public List<Skill> ShowSkills ();
    public Optional<Skill> ShowSkill(Long id);
    public void createSkill(Skill skl);
    public void deleteSkill(Long id );
    public Optional<Skill> findSkill(Long id );
}
