package com.jalgoz.rickandmorty.character.application.port.in;

import com.jalgoz.rickandmorty.character.domain.Character;

import java.util.List;

public interface LoadCharactersQuery {
  List<Character> get();
}
