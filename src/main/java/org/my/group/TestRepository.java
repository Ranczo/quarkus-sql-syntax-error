package org.my.group;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestRepository implements PanacheRepository<Test> {
}
