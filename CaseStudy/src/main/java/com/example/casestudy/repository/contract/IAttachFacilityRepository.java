package com.example.casestudy.repository.contract;

import com.example.casestudy.model.contract.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IAttachFacilityRepository extends JpaRepository<AttachFacility, Integer> {
    @Query(value = "select * from attach_facility af " +
            " JOIN contract_detail cd on af.attach_facility_id = cd.attach_facility_id " +
            " JOIN contract c ON cd.contract_id = c.contract_id" +
            " WHERE c.contract_id = :id ",
            countQuery = "select count(*) from attach_facility af " +
                    " JOIN contract_detail cd on af.attach_facility_id = cd.attach_facility_id " +
                    " JOIN contract c ON cd.contract_id = c.contract_id " +
                    " WHERE c.contract_id = :id "
            , nativeQuery = true)
    List<AttachFacility> findAllAttach(@Param("id") int id);
}
