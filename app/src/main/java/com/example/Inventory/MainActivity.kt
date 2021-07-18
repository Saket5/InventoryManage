package com.example.Inventory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.Inventory.Remote.Api
import com.example.Inventory.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var retrofit : Retrofit
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navController: NavController
    lateinit var navHostFragment : NavHostFragment
    lateinit var api : Api
    lateinit var url : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController=navHostFragment.navController
        bottomNavigationView = binding.bottomNavigation

        bottomNavigationView.setupWithNavController(navController)

       /*  retrofit= Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api= retrofit.create(Api::class.java)*/


    }
}