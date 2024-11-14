# PSE03-HepperKirschenmann-Pak.pdf

Teil B - Heimarbeit
Fabian Kirschenmann, 3787773, st193208@stud.uni-stuttgart.de
Mika Hepper, 3787375,
st193543@stud.uni-stuttgart.de

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

