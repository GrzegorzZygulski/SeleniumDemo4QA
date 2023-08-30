Ogólnie o programie
	Pokazowy program wykorzystuje selenium do otwarcia mojej strony na Linkein.
 
Uruchamianie

	1. Trzeba mieć zainstalowaną Jave 
	2. Stworzony jest plik SeleniumDemo4QA.jar jest w folderze ...\SeleniumDemo4QA\out\artifacts\SeleniumDemo4QA_jar
	
Kod, struktura

	1. Projekt składa się z jednej klasy
	2. wiersz 13 to zainicjowanie obiektu webrdriwera
	3. wiersz 14 to udanie się do strony wyszykiwarki
	4. wiersz 15 to szukanie pola wyszukiwania w drzewie DOM
	5. wiersz 16 to  printf  tylko na informacji,
	6. wiersz 18 jak pole wyszukiwania znalezione to je aktywujemy 
	7. wiersz 19 to wpisujemy w pole wyszukiwania wyszykiwarki hasło do szukania
	8. wiersz 20 to Klikamy enter
	9. wiersz 22 to tworzymy element, który będzie czekał, aż wyszykiwarka "przemieli" dane i zwróci DOM, max 10 sekund ma na to 
	10. wiersz 23 implementacja powyższego "czekacza" na elemencie
	11. wiersz 24 to  printf  tylko na informacji,
	12. wiersz 25 to kliknięcie w wynik wyszukiwania
	
Historia Utworzenia:

	1. Najpierw instalacja JDK, inteliJ Idea 
	2. Stwórz projekt i koniecznie ustaw repo maven
	3. ustaw zalażności https://www.selenium.dev/documentation/webdriver/getting_started/install_library/ 
	4. IF (maven libreries not found){w IDE kliknij PPM na projekt>maven> update
	5. po dołączeniu  zależności do maven, trzeba import zrobić
