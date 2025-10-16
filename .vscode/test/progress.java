package com.escape.model;

import java.util.UUID;

/**
 * Represents a user's saved or ongoing progress in the game.
 */
public class Progress {

    private UUID progressUUID; // unique id for this progress record
    private UUID userUUID;     // user this progress belongs to

    /** No-arg constructor (optional, handy for loaders). */
    public Progress() { }

    /**
     * Constructor that logs errors and falls back to random UUIDs if nulls are passed.
     * This keeps the object in a valid state without throwing.
     */
    public Progress(UUID progressUUID, UUID userUUID) {
        if (progressUUID == null) {
            System.out.println("Progress: progressUUID was null; generating a random one.");
            progressUUID = UUID.randomUUID();
        }
        if (userUUID == null) {
            System.out.println("Progress: userUUID was null; generating a random one.");
            userUUID = UUID.randomUUID();
        }
        this.progressUUID = progressUUID;
        this.userUUID = userUUID;
    }

    public UUID getProgressUUID() {
        return progressUUID;
    }

    /**
     * Setter that logs and ignores null (keeps previous value).
     * Returns true if updated, false if ignored.
     */
    public boolean setProgressUUID(UUID progressUUID) {
        if (progressUUID == null) {
            System.out.println("Progress: progressUUID cannot be null; keeping previous value.");
            return false;
        }
        this.progressUUID = progressUUID;
        return true;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    /**
     * Setter that logs and ignores null (keeps previous value).
     * Returns true if updated, false if ignored.
     */
    public boolean setUserUUID(UUID userUUID) {
        if (userUUID == null) {
            System.out.println("Progress: userUUID cannot be null; keeping previous value.");
            return false;
        }
        this.userUUID = userUUID;
        return true;
    }

    @Override
    public String toString() {
        return "Progress: progressUUID=" + progressUUID + " | userUUID=" + userUUID;
    }
}
