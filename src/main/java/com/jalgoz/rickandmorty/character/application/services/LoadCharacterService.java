package com.jalgoz.rickandmorty.character.application.services;

import com.jalgoz.rickandmorty.character.application.port.in.LoadCharactersQuery;
import com.jalgoz.rickandmorty.character.application.port.out.LoadCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LoadCharacterService implements LoadCharactersQuery {

  private final LoadCharacterPort loadCharacterPort;

  @Override
  public List<Character> get() {
    return loadCharacterPort.load();
  }
}
