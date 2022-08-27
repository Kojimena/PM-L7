package com.jimena.pm_l7

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs



class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var textHome: TextView
    private lateinit var buttonActualizar: TextView

    private val args: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textHome = view.findViewById(R.id.actualizacion)
        buttonActualizar = view.findViewById(R.id.actualizarperfil)

        val email = args.email


        textHome.text = "Hola $email, necesitamos que \n actualices tu perfil!"

        setListeners()
    }

    private fun setListeners() {
        buttonActualizar.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(
                args.email
            )
            requireView().findNavController().navigate(action)
        }
    }
}