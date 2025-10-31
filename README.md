# Gra-RPG
[Opis do aktualizacji bo koncepcja się zmieniła]
Opis projektu

Projekt to konsolowa gra RPG inspirowana Elden Ring, w której gracz tworzy swoją postać, wybiera jedną z czterech klas i walczy z przeciwnikami w systemie turowym.
Gra wykorzystuje zasady programowania obiektowego — dziedziczenie, interfejsy i polimorfizm — do zarządzania logiką postaci, walki i przedmiotów.

Struktura projektu (14 plików .java)
Klasy postaci:

Astrologer.java – klasa reprezentująca maga, używa ataków magicznych kosztem energii.

Bandit.java – szybka postać z wysoką zręcznością.

Samurai.java – zbalansowany wojownik.

Warrior.java – silna i wytrzymała postać o dużej sile fizycznej.

Wszystkie klasy postaci dziedziczą po klasie Character i implementują interfejs Attackable.


--------


Klasy pomocnicze i systemowe:

Character.java – klasa bazowa zawierająca wspólne pola i metody dla wszystkich postaci (imię postaci, zdrowie, energia, siła, zręczność, inteligencja).

Enemy.java – klasa przeciwnika, posiada punkty życia i może być atakowana przez gracza.

Interface.java / Attackable.java – interfejs definiujący możliwość atakowania (normalAttack, superAttack, ultimate).

Main.java – główna klasa programu, zawiera logikę gry: wybór klasy postaci, pętlę walki, obsługę akcji gracza i regenerację energii.

--------

Przedmioty i ulepszenia:

Item.java – klasa bazowa dla wszystkich przedmiotów.

HealingPotion.java – przywraca punkty zdrowia gracza.

PoisonPotion.java – może zatruć przeciwnika.

StrengthPotion.java – tymczasowo zwiększa siłę postaci.

HealthAmulet.java – zwiększa maksymalne zdrowie postaci.

StrengthAmulet.java – zwiększa siłę fizyczną postaci.

--------

Opis rozgrywki

Tworzenie postaci
Gracz podaje imię i wybiera jedną z czterech klas (Astrologer, Bandit, Samurai, Warrior).

Prezentacja statystyk
Po wyborze klasy wyświetlane są statystyki bohatera: zdrowie, siła, zręczność, inteligencja, energia.

Walka
Gracz walczy z pierwszym bossem (boss jest losowany losowa z 4 klas postaci np. boss Bandit).
Walka przebiega w turach. W każdej turze gracz może wybrać jedną z akcji:

normalny atak

super atak (koszt energii -10)

użycie mikstury leczenia

ult (koszt energii -20)

Regeneracja energii
Po każdej turze, jeśli energia jest mniejsza niż 100, postać odzyskuje +5 punktów energii.

Zakończenie walki
Gra kończy się, gdy zdrowie gracza spadnie do 0 lub gdy gracz zdecyduje się przestać grać.
Wyświetlane są wyniki oraz statystyki końcowe (ile pokonał wrogów).

--------

Mechanika i zasady

System energii – energia jest zużywana przy silnych atakach i regeneruje się automatycznie w każdej turze.

System przedmiotów – klasy postaci mogą korzystać z mikstur lub amuletów zwiększających statystyki.

Pętla walki – działa dopóki gracz ma więcej niż 0 HP i gdy gra nie zostałą przerwana.

--------

Wykorzystane mechanizmy OOP

Dziedziczenie – klasy postaci dziedziczą wspólne właściwości i metody z klasy Character.

Polimorfizm – zmienna typu Character może przechowywać dowolną klasę postaci (np. Samurai, Bandit), a każda klasa wykonuje własną wersję metod attack().

Interfejs – Attackable wymusza na każdej klasie implementację metod ataku.

