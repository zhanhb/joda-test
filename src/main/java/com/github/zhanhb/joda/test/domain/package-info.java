@org.hibernate.annotations.TypeDefs({
    @org.hibernate.annotations.TypeDef(name = "dateTimeType", typeClass = org.jadira.usertype.dateandtime.joda.PersistentDateTime.class, defaultForType = org.joda.time.DateTime.class)
})
package com.github.zhanhb.joda.test.domain;
