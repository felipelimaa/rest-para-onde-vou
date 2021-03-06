package com.paraondevou.paraondevou.entity

import org.hibernate.validator.constraints.UniqueElements

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @Column(unique = true)
    String email
    String deviceToken
}
