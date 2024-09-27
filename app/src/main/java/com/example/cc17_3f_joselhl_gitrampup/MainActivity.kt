package com.example.cc17_3f_joselhl_gitrampup

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


        val aboutMe1 = AboutMe(R.mipmap.ic_launcher,
            "Jose Leif Hurei L.",
            "short desc",
            { /*TODO*/})

        val aboutMe2 = AboutMe(R.mipmap.ic_launcher,
            "Jane Doe",
            "ZZZ",
            {/*TODO*/})

        val arrlist = listOf(aboutMe1, aboutMe2)




        rvAboutMe.adapter = AboutMeAdapter(arrlist)

    }
}