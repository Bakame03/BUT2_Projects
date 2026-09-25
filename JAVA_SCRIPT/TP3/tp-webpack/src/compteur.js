        export class Compteur {
  #valeur = 0

  incrementer () {
    this.#valeur += 1
    return this.#valeur
  }

  get valeur () {
    return this.#valeur
  }
}