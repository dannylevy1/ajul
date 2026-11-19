# Ajul — Azul board game with a Monte Carlo Tree Search AI

A complete Java implementation of the board game **Azul**, with an animated JavaFX interface and an AI opponent based on **Monte Carlo Tree Search (MCTS)**.

Built in a team of two for **CS-108 (Object-oriented programming project), EPFL, spring 2026**.

## Features

- **Full game engine**: factories, pattern lines, wall, floor line, scoring and end-of-game ranking, for 2 to 4 players
- **MCTS AI player**: tree descent, random play-outs guided by a move heuristic, back-propagation of a rank-and-points score, configurable number of iterations per move
- **Compact game state**: the board is bit-packed into primitive integers (`gamestate/packed`) so the AI can simulate thousands of games per move
- **Mutable and immutable game states** sharing a read-only interface
- **JavaFX GUI** with animated tile movements, plus a text interface (`AjulTUI`)
- **Unit tests** (JUnit 5) for the game logic

## Project structure

```
src/
├── ch/epfl/ajul/
│   ├── gamestate/      game state (mutable / immutable / read-only views)
│   │   └── packed/     bit-packed representations (tiles, wall, floor, moves)
│   ├── intarray/       lightweight int-array views
│   ├── mcts/           Monte Carlo Tree Search player
│   ├── gui/            JavaFX interface and animations
│   └── *.java          core types (Game, Player, TileKind, scoring…)
├── ajul.css            GUI style sheet
└── module-info.java
test/                   JUnit tests
```

## Run

Requirements: JDK 21 and the [JavaFX 21 SDK](https://openjfx.io/).

Open the project in IntelliJ IDEA, add the JavaFX SDK `lib` folder as a library, then run `ch.epfl.ajul.gui.Main` (graphical version) or `ch.epfl.ajul.AjulTUI` (text version).

## Authors

Danny Levy and [Elie Surman](https://github.com/surmanelie). Project specification by EPFL (CS-108).
