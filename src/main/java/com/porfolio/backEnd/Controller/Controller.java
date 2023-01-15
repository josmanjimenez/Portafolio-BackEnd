package com.porfolio.backEnd.Controller;


import com.porfolio.backEnd.DTO.*;
import com.porfolio.backEnd.Model.*;
import com.porfolio.backEnd.Services.Interface.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    @Autowired
   public IUserService usService;
    @Autowired
    public IExperienceService expService;
    @Autowired
    public IEducationService eduService;
    @Autowired
    public IProjectService proService;
    @Autowired
    public ISkillService sklService;
    @Autowired
    public IAddressService addrService;





    /////@prueba////
    @GetMapping("/porfolio/userData/{id}")
    @ResponseBody
    public List<Object> getData(@PathVariable Long id){
        List<Object> dta=new ArrayList<Object>();
        dta.add(usService.ShowUser(id));
        dta.add(expService.ShowExperience(id));
        dta.add(eduService.ShowEducation(id));
        dta.add(proService.ShowProject(id));
        dta.add(addrService.ShowAddress(id));
        dta.add(sklService.ShowSkill(id));
        return dta;
    }


      ////////user///////

    @PostMapping("/new/user")
    public void postUser(@RequestBody User us){
        usService.createUser(us);
    }

    @PostMapping("/updateUser/{id}")
    public void updateUser( @PathVariable Long id,@RequestBody DtoUpdateUser update){
        User user =usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());
        user.setImage_user(update.getImage_user());
        user.setDescription_user(update.getDescription_user());
        user.setName_user(update.getName_user());
        user.setLastName_user(update.getLastName_user());
        user.setEmail(update.getEmail());
        user.setLast_profession(update.getLast_profession());
        user.setTrade_profession(update.getTrade_profession());
        user.setPhone_number(update.getPhone_number());
        user.setUser_password(update.getUser_password());
        usService.createUser(user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable Long id){
        usService.deleteUser(id);
    }

    @GetMapping("/find/user/{id}")
    @ResponseBody
    public Optional<User> findUser(@PathVariable Long id){
        return  usService.ShowUser(id);
    }

    @GetMapping("/find/users")
    @ResponseBody
    public List<User> findUsers(){
        return  usService.ShowUsers();
    }



    ////////education///////


   @PostMapping("/new/education/{id}")
   public void postEducation(@PathVariable Long id ,@RequestBody Education ed){
    User user = usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());;

        Education edu2= new Education();
        edu2.setTitle(ed.getTitle());
        edu2.setInstitution(ed.getInstitution());
        edu2.setImage_education(ed.getImage_education());
        edu2.setFinish(ed.getFinish());
        edu2.setStart_date_education(ed.getStart_date_education());
        edu2.setEnding_date_education(ed.getEnding_date_education());
        edu2.setFinish(ed.getFinish());
        edu2.setUser(user);

        eduService.createEducation(edu2);

    }

        @PostMapping("/updateEducation/{id}")
         public void updateEducation( @PathVariable Long id,@RequestBody DtoUpdateEducation update){
        Education education =eduService.findEducation(id).orElseThrow(() -> new EntityNotFoundException());
        education.setInstitution(update.getInstitution());
        education.setTitle(update.getTitle());
        education.setImage_education(update.getImage_education());
        education.setStart_date_education(update.getStart_date_education());
        education.setEnding_date_education(update.getEnding_date_education());
        education.setFinish(update.getFinish());

        eduService.createEducation(education);

    }



    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduService.deleteEducation(id);
    }

    @GetMapping("/find/education/{id}")
    @ResponseBody
    public Optional<Education> findEducation(@PathVariable Long id){
        return  eduService.findEducation(id);
    }

    @GetMapping("/find/educations")
    @ResponseBody
    public List<Education> findEducation(){
        return  eduService.ShowEducations();
    }

    ////////experience///////

    @PostMapping("/new/experience/{id}")
    public void postExperience(@PathVariable Long id ,@RequestBody Experience ex){
        User user = usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());

        Experience ex2= new Experience();
        ex2.setId_experience(ex.getId_experience());
        ex2.setCompany_name(ex.getCompany_name());
        ex2.setPosition(ex.getPosition());
        ex2.setImage_logo(ex.getImage_logo());
        ex2.setStart_date_experience(ex.getStart_date_experience());
        ex2.setEnding_date_experience(ex.getEnding_date_experience());
        ex2.setDescription_experience(ex.getDescription_experience());
        ex2.setUser(user);

        expService.createExperience(ex2);

    }

    @PostMapping("/updateExperience/{id}")
    public void updateExperience( @PathVariable Long id ,@RequestBody DtoUpdateExperience update){
        Experience experience =expService.findExperience(id).orElseThrow(() -> new EntityNotFoundException());
        experience.setCompany_name(update.getCompany_name());
        experience.setPosition(update.getPosition());
        experience.setImage_logo(update.getImage_logo());
        experience.setStart_date_experience(update.getStart_date_experience());
        experience.setEnding_date_experience(update.getEnding_date_experience());
        experience.setDescription_experience(update.getDescription_experience());

        expService.createExperience(experience);

    }

    @DeleteMapping("/delete/experience/{id}")
    public void deleteExperience(@PathVariable Long id){
        expService.deleteExperience(id);
    }

    @GetMapping("/find/experience/{id}")
    @ResponseBody
    public Optional<Experience> findExperience(@PathVariable Long id){
        return expService.findExperience(id);
    }

    @GetMapping("/find/experiences")
    @ResponseBody
    public List<Experience> findExperience(){
        return  expService.ShowExperiences();
    }


    ////////project///////


    @PostMapping("/new/project/{id}")
    public void postProject(@PathVariable Long id ,@RequestBody Project pr){
        User user = usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());


        Project pr2= new Project();
        pr2.setId_project(pr.getId_project());
        pr2.setName_project(pr.getName_project());
        pr2.setImage_project(pr.getImage_project());
        pr2.setDescription_project(pr.getDescription_project());
        pr2.setUrl_project(pr.getUrl_project());
        pr2.setUser(user);

       proService.createProject(pr2);

    }


    @PostMapping("/updateProject/{id}")
    public void updateProject (@PathVariable Long id,@RequestBody DtoUpdateProject update){
        Project project =proService.findProject(id).orElseThrow(() -> new EntityNotFoundException());
        project.setName_project(update.getName_project());
        project.setImage_project(update.getImage_project());
        project.setDescription_project(update.getDescription_project());
        project.setUrl_project(update.getUrl_project());

        proService.createProject(project);

    }


        @DeleteMapping("/delete/project/{id}")
    public void deleteProject (@PathVariable Long id){
        proService.deleteProject(id);
    }

    @GetMapping("/find/project/{id}")
    @ResponseBody
    public Optional<Project > findProject (@PathVariable Long id){
        return proService.findProject(id);
    }

    @GetMapping("/find/projects")
    @ResponseBody
    public List<Project > findProjects (){
        return proService.ShowProjects();
    }


    ////////skill///////


    @PostMapping("/new/skill/{id}")
    public void postSkill(@PathVariable Long id ,@RequestBody Skill sk){
        User user = usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());


        Skill sk2= new Skill();
        sk2.setId_skill(sk.getId_skill());
        sk2.setSkill_name(sk.getSkill_name());
        sk2.setDomain_skill(sk.getDomain_skill());
        sk2.setColor_skill(sk.getColor_skill());

        sk2.setUser(user);

        sklService.createSkill(sk2);

    }

    @PostMapping("/updateSkill/{id}")
    public void updateSkill (@PathVariable Long id,@RequestBody DtoUpdateSkill update){
        Skill skill =sklService.findSkill(id).orElseThrow(() -> new EntityNotFoundException());
        skill.setSkill_name(update.getSkill_name());
        skill.setDomain_skill(update.getDomain_skill());
        skill.setColor_skill(update.getColor_skill());

        sklService.createSkill(skill);

    }


    @DeleteMapping("/delete/skill/{id}")
    public void deleteSkill (@PathVariable Long id){
        sklService.deleteSkill(id);
    }

    @GetMapping("/find/skill/{id}")
    @ResponseBody
    public Optional<Skill> findSkill (@PathVariable Long id){
        return sklService.ShowSkill(id);
    }

    @GetMapping("/find/skills")
    @ResponseBody
    public List<Skill > findSkills (){
        return sklService.ShowSkills();
    }

    ////////address///////


    @PostMapping("/new/address/{id}")
    public void postAddress(@PathVariable Long id ,@RequestBody Address add){
        User user = usService.findUser(id).orElseThrow(() -> new EntityNotFoundException());



       Address add2= new Address();
        add2.setId_addres(add.getId_addres());
        add2.setContry(add.getContry());
        add2.setCity(add.getCity());
        add2.setLocation(add.getLocation());

        add2.setUser(user);

        addrService.createAddress(add2);

    }

    @PostMapping("/updateAddress/{id}")
    public void updateAddress (@PathVariable Long id,@RequestBody DtoUpdateAddress update){
        Address add =addrService.findAddress(id).orElseThrow(() -> new EntityNotFoundException());
        add.setContry(update.getContry());
        add.setCity(update.getCity());
        add.setLocation(update.getLocation());

        addrService.createAddress(add);

    }


    @DeleteMapping("/delete/address/{id}")
    @ResponseBody
    public void deleteAddress (@PathVariable Long id){
        addrService.deleteAddress(id);
    }

    @GetMapping("/find/address/{id}")
    @ResponseBody
    public Optional<Address> findAddress (@PathVariable Long id){

        return addrService.ShowAddress(id);
    }

    @GetMapping("/find/addresses")
    @ResponseBody
    public List<Address > findAddress (){
        return addrService.ShowAddresses();
    }

    ///////prueba///////

}
