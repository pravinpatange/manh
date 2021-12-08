package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.Contactservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private Contactservice contactservice;
    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId")Long userId){
    return this.contactservice.getcontactofuser(userId);
    }

}
