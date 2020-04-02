package com.example.commuterapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var et_username =view.findViewById(R.id.editText_userName) as EditText
        var et_password =view.findViewById(R.id.editText_password) as EditText
        view.findViewById<Button>(R.id.button_reset).setOnClickListener {
             et_username.setText("")
             et_password.setText("")
        }
        view.findViewById<Button>(R.id.button_submit).setOnClickListener {
            val username=et_username.text
            val password=et_password.text
            Toast.makeText(getActivity(), "Welcome Back " + username + "!", Toast.LENGTH_LONG).show()
        }
        view.findViewById<FloatingActionButton>(R.id.floatingActionButton_fitbit).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        view.findViewById<FloatingActionButton >(R.id.floatingActionButton_google).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
