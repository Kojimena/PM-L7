package com.jimena.pm_l7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

class NewAccountFragment : Fragment(R.layout.fragment_new_account) {

    private lateinit var ButtonHome: Button
    private lateinit var Newmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ButtonHome = view.findViewById(R.id.buttonhome)
        Newmail = view.findViewById(R.id.correosignup)
        setListeners()
    }

    private fun setListeners() {
        ButtonHome.setOnClickListener(){

                val action = NewAccountFragmentDirections.actionNewAccountFragmentToHomeFragment(
                    email = Newmail.editText?.text.toString()
                )
                requireView().findNavController().navigate(action)
        }
    }


}