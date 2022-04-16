package com.example.composit.domain.entity.repository

import com.example.composit.domain.entity.GameSettings
import com.example.composit.domain.entity.Level
import com.example.composit.domain.entity.Question

interface GameRepository {

    fun generateQuestions(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}