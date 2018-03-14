package com.example.akash.notapp.Services

import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.Model.Language
import com.example.akash.notapp.Model.Project

/**
 * Created by Akash on 14-03-2018.
 */
object DataService {
    val catergories= listOf(
            Category("Productivity","none"),
            Category("Entertainment","none"),
            Category("Social Networking","none"),
            Category("Utility","none")
    )
    val language= listOf(
            Language("C++"),
            Language("C"),
            Language("Kotlin"),
            Language("Java"),
            Language("HTML"),
            Language("JavaScript"),
            Language("CSS"),
            Language("Python")
    )

//    val project= listOf(
//            Project("Mood-Calendar", arrayOf("HTML","CSS"),"An awesome website","none")
//    )
}