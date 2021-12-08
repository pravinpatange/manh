package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface Contactservice {

    public List<Contact> getcontactofuser(Long userId);

}
