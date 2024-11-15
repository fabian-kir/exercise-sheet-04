# PSE03-HepperKirschenmann-Pak.pdf

Teil B - Heimarbeit
Fabian Kirschenmann, 3787773, st193208@stud.uni-stuttgart.de
Mika Hepper, 3787375,
st193543@stud.uni-stuttgart.de

1. 
(c)
i)	Der Bezeichner „4LeggedAnimal“ ist ein lexikalischer Fehler, da laut Definition keine Zahl am Anfang eines Bezeichners sein darf.

ii)	Zeile 7: Vor „stop()“ fehlt „void“, da ohne „void“ der Compiler nicht weiß was der Rückgabetyp für die folgenden Zeilen ist, somit der AST nicht gebaut werden kann und ein syntaktischer Fehler geworfen wird.
Zeile 4: 
„backfeet.pushOff((;“ wirft einen Syntaktischen Fehler, da die Klammern falsch gesetzt wurden. Richtig wäre „backfeet.pushOff();“, so könnte der AST gebaut werden.

iii)	Zeile 2: Rückgabe fehlt, somit kann der AST zwar gebaut werden, jedoch erwartet boolean einen booleschen wert (true/false) als Rückgabe, weshalb während der Laufzeit ein Fehler geworfen wird.
Zeile 16: 
„Integer“ muss in „String“ umgewandelt werden, da der Return typ ein String ist und somit ein statisch semantischer Fehler geworfen wird.

iv)	1.Möglichkeit:
In Zeile 11 wird „name“ als z.B. „Hallo“, eingegeben, dieser ist jedoch als integer definiert, somit würde ein dynamisch semantischer Fehler geworfen werden.
2.Möglichkeit:
Wenn „“frontFeet“ oder „backFeet“ nicht initialisiert wurden, somit den Wert „null“ haben, wird während der Luaufzeit eine „NullPointerException“ geworfen. 

v)	Zeile 8: 
„backFeet .stop()“ ist ein Stilfehler und sollte wie folgt geschrieben werden: „backFeet.stop()“, ohne Leerzeichen dazwischen, damit das Programm leserlicher und korrekter geschrieben wird.
Zeile 9:
„backFeet.stop();}“ ist ein Stil Fehler und sollte wie folgt aussehen: „backFeet.stop();
}“,
dadurch ist klarer wie die Programmstruktur aussieht, welches den Code leserlicher und korrekter macht.
vi)	Weitere Fehler:
Zeile 4:
„backfeet“ sollte, um eine bessere Struktur, Leserlichkeit und Korrektheit im Code zu haben, wie folgt aussehen: „backFeet“. Außerdem könnte es passieren dass der Compiler „backfeet“ nicht erkennt, wodurch ein syntaktischer Fehler auftrete würde.
Zeile 12:
In der Zeile „meowmessage(message, Integer name)“ fehlt in der Klammer vor dem ausdruck „message“ ein Klassentyp „String“. Dadurch würde der AST nicht richtig gebaut werden und ein syntaktischer Fehler auftreten.
Außerdem ist ein Stilfehler vorhanden, da „meowmessage“ wie folgt notiert werden sollte, um eine bessere Struktur, Leserlichkeit und Korrektheit im Code zu haben: „meowMessage“.
Zeile 12/13:
Anstatt „name“ in den Klammern als Argument zu haben sollte rein logisch gesehen „message“ an stattdessen eingefügt werden. „message“ ist definiert als „String“, wodurch unsere Nachricht richtig gespeichert wird und durch die Ausgabe in Zeile 13 auch tatsächlich ausgegeben, welches unsere Namensgebung der Operation „meowMessage(…) {}“ somit auch tatsächlich erfüllt. (logischer Fehler?)


2. (a)
- die substring-Operation schneidet einen kleineren String aus dem Eingabestring heraus. Dabei gibt das erste Argument den Startindex und das zweite Argument den Endindex dieses Ausschnitts an. 
- Die Zeile 3 gibt in die Konsole also das Ergebnis dieser Operation aus. Wir können den String durchnummerieren beginnend von 0 (P hat also den Index 0). statement[9] == 'R' und statement [15] == s und somit ist result == "Ronnies".
- Vorbedingung dieser Operation wäre zum Beispiel, dass das zweite Argument des Startindex, also das Ausschnittsende, größer sein muss als der Startindex.

```Java
// Korrekturanmerkung: 'substring' ist natürlich eine Methode und keine Operation, ich weiß allerdings nicht wie kurz oder Pseudocode-mäßig die String-Klasse andeuten könnte ...
/**
 * @requires beginIndex < endIndex as otherwise cutting out a part of the string is impossible / meaningless
 * @requires endIndex <= the length of String which the cutout is performed on
 * @param beginIndex: int, describing the start index of the cutout, musst therefore be at least 0
 * @param endIndex: int, describing the end index of the cutout
 * @returns str, which is the cutout
 * @ensures: the return string will be of length endIndex-beginIndex, and at most as long as the input string
 */
String substring(int beginIndex, int endIndex) {...}
```

(b) 
- ``Die String.contains(...)`` methode gibt an, ob ein String in einem anderen String enthalten ist, also ob sich eine Zeichenabfolge in gleicher Reihenfolge an einer bestimmten Stelle im String finden lässt.
- Die Ausgabe von ``String.contains()`` muss daher vom Typ Boolean sein, also true oder false. Java wird diese automatisch in einen String konvertieren, da ``.println`` als Argument nach einem String verlangt. 
- Das ist möglich dank des sogenannten Autoboxing/Autounboxing
- In diesem konkreten Fall ist 'ROnnie' nicht in ``statement`` enthalten, daher wird der String "false" in die Konsole ausgegeben.
- 
```Java
/**
 * @requires The input String needs to be shorter than the string that is being searched inside of
```

(c)
- String.indexOf(String str)
- Konkret: ``statement.indexOf('i');``

(d)
- Java verwendet sog. autoboxing / autounboxing. Es kann daher manche Objekte verschiedener Typen bei Bedarf direkt in den benötigten Typ konvertieren. Da eine CharSequence nichts anderes als einen String beschreibt, aber mit ihr einfacher zu arbeiten ist, wird hier genau diese Funktion verwendet.

