import './style.css'
import logo from './logo.png'
import { saluer } from './salutation.js'
import { Compteur } from './compteur.js'

const titre = document.createElement('h1')
titre.textContent = saluer('webpack')
document.body.append(titre)

const image = new Image()
image.src = logo
image.alt = 'Logo'
document.body.append(image)

const compteur = new Compteur()
const bouton = document.createElement('button')
bouton.textContent = 'Clics : 0'
bouton.addEventListener('click', () => {
  bouton.textContent = `Clics : ${compteur.incrementer()}`
})
document.body.append(bouton)
