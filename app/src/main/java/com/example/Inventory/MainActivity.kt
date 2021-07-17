package com.example.Inventory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.Inventory.Remote.Api
import com.example.Inventory.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var retrofit : Retrofit
    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navController: NavController
    lateinit var api : Api
    lateinit var url : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController=Navigation.findNavController(this,R.id.nav_host_fragment_container)
        bottomNavigationView = binding.bottomNavigation

        NavigationUI.setupWithNavController(bottomNavigationView,navController)

         retrofit= Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api= retrofit.create(Api::class.java)


    }
}