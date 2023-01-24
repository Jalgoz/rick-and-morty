package com.jalgoz.rickandmorty.character.adapter.in.web;

import com.jalgoz.rickandmorty.character.application.port.in.LoadCharactersQuery;
import com.jalgoz.rickandmorty.character.application.port.out.LoadCharacterPort;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characters")
@AllArgsConstructor
class LoadCharactersController {

  private final LoadCharactersQuery loadCharactersQuery;

  @GetMapping
  private List<Character> load() {
    return loadCharactersQuery.get();
  }
}
