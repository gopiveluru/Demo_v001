package com.thinkConstructive.Demo.repository;

import com.thinkConstructive.Demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{
}
