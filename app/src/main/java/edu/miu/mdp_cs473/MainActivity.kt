package edu.miu.mdp_cs473

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.view.menu.MenuBuilder
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val adapter=ViewPagerAdapter(supportFragmentManager)
        //adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(CourseInfoFragment(),"Course Info")
        adapter.addFragment(Lectures2Fragment(),"Lectures")
        adapter.addFragment(AssignmentsFragment(),"Assignments")
        adapter.addFragment(QuizFragment(),"Quiz")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)?.setIcon(R.drawable.ic_description)
        tabs.getTabAt(1)?.setIcon(R.drawable.lecture)
        tabs.getTabAt(2)?.setIcon(R.drawable.ic_assignment)
        tabs.getTabAt(3)?.setIcon(R.drawable.quiz)
    }

    fun go(view: View) {
        val intent = Intent(this, PdfViewActivity::class.java)
        intent.putExtra("title", "Course info")
        intent.putExtra("fileName", "course_info")
        startActivity(Intent(intent))
    }


}
