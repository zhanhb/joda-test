package com.github.zhanhb.joda.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import org.joda.time.DateTime;

@Data
@Entity
public class Test {

    @Id
    private Long id;

    private DateTime a;

}
