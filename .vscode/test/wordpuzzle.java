package com.escape.model;

import java.util.UUID;

/**
 * Child class responsible for managing any and all "word" puzzles.
 * Holds title, objective, a solution string, solved state, and a unique ID.
 * 
 * Author:
 */
public class WordPuzzle extends Puzzle {

    /** Unique identifier for this puzzle instance. */
    public UUID puzzleID;

    /** Display title of the puzzle. */
    private String title;

    /** Description of what the user is trying to solve. */
    private String objective;

    /** Whether the puzzle has been solved. */
    private boolean solved;

    /** The valid solution to the puzzle. */
    private String solution;

    /**
     * Constructs a WordPuzzle with the given properties.
     *
     * @param title     The title of the puzzle
     * @param objective The description of the puzzle objective
     * @param solution  The valid solution to the puzzle
     * @param solved    Initial solved state (true if already solved)
     */
    public WordPuzzle(String title, String objective, String solution, boolean solved) {
        this.title = title;
        this.objective = objective;
        this.solution = solution;
        this.solved = solved;

        // generate a unique id for this puzzle instance
        this.puzzleID = UUID.randomUUID();
    }

    /**
     * Returns whether the puzzle is solved.
     *
     * @return true if solved; false otherwise
     */
    public boolean isSolved() {
        return this.solved;
    }

    public String getTitle() 
    { 
        return title;
    }
    public String getObjective() { return objective; }
    public UUID getPuzzleID() { return puzzleID; }

     public boolean checkAnswer(String guess) {
        if (guess == null) return false;
        boolean ok = solution != null && solution.equalsIgnoreCase(guess.trim());
        if (ok) this.solved = true;
        return ok;
    }
}

