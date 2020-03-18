package edu.miu.mdp_cs473

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import kotlinx.android.synthetic.main.activity_pdf_view.*

class PdfViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_view)

        supportActionBar?.title = intent.getStringExtra("title")

        val fileName = intent.getStringExtra("fileName")
        val inputStream = resources.openRawResource(resources.getIdentifier(fileName,
            "raw", packageName))
        pdf_view.fromStream(inputStream).scrollHandle(DefaultScrollHandle(this)).load()
    }


}
