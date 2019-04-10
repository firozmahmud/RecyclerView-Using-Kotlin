package com.maxproit.basickotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.maxproit.basickotlin.R
import com.maxproit.basickotlin.model.User
import com.maxproit.basickotlin.adapter.UserAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            loadData()
        }

    }

    private fun loadData() {

        var p1 = User("Salman", "12345", "India")
        var p2 = User("Amir", "43345", "Pakistan")
        var p3 = User("Shahrukh", "67897", "America")
        var p4 = User("Hritik", "123400", "Canada")
        var p5 = User("Jhon", "056635", "Singapur")


        var users: ArrayList<User>? = ArrayList<User>()

        users?.add(p1)
        users?.add(p2)
        users?.add(p3)
        users?.add(p4)
        users?.add(p5)

        var adapter: UserAdapter =
            UserAdapter(this, users)
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = adapter
    }
}
