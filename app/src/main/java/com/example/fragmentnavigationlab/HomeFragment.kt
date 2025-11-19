package com.example.fragmentnavigationlab

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // Get the button
        val button = view.findViewById<Button>(R.id.buttonToDetails)
        // Navigate to BookDetailsFragment when clicked
        button.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_details)
        }
    }
}