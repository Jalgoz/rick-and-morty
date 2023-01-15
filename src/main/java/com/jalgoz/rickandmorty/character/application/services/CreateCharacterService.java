package com.jalgoz.rickandmorty.character.application.services;

import com.jalgoz.rickandmorty.character.application.port.in.CreateCharacterUseCase;
import com.jalgoz.rickandmorty.character.application.port.out.CreateCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCharacterService implements CreateCharacterUseCase {

  private final CreateCharacterPort createCharacterPort;

  @Override
  public Character createCharacter(Character character) {
    return createCharacterPort.save(character);
  }
}
