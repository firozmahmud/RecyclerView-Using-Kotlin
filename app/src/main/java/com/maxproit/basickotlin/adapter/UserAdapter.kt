package com.maxproit.basickotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.maxproit.basickotlin.R
import com.maxproit.basickotlin.model.User
import kotlinx.android.synthetic.main.list.view.*

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    var context: Context? = null
    var users: List<User>? = null
    var li: LayoutInflater? = null

    constructor(context: Context?, users: List<User>?) : super() {
        this.context = context
        this.users = users

        li = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UserViewHolder {
        var view: View
        view = li!!.inflate(R.layout.list, p0, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users!!.size
    }

    override fun onBindViewHolder(p0: UserViewHolder, p1: Int) {
        p0.nameTv.text = users?.get(p1)?.name ?: "No name found"
        p0.addressTv.text = users?.get(p1)?.address ?: "No address found"
        p0.numberTv.text = users?.get(p1)?.number ?: "No number found"


        p0.nameTv.setOnClickListener {
            Toast.makeText(context, p0.nameTv.text, Toast.LENGTH_LONG).show()
        }


        p0.itemView.setOnClickListener {
            Toast.makeText(context, "Position " + p1, Toast.LENGTH_LONG).show()
        }

    }


    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var nameTv = view.nameTxt
        var addressTv = view.addressTxt
        var numberTv = view.numberTxt

    }
}
