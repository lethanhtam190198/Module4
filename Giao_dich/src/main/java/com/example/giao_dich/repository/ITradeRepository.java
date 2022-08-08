package com.example.giao_dich.repository;

import com.example.giao_dich.model.Trade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ITradeRepository extends JpaRepository<Trade, Integer> {

    @Modifying
    @Query(value = "select * from trade where  trade like :name", nativeQuery = true)
    List<Trade> search(@Param("name") String name);

}
