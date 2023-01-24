package com.jalgoz.rickandmorty.character.adapter.out.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "character_animated")
@AllArgsConstructor
@NoArgsConstructor
class CharacterJpaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private short age;
  private String location;
  private String dimension;
  private float power;
}
