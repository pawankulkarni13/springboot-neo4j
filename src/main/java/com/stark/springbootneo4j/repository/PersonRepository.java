package com.stark.springbootneo4j.repository;

import com.stark.springbootneo4j.domain.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    @Query("match (n:Person) where n.name=$name return n")
    Person findPersonByName(String name);
}
