package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentIfElseBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class ForFragment : Fragment() {

    private var _binding: FragmentIfElseBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentIfElseBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculate.setOnClickListener {
            //ENTRADA
            val a = binding.edNumero1.text.toString().toFloat()
            val b = binding.edNumero2.text.toString().toFloat()
            val c = binding.edNumero3.text.toString().toFloat()

            //PROCESSAMENTO
            var resultado = ""
            if (a > b && b > c ) resultado = "$a é o maior e o $c é o menor"
            else if (a > c && c > b ) resultado = "$a é o maior e o $b é o menor"
            else if (b > a && a > c ) resultado = "$b é o maior e o $c é o menor"
            else if (b > c && c > a ) resultado = "$b é o maior e o $a é o menor"
            else if (c > b && b > a ) resultado = "$c é o maior e o $a é o menor"
            else if (c > a && a > b ) resultado = "$b é o maior e o $b é o menor"


            binding.textViewResultado.setText(resultado)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}