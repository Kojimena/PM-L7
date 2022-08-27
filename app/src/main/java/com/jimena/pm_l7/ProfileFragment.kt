package com.jimena.pm_l7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var actualUser: TextInputLayout
    private lateinit var finalActualization: Button

    private val args: ProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actualUser = view.findViewById(R.id.correofinal)
        finalActualization = view.findViewById(R.id.actualization)

        val emailFinal= args.finalEmail
        actualUser.editText?.setText(emailFinal)

        setListeners()

    }

    private fun setListeners() {
        finalActualization.setOnClickListener() {
            requireView().findNavController()
                .navigate(ProfileFragmentDirections.actionProfileFragmentToLoginFragment2())

        }
    }


}