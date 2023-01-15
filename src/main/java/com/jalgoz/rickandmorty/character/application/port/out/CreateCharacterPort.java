package com.jalgoz.rickandmorty.character.application.port.out;

import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;

public interface CreateCharacterPort {
  Character save(Character character);
}
