package com.kata

class ScoreKeeper {
    var teamAScore: Int = 0
    var teamBScore: Int = 0

    fun scoreTeamA1() {
        teamAScore = teamAScore.inc()
    }

    fun scoreTeamA2() {
        teamAScore = teamAScore.plus(2)
    }

    fun scoreTeamA3() {
        teamAScore = teamAScore.plus(3)
    }

    fun scoreTeamB1() {
        teamBScore = teamBScore.inc()
    }

    fun scoreTeamB2() {
        teamBScore = teamBScore.plus(2)
    }

    fun scoreTeamB3() {
        teamBScore = teamBScore.plus(3)
    }

    fun getScores(): String {
        val paddedTeamAScore = teamAScore.toString().padStart(3, '0')
        val paddedTeamBScore = teamBScore.toString().padStart(3, '0')

        return "${paddedTeamAScore}:${paddedTeamBScore}"
    }
}