/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj.controllers;

import com.proj.beans.HeadMasterBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author highl
 */
@Controller
public class ControllerHeadMaster {
    
    
    @RequestMapping("/headmaster")    
    public String showform(Model m){    
        m.addAttribute("command", new HeadMasterBean());  
        return "empform";   
    }    

    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("command") HeadMasterBean hmb){    
//        dao.save(emp);    
        return "redirect:/viewemp";//will redirect to viewemp request mapping    
    }    
    
        /* It provides list of employees in model object */    
    @RequestMapping("/viewemp")    
    public String viewemp(Model m){    
//        List<Emp> list=dao.getEmployees();    
//        m.addAttribute("list",list);  
        return "viewemp";    
    }    
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/    
    @RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable int id, Model m){    
//        Emp emp=dao.getEmpById(id);    
//        m.addAttribute("command",emp);  
        return "empeditform";    
    }    
    /* It updates model object. */    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") HeadMasterBean hmb){    
//        dao.update(emp);    
        return "redirect:/viewemp";    
    }    
    /* It deletes record for the given id in URL and redirects to /viewemp */    
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
//        dao.delete(id);    
        return "redirect:/viewemp";    
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
