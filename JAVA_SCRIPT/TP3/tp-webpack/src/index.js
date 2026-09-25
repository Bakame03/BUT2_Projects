import { saluer } from './salutation.js'

const titre = document.createElement('h1')
titre.textContent = saluer('webpack')
document.body.append(titre)