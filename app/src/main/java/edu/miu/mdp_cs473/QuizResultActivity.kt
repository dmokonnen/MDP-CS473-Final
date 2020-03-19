package edu.miu.mdp_cs473

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.miu.mdp_cs473.domain.QuizResult

import kotlinx.android.synthetic.main.activity_quiz_result.*

class QuizResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)
        setupUI()
    }

    override fun onSupportNavigateUp(): Boolean {
        setResult(Activity.RESULT_OK)
        finish()
        return super.onSupportNavigateUp()
    }

    private fun setupUI() {

        val result = intent.getParcelableArrayListExtra<QuizResult>("result")
        if (result != null) {
            val totalQuestions = result.size
            var correctAnswers = 0
            result.forEach {
                if (it.selectedAnswer == it.correctAnswer) {
                    correctAnswers++
                }
            }
            total_questions_text_view.text = "Total questions: $totalQuestions"
            correct_answers_text_view.text = "Correct answers: $correctAnswers"
            wrong_answers_text_view.text = "Wrong answers: ${totalQuestions - correctAnswers}"
            score_text_view.text = "Your score is: $correctAnswers / $totalQuestions"
        }
    }

    fun tryAgainButtonClicked(view: View) {
        setResult(Activity.RESULT_OK)
        finish()
    }

    fun resultAnalysisButtonClicked(view: View) {
        val answers = intent.getParcelableArrayListExtra<QuizResult>("result")
        val intent = Intent(this, QuizResultAnalysisActivity::class.java)
        if (answers != null) {
            intent.putParcelableArrayListExtra("result", answers)
        }
        startActivity(intent)
    }
}
