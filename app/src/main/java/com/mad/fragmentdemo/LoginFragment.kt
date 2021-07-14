package com.mad.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.mad.fragmentdemo.databinding.FragmentLoginBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        binding.btnLogin.setOnClickListener(){
            val inputName:String = binding.tfName.text.toString()
            val inputPassword:String = binding.tfPassword.text.toString()

            if(inputName == "abc" && inputPassword =="123"){
                Navigation.findNavController(it).navigate(R.id.action_loginFragment2_to_questionFragment)
            }else{
                Toast.makeText(context,"Invalid User Name Or Password", Toast.LENGTH_LONG).show()
            }

        }
        return binding.root
    }



}