package com.jalgoz.rickandmorty.character.application.port.out;

import com.jalgoz.rickandmorty.character.domain.Character;

public interface CreateCharacterPort {
  void save(Character character);
}
