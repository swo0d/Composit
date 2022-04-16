package com.example.composit.domain.entity.usecases

import com.example.composit.domain.entity.Question
import com.example.composit.domain.entity.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
    return repository.generateQuestions(maxSumValue, COUNT_OF_OPTIONS)
    }

   private companion object {
       private const val COUNT_OF_OPTIONS = 6
    }
}