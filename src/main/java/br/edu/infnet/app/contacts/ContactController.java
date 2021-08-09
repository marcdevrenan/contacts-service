package br.edu.infnet.app.contacts;

import br.edu.infnet.domain.contacts.Contact;
import br.edu.infnet.infra.contacts.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping({"/contacts"})
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping
    public Collection<Contact> listContacts() {
        return repository.list();
    }

    @GetMapping(path = {"/{id}"})
    public Contact getContactById(@PathVariable int id) {
        return repository.getContact(id);
    }
}