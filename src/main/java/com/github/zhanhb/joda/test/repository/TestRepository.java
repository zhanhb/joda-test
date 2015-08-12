package com.github.zhanhb.joda.test.repository;

import com.github.zhanhb.joda.test.domain.Test;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestRepository extends PagingAndSortingRepository<Test, Long> {

}
