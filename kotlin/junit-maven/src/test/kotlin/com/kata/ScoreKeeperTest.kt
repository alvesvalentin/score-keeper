package com.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoreKeeperTest {

    private val scoreKeeper = ScoreKeeper()

    @Test
    fun `Team A scores 1 point` () {
    // Act
    scoreKeeper.scoreTeamA1()

    // Assert
    assertThat(scoreKeeper.teamAScore).isEqualTo(1)
    }

    @Test
    fun `Team A scores 2 points` () {
        // Act
        scoreKeeper.scoreTeamA2()

        // Assert
        assertThat(scoreKeeper.teamAScore).isEqualTo(2)
    }

    @Test
    fun `Team A scores 3 points` () {
        // Act
        scoreKeeper.scoreTeamA3()

        // Assert
        assertThat(scoreKeeper.teamAScore).isEqualTo(3)
    }

    @Test
    fun `Team B scores 1 point` () {
        // Act
        scoreKeeper.scoreTeamB1()

        // Assert
        assertThat(scoreKeeper.teamBScore).isEqualTo(1)
    }

    @Test
    fun `Team B scores 2 points` () {
        // Act
        scoreKeeper.scoreTeamB2()

        // Assert
        assertThat(scoreKeeper.teamBScore).isEqualTo(2)
    }

    @Test
    fun `Team B scores 3 points` () {
        // Act
        scoreKeeper.scoreTeamB3()

        // Assert
        assertThat(scoreKeeper.teamBScore).isEqualTo(3)
    }

    @Test
    fun `show the score of both teams with score 0-0` () {
    // Act
        val scores = scoreKeeper.getScores()

        // Assert
    assertThat(scores).isEqualTo("000:000")
    }

    @Test
    fun `show the score of both teams with score 10-0` () {
        // Arrange
        scoreKeeper.scoreTeamA3()
        scoreKeeper.scoreTeamA3()
        scoreKeeper.scoreTeamA3()
        scoreKeeper.scoreTeamA1()
        // Act
        val scores = scoreKeeper.getScores()

        // Assert
        assertThat(scores).isEqualTo("010:000")
    }
}