package com.example.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class Setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        //list of item to be displayed in listview
        val values = arrayListOf("種類設定", "單位設定", "其他設定")

        //listView
        val mListView = findViewById<ListView>(R.id.settingListView)

        //adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)

        //set adapter
        mListView.adapter = adapter

        //list item click

        mListView.setOnItemClickListener { parent , view, position, id ->
            if (position == 0){
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                val intent  = Intent (this, SetType::class.java)
                startActivity(intent)
            }
            if (position == 1){
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                val intent  = Intent (this, SetUnit::class.java)
                startActivity(intent)
            }
            if (position == 2){
                //Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                val intent  = Intent (this, SetOther::class.java)
                startActivity(intent)
            }
        }
    }
}