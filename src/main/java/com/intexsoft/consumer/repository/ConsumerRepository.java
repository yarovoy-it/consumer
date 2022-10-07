package com.intexsoft.consumer.repository;

import com.intexsoft.consumer.entity.Consumer;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Repository for {@link Consumer} entity.
 */
@Repository
public interface ConsumerRepository extends CrudRepository<Consumer, Integer> {
    /**
     * Method return mean of numbers for last 5 minutes
     * @param timePeriod int second
     * @return Optional<BigDecimal> of average
     */
    //SELECT AVG(Accept_value) from Consumer where -CAST(DATEDIFF('SECOND',now(),add_time) AS BIGINT) < 300
    @Query(value = "SELECT avg(accept_value) from Consumer WHERE -CAST(DATEDIFF('SECOND',now(),add_time) AS BIGINT) < :timePeriod")
    Optional<BigDecimal> mean(int timePeriod);
}
