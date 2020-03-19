package edu.miu.mdp_cs473

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import edu.miu.mdp_cs473.domain.QuizResult
import kotlinx.android.synthetic.main.activity_quiz_result_analysis.*

class QuizResultAnalysisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result_analysis)
        setupUI()
    }

    private fun setupUI() {

        val result = intent.getParcelableArrayListExtra("result") ?: ArrayList<QuizResult>()
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = QuizResultAdapter(result)
    }

}
