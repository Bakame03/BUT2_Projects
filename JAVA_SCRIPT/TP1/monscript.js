document.addEventListener('DOMContentLoaded', function (event) {
    const tocContainer = document.querySelector('#toc');
    const titres = document.querySelectorAll('h1');

    if (tocContainer && titres.length > 0) {
        const liste = document.createElement('ul');

        for (var i = 0; i < titres.length; i++) {
            const titre = titres[i];

            if (!titre.id) {
                titre.id = 'titre-' + i;
            }

            const puce = document.createElement('li');
            const lien = document.createElement('a');

            lien.href = '#' + titre.id;
            lien.textContent = titre.textContent;

            puce.appendChild(lien);
            liste.appendChild(puce);
        }
        tocContainer.appendChild(liste);
    }
});

document.addEventListener('DOMContentLoaded', function (event) {
    // 1. On cherche TOUS les conteneurs de sommaire de la page
    const tocContainers = document.querySelectorAll('[data-depth]');

    // 2. On boucle sur chaque conteneur trouvé
    for (var i = 0; i < tocContainers.length; i++) {
        const container = tocContainers[i];

        // 3. Récupération des paramètres via le dataset du cours
        const maxDepth = parseInt(container.dataset.depth, 10) || 1;
        
        // 4. Construction dynamique du sélecteur de titres
        var selectorArray = [];
        for (var d = 1; d <= maxDepth; d++) {
            selectorArray.push('h' + d);
        }
        const selector = selectorArray.join(', '); // Exemple : "h1, h2"

        // 5. Sélection des titres correspondants à la profondeur
        const titres = document.querySelectorAll(selector);

        if (titres.length > 0) {
            const liste = document.createElement('ul');

            for (var j = 0; j < titres.length; j++) {
                const titre = titres[j];

                // Génération d'un identifiant unique global
                if (!titre.id) {
                    titre.id = 'titre-' + i + '-' + j;
                }

                const puce = document.createElement('li');
                const lien = document.createElement('a');

                lien.href = '#' + titre.id;
                lien.textContent = titre.textContent;

                // Optionnel : adapter le style visuel selon le niveau du titre (h1, h2, h3)
                puce.className = 'toc-' + titre.tagName.toLowerCase();

                puce.appendChild(lien);
                liste.appendChild(puce);
            }
            container.appendChild(liste);
        }
    }
});