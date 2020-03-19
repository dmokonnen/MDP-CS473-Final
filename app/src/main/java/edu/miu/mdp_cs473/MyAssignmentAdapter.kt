package edu.miu.mdp_cs473


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.miu.mdp_cs473.domain.Assignment
import edu.miu.mdp_cs473.domain.Lecture

class MyAssignmentAdapter(val context: Context, val assignments:List<Assignment>):RecyclerView.Adapter<MyAssignmentAdapter.AssignmentViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyAssignmentAdapter.AssignmentViewHolder {
        //TODO("Not yet implemented")
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.assignment_layout, parent, false)
        return AssignmentViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return assignments.size
    }

    override fun onBindViewHolder(holder: MyAssignmentAdapter.AssignmentViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val assignment=assignments[position]
        holder.configure(assignment)
        holder.itemView.setOnClickListener{
            val intent = Intent(context, PdfViewActivity::class.java)
            intent.putExtra("title", assignment.title)
            intent.putExtra("fileName", assignment.filename)
            context.startActivity(intent)
        }
    }
    class AssignmentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val titleTextView: TextView = view.findViewById(R.id.title_text_view)

        fun configure(assignment: Assignment) {
            titleTextView.text = assignment.title
        }

    }

}