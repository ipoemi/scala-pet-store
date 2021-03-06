package io.github.pauljamescleary.petstore.validation

import io.github.pauljamescleary.petstore.model.{Pet, User}

sealed trait ValidationError extends Product with Serializable
final case class PetAlreadyExistsError(pet: Pet) extends ValidationError
final case object PetNotFoundError extends ValidationError
final case object OrderNotFoundError extends ValidationError
final case object UserNotFoundError extends ValidationError
final case class UserAlreadyExistsError(user: User) extends ValidationError
