# Cvičení

Každá složka obsahuje projekt pro Netbeans, který je potřeba upravit podle zadání. 

## 01-trida

Ke třídě `TridaA` vytvořte ještě třídu `TridaB`.

Ve třídě TridaA vytvořte main metodu pro spuštění programu. V ní vytvořte objekt z třídy TridaB, uložte ho do proměnné typu TridaB a pak objekt vypište pomocí `System.out.println()`.

## 02-relace-trid

Propojte existující třídy `Letadlo` a `Letiste`:

* `Letadlo` má proměnnou, která odkazuje na `Letiste`, ve kterém se letadlo nachází
* `Letiste` má proměnné
  * pole délky 10, které obsahuje objekty `Letadlo`
  * počet letadel, které jsou na letišti


## 03-konstruktor-metody

Pro třídu `Letiste` vytvor:
- proměnnou `nazev` pro textový název letiště
- konstruktor s parametrem typu String, který tento parametr uloží do proměnné `nazev`
- metodu `pridejLetadlo` s parametrem `Letadlo`, která uloží letadlo do pole `letadlo` na první volné místo v poli a zvýší hodnotu `pocetLetadel`

Pro třídu `Letadlo` vytvoř 

- konstruktor s parametrem `Letiste`, který
  - uloží letiště do proměnné `letiste`
  - zavolá ne letišti metodu `pridejLetadlo` s parametrem `this` - tedy na to letiště přidá sebe

## 04-prace-s-objekty

V třídě Aplikace máme metodu `main`, v které jsou vytvořeny 2 objekty `Letiste` a pole `vsechnaLetiste`, které je obsahuje.

Doplň `main` metodu:

- vytvoř letadlo s názvem "Letadlo z Prahy" a letištěm `letistePraha`
- vytvoř letadlo s názvem "Letadlo z Londýna" a letištěm `letisteLondyn`
- zavolej metodu `odletDo` na letadlo z Prahy s parametrem `letisteLondyn` (letadlo z Prahy poletí do Londýna) 
- zavolej metodu `odletDo` na druhé letadlo s parametrem `letistePraha` (letadlo z Londýna poletí do Prahy)
  - ve výsledku tedy jedno letadlo poletí z Prahy do Londýna a druhé z Londýna do Prahy
- použij cyklus `for` na pole vsechnaLetiste a pro každé letiste zavolej metodu `vypisLetadlaNaLetisti`, která vypíše informaci o letadlech, které jsou na daném letišti

## 05-trida-a-balik

Vytvořte nový balík (např. `balik1` ) a v něm jednu třídu (např. `TridaBalik1`).

Vytvořte vnořený balík (např. `balik1.balik2`) a v ňem jednu třídu (např. `TridaVnorenyBalik`)

Výsledná struktura bude např.:`

```
- balik1
  - TridaBalik1.java
  - balik2
    - TridaVnorenyBalik.java
- trida
  - TridaA.java
```
