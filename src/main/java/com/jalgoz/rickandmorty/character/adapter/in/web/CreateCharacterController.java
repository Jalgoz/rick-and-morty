package com.jalgoz.rickandmorty.character.adapter.in.web;

import com.jalgoz.rickandmorty.character.application.port.in.CreateCharacterUseCase;
import com.jalgoz.rickandmorty.character.domain.Character;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@AllArgsConstructor
class CreateCharacterController {

  private final CreateCharacterUseCase createCharacterUseCase;

  @PostMapping
  private void createCharacter(@RequestBody Character character) {
    createCharacterUseCase.create(character);
  }
}
