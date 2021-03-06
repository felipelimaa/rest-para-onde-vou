package com.paraondevou.paraondevou.repository

import com.paraondevou.paraondevou.entity.Percurso
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PercursoRepository extends PagingAndSortingRepository<Percurso, Long> {

}