package edu.miu.mdp_cs473


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.miu.mdp_cs473.domain.Lecture

class MyLectureAdapter( val context: Context,  val lectures:List<Lecture>):RecyclerView.Adapter<MyLectureAdapter.LectureViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyLectureAdapter.LectureViewHolder {
        //TODO("Not yet implemented")
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.lectures_layout, parent, false)
        return LectureViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return lectures.size
    }

    override fun onBindViewHolder(holder: MyLectureAdapter.LectureViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val lecture=lectures[position]
        holder.configure(lecture)
        holder.itemView.setOnClickListener{
            val intent = Intent(context, PdfViewActivity::class.java)
            intent.putExtra("title", "${lecture.lessonNumber}   ${lecture.title}")
            intent.putExtra("fileName", lecture.filename)
            context.startActivity(intent)
        }
    }
    class LectureViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val lectureNumberTextView: TextView = view.findViewById(R.id.lecture_number_text_view)
        private val titleTextView: TextView = view.findViewById(R.id.title_tv)

        fun configure(lecture: Lecture) {
            lectureNumberTextView.text = lecture.lessonNumber.toString()
            titleTextView.text = lecture.title
        }

    }

}