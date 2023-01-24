package com.jalgoz.rickandmorty.character.adapter.out.persistence;

import com.jalgoz.rickandmorty.character.application.port.out.CreateCharacterPort;
import com.jalgoz.rickandmorty.character.application.port.out.LoadCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
class CharacterPersistenceAdapter implements CreateCharacterPort, LoadCharacterPort {

  private final SpringDataCharacterRepository repository;

  @Override
  public void save(Character character) {
    CharacterJpaEntity characterJpa = new CharacterJpaEntity();
    character.setId(BigInteger.ZERO.longValue());
    BeanUtils.copyProperties(character, characterJpa);
    repository.save(characterJpa);
  }

  @Override
  public List<Character> load() {
    List<CharacterJpaEntity> characterJpaEntities = repository.findAll();
    List<Character> characters = new ArrayList<>();

    characterJpaEntities.forEach( characterJpa -> {
      Character character = new Character();
      BeanUtils.copyProperties(characterJpa, character);
      characters.add(character);
    });

    return characters;
  }
}
