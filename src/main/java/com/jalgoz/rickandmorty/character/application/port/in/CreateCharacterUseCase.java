package com.jalgoz.rickandmorty.character.application.port.in;

import com.jalgoz.rickandmorty.character.domain.Character;

public interface CreateCharacterUseCase {
  void create(Character character);
}
