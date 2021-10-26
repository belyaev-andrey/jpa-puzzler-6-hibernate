package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.entities.PetType;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JpaPuzzler6AppHibernate {

    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("default")
                .createEntityManager();

        PetType petType = entityManager.find(PetType.class, 1L);
        System.out.println(petType);
    }

}