package org.my.group;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name = "test")
public class Test extends PanacheEntity {
    @Column
    public OffsetDateTime from;
}
