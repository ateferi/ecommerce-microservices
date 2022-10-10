package com.amol.microservices.images.repository;

import com.amol.microservices.images.entity.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Abebe Lemma
 **/
public interface ImageRepository extends CrudRepository<Image,Long>{

    List<Image> findAll();
}
Footer
© 2022 GitHub, Inc.