package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_setting.setOnClickListener{
            val intent  = Intent (this, Setting::class.java)
            startActivity(intent)
        }
        button_func_add.setOnClickListener{
            val intent  = Intent (this, ItemAdd::class.java)
            startActivity(intent)
        }
        button_func_edit.setOnClickListener{
            val intent  = Intent (this, ItemEdit::class.java)
            startActivity(intent)
        }


    }
}