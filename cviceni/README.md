# Cvičení

Každá složka obsahuje projekt pro Netbeans, který je potřeba upravit podle zadání. 

## 01-trida

Ke třídě `TridaA` vytvořte ještě třídu `TridaB`.

Ve třídě TridaA, v metodě `main` vytvořte objekt z třídy TridaB, uložte ho do nové proměnné `b` (typu TridaB) a pak objekt proměnné `b` vypište pomocí `System.out.println()`.

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

## 06-viditelnost-baliky

Ve třídě `Aplikace` v balíku `obchod` je metoda `main`. V ní vytvořte nové objekty pro třídy, které jsou v balíku `placeni`:

* `Pokladna`
* `PokladniTerminal` - tu je potřeba přidat `public` před slovo `class`

Tyto třídy jsou v jiném balíku, proto je potřeba je importovat.

----

Uložte vytvořený terminál do proměnné `terminal` ve vytvořeném objektu pokladny. proměnná `terminal` musí být `public` aby bylo možné k ní přistupovat z třídy `Aplikace`.

Vytvořte nový balík `zamestnanci` a v něm třídu `Pokladni`. Ve třídě `placeni.Pokladna` vytvořte proměnnou `Pokladni pokladniNaPokladne`. Bude znovu potřeba importovat `Pokladni`. Třída `Pokladni` musí být `public`.

V souboru `Aplikace.java` vytvořte pod třídu `Aplikace` ještě jednu třídu `Vypocty`. Tato třída nemůže už být `public`. 

Ve třídě `Vypocty` vytvořte metodu `int mocnina(int cislo)`, která vrátí mocniny čísla `cislo`. Tedy obsahuje `return cislo * cislo`). Zavolejte tuto metodu z metody `main` - metoda `mocnina` musí být static.

## 07-priklady-vyjimek

Ve třídě `Aplikace` najdete příklady příkazů, které vyvolají výjinky.

Pomocí **try catch** bloku kolem každého volání, které způsobuje výjimku, zachyťte a vypište její správu z její metody `e.getMessage()`.

## 08-scanner

Ve třídě `Aplikace` najdete příklad načtení vstupu a jeho opětovného vypsání.

---

Přidejte další příkaz pro načtení řádku. Výsledek změňte na typ `int` pomocí metody `Integer.parseInt(line)`. Výsledek vypište.

Dalším příkazem načtěte číslo přímo pomocí `Scanner.nextInt()`.
Výsledek vypište.


## 09-hadaci-hra

Toto je ukázka skoro všeho, co jsme se na kurzu naučili.

Je to hádací hra, kde hráč musí uhodnout náhodné číslo od 1 do 10. Do konzole napíše číslo, a pokud je číslo správně, hra končí. Pokud ne, hra vypíše, jestli je číslo větší nebo menší a hráč hádá dále. Pokud hráč místo čísla napíše text "konec", hra se ukončí ihned i bez uhodnutí čísla.

----

Nejprve se podvejte na výsledek cvičení a zkuste aplikaci spustit.

Můžete si aplikaci napsat sami. V adresáři `cviceni/09-hadaci-hra` je připraven projekt, který obsahuje základ aplikace. Ten můžete doplnit. 