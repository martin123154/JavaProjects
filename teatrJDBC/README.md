## Nazwa: Baza teatru (Technologia JDBC) 
# Opis: Tabele aktor i przedstawienie oraz tabela występ jako pośrednicząca w relacji n:m


     CRUD
    
    3 pola w jednej tabeli bazy danych.
    
    zaimplementowana relacja
    
    testy jednostkowe do istotnych części projektu (czyli CRUD, obsługa relacji)
    
        
    zabronione nazwy pól to (case insensitive):
    
        yob, nazwisko 


Niech będzie relacja jeden (y) do wielu (x), albo wiele do wielu. Powinny być metody:

    pobranie x należących do y
    
    pobranie wszystkich y
    
    przypisanie x do y
    
    usunięcie x z y
    
    dodanie do tabeli x, dodanie do tabeli y
    
    jeśli jakaś czynność wymaga kilku operacji na bazie danych, wtedy powinno to być wykonane w jednej transakcji.
    





