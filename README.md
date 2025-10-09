# Gra-RPG
Opis projektu gry RPG

Struktura projektu (7 plików .java)

1. Attackable.java - Interfejs definiujący możliwość atakowania
2. Character.java - Główna klasa bazowa dla wszystkich postaci
3. Warrior.java - Klasa specjalizująca się w walce wręcz
4. Mage.java - Klasa specjalizująca się w magii
5. Archer.java - Klasa specjalizująca się w walce dystansowej
6. BattleSimulator.java - Klasa zarządzająca mechaniką walki
7. Game.java - Główna klasa uruchamiająca program

---

Ogólny opis gry

Gra to symulator walki pomiędzy postaciami różnych klas RPG. Program tworzy kilka postaci, które następnie toczą ze sobą walkę wykorzystując charakterystyczne dla siebie ataki i statystyki. Ataki głównej postaci są decydowanie przez gracza.

---

Szczegółowy opis komponentów

Interfejs Attackable

Definiuje podstawową zdolność do atakowania innych postaci. Zawiera metodę umożliwiającą wykonanie ataku na wybrany cel. Wszystkie klasy bojowe muszą implementować ten interfejs.

Klasa bazowa Character

Stanowi fundament dla wszystkich postaci w grze. Zawiera:

· Podstawowe informacje: imię, poziom doświadczenia
· Statystyki: punkty zdrowia (HP)
· Wspólne funkcjonalności wyświetlania informacji o postaci

Klasy specjalistyczne

Warrior - specjalista walki wręcz:

· Najwyższe punkty zdrowia
· Ataki fizyczne o umiarkowanej sile

Mage - użytkownik magii:

· Najniższe punkty zdrowia
· Najsilniejsze ataki magiczne

Archer - strzelec dystansowy:

· Zrównoważone statystyki
· Ataki na odległość

System walki

BattleSimulator odpowiada za:

· Koordynowanie przebiegu potyczek
· Obsługę kolejności ataków
· Sprawdzanie warunków zwycięstwa

Game - główna klasa programu:

· Tworzy instancje postaci
· Inicjuje symulację walki
· Wyświetla wyniki potyczek

---

Wykorzystane mechanizmy programowania obiektowego:

Dziedziczenie - Klasy Warrior, Mage i Archer dziedziczą wspólne cechy z klasy Character, jednocześnie rozszerzając ją o swoje specjalizacje.

Interfejsy - Wszystkie klasy bojowe implementują interfejs Attackable, gwarantując, że każda postać może atakować.

Polimorfizm - Możliwość traktowania wszystkich postaci jako ogólnego typu Character, podczas gdy każda wykonuje atak na swój unikalny sposób.

Enkapsulacja - Ukrywanie wewnętrznych mechanizmów klas przed użytkownikiem, udostępniając tylko niezbędne metody.

---

Przebieg rozgrywki

1. Inicjalizacja - Program tworzy postacie różnych klas
2. Prezentacja - Wyświetlenie statystyk początkowych
3. Walka - Wrogie postacie i gracz na przemian wykonują ataki
4. Rezultaty - Po każdej akcji wyświetlane są aktualne statystyki
5. Zakończenie - Gra kończy się po określonej liczbie rund lub gdy zdrowie którejś postaci spadnie do zera

