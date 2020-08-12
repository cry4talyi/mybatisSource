package com.ywb.manydatasource.mappertwo;

import com.ywb.manydatasource.entiry.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonMapperTwo {
    @Select("select * from person")
    List<Person> queryPerson();
}
