import './style.css'
import logo from './logo.png'
import { saluer } from './salutation.js'

const titre = document.createElement('h1')
titre.textContent = saluer('webpack')
document.body.append(titre)

const image = new Image()
image.src = logo
image.alt = 'Logo'
document.body.append(image)