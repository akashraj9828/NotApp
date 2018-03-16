package com.example.akash.notapp.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.akash.notapp.Model.Category
import com.example.akash.notapp.R

/**
 * Created by Akash on 15-03-2018.
 */
class CategoryRecycleAdapter(val context:Context,val categories:List<Category>):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    val logTag="akash"
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position],context)
//        Log.i(logTag,"BindViewHolder: ${categories[position].title}")
    }

    override fun getItemCount(): Int {
//        Log.i(logTag,"get count: ${categories.count()}")
        return categories.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        var view=LayoutInflater.from(context).inflate(R.layout.category_list,parent,false)
//        Log.i(logTag,"new view created")
        return Holder(view)
    }

    //viewHolder class
    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImage=itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName=itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category:Category,context:Context){
            val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
//            Log.i(logTag,"BindCategoty : ${category.title}")
        }

    }
}