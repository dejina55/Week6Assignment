package com.dejina.week6assignment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dejina.week6assignment.Adapter.StudentAdapter
import com.dejina.week6assignment.Dashboard.DashboardActivity
import com.dejina.week6assignment.Model.Student
import com.dejina.week6assignment.R

class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView =view.findViewById(R.id.recyclerView)

        Student("Reshika Shrestha","20","lokanthali","Female")
        val adapter = StudentAdapter(this.context!!, DashboardActivity.lisfOfStudent)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        return view;
    }


}