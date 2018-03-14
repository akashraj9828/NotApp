package com.example.akash.notapp.Controller

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.R
import com.example.akash.notapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 lateinit var adapter:ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.catergories)
        categoryListView.adapter=adapter
    }

    fun gotoCategory(view:View){
         val i=Intent(applicationContext,LanguageActivity::class.java)
        startActivity(Intent(this,LanguageActivity::class.java))
    }
}
