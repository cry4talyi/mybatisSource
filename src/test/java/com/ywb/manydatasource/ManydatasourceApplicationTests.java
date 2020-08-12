package com.ywb.manydatasource;

import com.ywb.manydatasource.entiry.Person;
import com.ywb.manydatasource.mapperone.PersonMapperOne;
import com.ywb.manydatasource.mappertwo.PersonMapperTwo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ManydatasourceApplicationTests {

    @Autowired
    private PersonMapperOne personMapperOne;
    @Autowired
    private PersonMapperTwo personMapperTwo;

    @Test
    void contextLoads() {
        List<Person> people = personMapperOne.queryPerson();
        System.out.println(1);
        List<Person> people1 = personMapperTwo.queryPerson();
        System.out.println(people);
        System.out.println(people1);
    }

}
