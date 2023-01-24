package com.jalgoz.rickandmorty.character.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SpringDataCharacterRepository extends JpaRepository<CharacterJpaEntity, Long> {
}
