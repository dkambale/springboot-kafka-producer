package com.codingworld.springbootkafkaproducer.repo;

import com.codingworld.springbootkafkaproducer.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUD extends CrudRepository<User,Integer> {

}
