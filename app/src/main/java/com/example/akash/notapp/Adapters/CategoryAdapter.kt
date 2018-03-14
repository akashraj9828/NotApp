package com.example.akash.notapp.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.R

/**
 * Created by Akash on 14-03-2018.
 */
class CategoryAdapter( context:Context, categories:List<Category>):BaseAdapter() {
    private val context=context
    private val categories=categories

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView:View = LayoutInflater.from(context).inflate(R.layout.category_list,null)

        val category_image:ImageView=categoryView.findViewById(R.id.categoryImage)
        val category_name:TextView=categoryView.findViewById(R.id.categoryName)

        val category=categories[position]

        category_name.text=category.title

        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        category_image.setImageResource(resourceId)

        return categoryView

    }

    override fun getItem(position: Int): Any {
       return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}