package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Home","Add","Profil")
    val menuIcon = arrayOf(R.drawable.home,R.drawable.add,R.drawable.profil)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);

        TabLayoutMediator(tab_layout, view_pager,
        TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            tab.text = menuTeks[position]
            tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}