package com.jbb.dao;

import com.jbb.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 城市dao
 *
 * @author jbb
 * @date 2019/3/16
 */
public interface CityRepository extends JpaRepository<City,String>, JpaSpecificationExecutor<City> {
}
