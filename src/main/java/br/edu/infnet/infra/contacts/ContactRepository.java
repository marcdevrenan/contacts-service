package br.edu.infnet.infra.contacts;

import br.edu.infnet.domain.contacts.Contact;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ContactRepository {

    private HashMap<Integer, Contact> contacts;

    public ContactRepository() {
        contacts = new HashMap<>();
        contacts.put(1, new Contact(1, "Renan F Marcilio", "renan.marcilio@test.com", "01010101"));
        contacts.put(2, new Contact(2, "Ingrid Nogueira", "ingrid.nogueira@test.com", "10101010"));
        contacts.put(3, new Contact(3, "Aline Silveira de Souza", "aline.souza@test.com", "00110011"));
    }

    public Collection<Contact> list() {
        return this.contacts.values();
    }

    public Contact getContact(int id) {
        return contacts.get(id);
    }
}