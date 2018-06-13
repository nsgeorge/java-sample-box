package jp.gr.javaconf.org.nsgeorge.guicewebapicommandset.repository.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import jp.gr.javaconf.org.nsgeorge.guicewebapicommandset.entity.Person;

public interface PersonMapper
{

    @Select("SELECT * from person WHERE id = #{id}")
    Person findOne(@Param("id") Integer id);


    @Insert("INSERT into person(id, name) VALUES(#{id}, #{name})")
    void add(Person person);

    @Delete("DELETE FROM person WHERE id = #{id}")
    void remove(@Param("id") Integer id);

}