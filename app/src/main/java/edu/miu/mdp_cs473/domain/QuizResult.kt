package edu.miu.mdp_cs473.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuizResult(val question: String, val selectedAnswer: String, val correctAnswer: String) :
    Parcelable {

    constructor(quiz: Quiz, selectedAnswer: String) : this(
        quiz.question,
        selectedAnswer,
        arrayOf(quiz.answer1, quiz.answer2, quiz.answer3)[quiz.correctAnswer]
    )

}
