package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactserviceImpl implements Contactservice{



   List<Contact> list=List.of(
           new Contact(1L,"pravin@gmail.com","pravin",1311L),
           new Contact(2L,"kiran@gmail.com","pravin",1312L),
           new Contact(3L,"kin@gmail.com","pravin",1313L)

   );




    @Override
    public List<Contact> getcontactofuser(Long userId) {


        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
