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
    public String save(@ModelAttribute("emp") HeadMasterBean hmb){    
//        dao.save(emp);    
        return "redirect:/viewemp";//will redirect to viewemp request mapping    
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
