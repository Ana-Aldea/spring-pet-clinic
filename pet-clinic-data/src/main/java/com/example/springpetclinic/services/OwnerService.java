package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Owner;
import org.springframework.context.annotation.Profile;

@Profile({"default", "map"})
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
