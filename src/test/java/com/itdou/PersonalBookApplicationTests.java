package com.itdou;

import com.itdou.domain.Person;
import com.itdou.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PersonalBookApplicationTests {

    @Autowired
    private PersonService personService;

    @Test
    void testGetAll() {
        List<Person> all = personService.getAll();
        System.out.println(all);
    }
    @Test
    void testUpdate() {
        Person person=new Person();
        person.setId(3);
        person.setName("王五");
        person.setAddress("攀枝花东区");
        person.setPhone("133");
        personService.update(person);
    }
}
