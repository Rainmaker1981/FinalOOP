# FinalOOP

Class examples and final review code for Object-Oriented Programming / Java review.

## Folder layout

```text
FinalOOP/
├── java-oop-shapes/
│   ├── Circle.java
│   ├── Trapezoid.java
│   └── OopDriver.java
├── java-cards/
│   ├── Card.java
│   └── CardsDriver.java
├── java-arrays-fileio/
│   ├── ArraysFileDriver.java
│   └── data.csv
└── python-tkinter/
    ├── gui.py
    └── lab9.py
```

## Important IntelliJ note

Each Java folder can be opened as a simple Java project or copied into an IntelliJ `src` folder.

Some original class files used `public class driver` with lowercase names. I renamed the driver classes so the public class name matches the file name, which is required by Java for public classes.

## Concepts covered

- Java classes
- private data attributes
- constructors
- overloaded constructors
- helper methods
- getters and setters
- `toString()`
- `StringBuilder`
- arrays of objects
- 2D arrays
- file input with `Scanner`
- exception handling
- Tkinter GUI basics
- Tkinter callbacks
- basic file open/save GUI behavior

## Quick compile examples

### Shapes/OOP

```bash
cd java-oop-shapes
javac Circle.java Trapezoid.java OopDriver.java
java OopDriver
```

### Cards

```bash
cd java-cards
javac Card.java CardsDriver.java
java CardsDriver
```

### Arrays/File IO

```bash
cd java-arrays-fileio
javac ArraysFileDriver.java
java ArraysFileDriver
```

### Tkinter

```bash
cd python-tkinter
python gui.py
python lab9.py
```
