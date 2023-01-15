package com.jalgoz.rickandmorty.character.adapter.out.persistence;

import com.jalgoz.rickandmorty.character.application.port.out.CreateCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
public class CharacterPersistenceAdapter implements CreateCharacterPort {

  private final SpringDataCharacterRepository repository;

  @Override
  public Character save(Character character) {
    return repository.save(character);
  }
}
