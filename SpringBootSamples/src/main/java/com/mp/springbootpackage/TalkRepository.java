package com.mp.springbootpackage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TalkRepository extends JpaRepository<Talk, String> {

}
