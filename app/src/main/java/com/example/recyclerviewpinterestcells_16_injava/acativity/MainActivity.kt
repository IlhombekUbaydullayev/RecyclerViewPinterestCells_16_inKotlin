package com.example.recyclerviewpinterestcells_16_injava.acativity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewpinterestcells_16_injava.R
import com.example.recyclerviewpinterestcells_16_injava.adapter.CustomAdapter.CustomViewHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewpinterestcells_16_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewpinterestcells_16_injava.helper.SpacesItemDecoration
import com.example.recyclerviewpinterestcells_16_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemerList()
        refreshAdapter(members)
    }

    private fun prepareMemerList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
    }

    private fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = StaggeredGridLayoutManager(
            3,
            StaggeredGridLayoutManager.VERTICAL
        )
        val decoration = SpacesItemDecoration(14)
        recyclerView!!.addItemDecoration(decoration)
    }
}