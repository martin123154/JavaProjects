
Projekt Spring + Hibernate

    CRUD + Relacja (co najmniej jeden do wielu)
    Korzystamy z @Before oraz @After, jeśli mają zastosowanie.
    Test usuwania powinien sprawdzać, czy faktycznie usunęliśmy ten rekord o jaki nam chodziło (sprawdźmy czy uda nam się go pobrać po usunięciu)
    Przy teście usuwania powinniśmy sprawdzić sytuację, gdy baza zawiera więcej niż jeden rekord na początku. Należałoby sprawdzić także, czy nie skasowaliśmy innych rekordów przy okazji.
    Powinna być metoda pobierania rekordu po ID.
    Przy modyfikacji, powinniśmy sprawdzić, czy faktycznie zmieniono ten konkretny rekord, a pozostałe pozostały bez zmian.
    przed i po uruchomieniu testów stan bazy danych powinien pozostać bez zmian (a przynajmniej nie powinny zostać ruszone dane w niej znajdujące się)
        baza danych przed uruchomieniem testów może zawierać jakieś dane (nieokreślone jakie i ile). 
    Testy powinny działać w sytuacji, gdy ustawimy "defaultRollback = true" oraz gdy "defaultRollback = false". Nie stosujemy czyszczenia całej bazy danych za pomocą czegoś podobnego do "DELETE FROM tabela" (albo szukania elementu który dodajemy i kasowania go przed dodaniem).
    Wyszukiwanie w bazie po czymś znaczącym (np kolor, albo co tam masz w bazie). (co najmniej szukanie frazy. Wersja ambitna to szukanie wyrażenia regularnego)
    Testy wyszukiwania wszystkich X będących w Y
    W zależności od tego, czy pozwalasz na nieprzypisane rekordy, to usuwanie rekordów wraz z zależnościami, albo nie.
    Zwracaj uwagę na sensowność testów - powinny działać dla pustej bazy danych oraz dla bazy zawierającej już jakieś (nieokreśloną liczbę) rekordy. 
