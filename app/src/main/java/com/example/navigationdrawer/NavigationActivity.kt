package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_navigation.*
import kotlinx.android.synthetic.main.toolbar.*

class NavigationActivity : AppCompatActivity() {
//    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
//
//        return true
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

//        var drawer: DrawerLayout =dlayout
//        var toggle: ActionBarDrawerToggle? = null
//     //   toolbar.title="Menus"
//        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close)
//        drawer!!.addDrawerListener(toggle!!)
//        toggle!!.syncState()
//
//
//      navigate.setOnClickListener {
//         when(it.id){
//             R.id.miCompose-> Toast.makeText(applicationContext,"compose",Toast.LENGTH_LONG).show()
//             R.id.miProfile-> Toast.makeText(applicationContext,"Profile",Toast.LENGTH_LONG).show()
//         }
//      }
   }
}
