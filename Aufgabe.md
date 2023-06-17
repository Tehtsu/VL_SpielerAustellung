 - Es gibt eine Klasse „Player“, die die Attribute Name, Geburtsdatum, Spielerstärke (1 bis 9) und eine Methode „getFunction“ (Rückgabewert
soll die Zeichenkette „Spieler“ sein) beinhaltet
 - Es gibt für jede Spielerart (Torwart, Abwehrspieler, Mittelfeldspieler,
Stürmer) eine entsprechende Klasse, die von „Player“ erbt und die
Methode „getFunction“ überschreibt. Die Methode „getFunction“ soll die
konkrete Art des Spielers zurück geben.
 - Eine Mannschaft besteht aus einem Torwart, 10 Feldspielern und ist einer
Nation zugeordnet. Es müssen in einer Mannschaft alle Spielerarten
vertreten sein. Die 10 Feldspieler sollen eine möglichst realistische
Zusammensetzung durch die statische Methode „create“ erhalten.
 - Es soll eine Methode „getPower“ implementiert werden, die die
Gesamtstärke der Mannschaft (Summe der Spielerstärken) ermittelt.
 - Folgende Fragen sind zu beantworten:
   - Was wird zurück gegeben, bei
     - a) Spieler spieler1 = new Spieler(); \
        spieler1.getFunction(); ?
     - b) Torwart torwart = new Torwart(); \
        torwart.getFunction(); ?
     - c) Spieler spieler2 = new Mittelfeldspieler(); \
        spieler2.getFunction(); ?