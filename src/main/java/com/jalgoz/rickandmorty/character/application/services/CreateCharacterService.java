package com.jalgoz.rickandmorty.character.application.services;

import com.jalgoz.rickandmorty.character.application.port.in.CreateCharacterUseCase;
import com.jalgoz.rickandmorty.character.application.port.out.CreateCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCharacterService implements CreateCharacterUseCase {

  private final CreateCharacterPort createCharacterPort;

  @Override
  public void create(Character character) {
    createCharacterPort.save(character);
  }
}
