package com.example.composit.domain.entity.usecases

import com.example.composit.domain.entity.GameSettings
import com.example.composit.domain.entity.Level
import com.example.composit.domain.entity.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}