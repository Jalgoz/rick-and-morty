package com.jalgoz.rickandmorty.character.application.port.out;

import com.jalgoz.rickandmorty.character.domain.Character;

import java.util.List;

public interface LoadCharacterPort {
  List<Character> load();
}
