package com.example.akash.notapp.Controller

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.akash.notapp.Adapters.CategoryAdapter
import com.example.akash.notapp.Adapters.CategoryRecycleAdapter
import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.R
import com.example.akash.notapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 lateinit var adapter:CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= CategoryRecycleAdapter(this, DataService.catergories)
        categoryListView.adapter=adapter

        var layoutManager=LinearLayoutManager(this)
        categoryListView.layoutManager=layoutManager
        categoryListView.setHasFixedSize(true)
//        categoryListView.setOnItemClickListener{parent:AdapterView<*>?, view: View?, position: Int, id: Long ->
//            var category=DataService.catergories[position]
//            Toast.makeText(this,"You presssed " + category.title,Toast.LENGTH_SHORT).show()
//
//        }
    }

    fun gotoCategory(view:View){
         val i=Intent(applicationContext,LanguageActivity::class.java)
        startActivity(Intent(this,LanguageActivity::class.java))
    }
}
