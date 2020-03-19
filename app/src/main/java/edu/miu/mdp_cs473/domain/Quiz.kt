package edu.miu.mdp_cs473.domain

data class Quiz(
    val question: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val answer4: String,
    val correctAnswer: Int
)