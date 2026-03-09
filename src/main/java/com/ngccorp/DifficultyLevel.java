package com.ngccorp;

public enum DifficultyLevel {
  /**
   * Vanilla Hytale behaviour — no damage multipliers applied.
   */
  NORMAL(1.0f, 1.0f),

  /**
   * Slightly harder: mobs hit 50 % harder, environment 25 % harder.
   */
  MEDIUM(1.5f, 1.25f),

  /**
   * Challenging: mobs hit twice as hard, environment 50 % harder.
   */
  HARD(2.0f, 1.5f),

  /**
   * Nightmare: mobs hit three times as hard, environment twice as hard.
   */
  NIGHTMARE(3.0f, 2.0f);

  /** Multiplier applied to damage dealt by non-player entities (mobs). */
  private final float mobDamageMultiplier;

  /** Multiplier applied to damage from the environment (fall, fire, void, …). */
  private final float environmentDamageMultiplier;

  DifficultyLevel(float mobDamageMultiplier, float environmentDamageMultiplier) {
    this.mobDamageMultiplier = mobDamageMultiplier;
    this.environmentDamageMultiplier = environmentDamageMultiplier;
  }

  public float getMobDamageMultiplier() {
    return mobDamageMultiplier;
  }

  public float getEnvironmentDamageMultiplier() {
    return environmentDamageMultiplier;
  }
}
