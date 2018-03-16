package com.example.akash.notapp.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
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
        var holder:ViewHolder=ViewHolder()
        val categoryView:View
        val category:Category=categories[position]
        val logTag:String="akash"

        if (convertView==null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list, null)
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag=holder
//            Log.i(logTag,"New View is created for frist time: ${category.title}")

        }else{
            holder=convertView.tag as ViewHolder
            categoryView=convertView
//            Log.i(logTag,"View Recycled: ${category.title}")

        }
        holder.categoryName?.text=category.title
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
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

    class ViewHolder{
        var categoryImage:ImageView?=null
        var categoryName:TextView?=null

    }

}