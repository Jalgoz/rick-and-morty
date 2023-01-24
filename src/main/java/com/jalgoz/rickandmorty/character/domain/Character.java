package com.jalgoz.rickandmorty.character.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {

  private Long id;
  private String name;
  private short age;
  private String location;
  private String dimension;
  private float power;
}
