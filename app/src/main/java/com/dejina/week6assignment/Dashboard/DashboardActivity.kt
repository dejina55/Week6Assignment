package com.dejina.week6assignment.Dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.dejina.week6assignment.Adapter.ViewAdapter
import com.dejina.week6assignment.Fragment.AboutFragment
import com.dejina.week6assignment.Fragment.HomeFragment
import com.dejina.week6assignment.Fragment.StudentFragment
import com.dejina.week6assignment.Model.Student
import com.dejina.week6assignment.R
import com.google.android.material.tabs.TabLayout

class DashboardActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager;
    private lateinit var tabLayout: TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        loadViewPagerAdapter();
        loadlist()
    }
    private fun loadViewPagerAdapter() {

        val adapter = ViewAdapter(supportFragmentManager);
        adapter.addFragment(HomeFragment(), "Home");
        adapter.addFragment(StudentFragment(), "Add Student");
        adapter.addFragment(AboutFragment(), "About Us");
        viewPager.adapter = adapter;
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.home);
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.add);
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.bell);


    }

    private fun loadlist(){
        if (lisfOfStudent.size==0){
            lisfOfStudent.add(Student("Reshika Shrestha", "20", "Bhaktapur", "Female"));
            lisfOfStudent.add(Student("Meezu Lawot", "20", "Kathmandu", "Female"));
            lisfOfStudent.add(Student("Salina Shrestha", "20", "Lalitpur", "Female"));
            lisfOfStudent.add(Student("Ujjwal Lamichhane", "20", "Kathmandu", "Male"));
            lisfOfStudent.add(Student("Yaman Subedi", "20", "Kathmandu", "Male"));
        }
    }
    companion object {
        var lisfOfStudent = arrayListOf<Student>();
    }
}