package com.example.cc17_3f_joselhl_gitrampup

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_joselhl_gitrampup.adapter.AboutMeAdapter
import com.example.cc17_3f_joselhl_gitrampup.model.AboutMe

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)


        val aboutMe1 = AboutMe(R.drawable.leif,
            "Jose Leif Hurei L.",
            "short desc",
            { view ->
                val intent = Intent(this, AboutJoseActivity::class.java)
                startActivity(intent)
            })

        val aboutMe2 = AboutMe(R.drawable.jane_doe_build,
            "Jane Doe",
            "ZZZ",
            {view->
                val intent = Intent(this, AboutJoseActivity:: class.java)
                startActivity(intent)
            })



        val arrlist = listOf(aboutMe1, aboutMe2)




        rvAboutMe.adapter = AboutMeAdapter(arrlist)

    }
}