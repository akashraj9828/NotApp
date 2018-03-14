package com.example.akash.notapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.Model.Language
import com.example.akash.notapp.R
import com.example.akash.notapp.Services.DataService
import kotlinx.android.synthetic.main.activity_language.*

class LanguageActivity : AppCompatActivity() {

    lateinit var adapter:ArrayAdapter<Language>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.language)
        languageListView.adapter=adapter
    }
    fun gotoMainActivity(view:View){
        val mainActivityIntent=Intent(this,MainActivity::class.java)
        startActivity(mainActivityIntent)
    }

}
