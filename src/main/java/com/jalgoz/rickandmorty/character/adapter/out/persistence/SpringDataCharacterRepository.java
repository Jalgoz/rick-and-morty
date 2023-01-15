package com.jalgoz.rickandmorty.character.adapter.out.persistence;

import com.jalgoz.rickandmorty.character.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SpringDataCharacterRepository extends JpaRepository<Character, Long> {
}
