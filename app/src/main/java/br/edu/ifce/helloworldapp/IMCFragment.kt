package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentImcBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class IMCFragment : Fragment() {

    private var _binding: FragmentImcBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentImcBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculate.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)


            //ENTRADA
            val altura = binding.edAltura.text.toString().toFloat()
            val peso = binding.edPeso.text.toString().toFloat()

            //PROCESSAMENTO
            val imc = peso / (altura*altura)
            var situacao = ""
            if (imc < 18.5) situacao = "muito abaixo do peso"
            else if (imc <= 24.9) situacao = "peso normal"
            else if (imc <= 29.9) situacao = "aumentado"
            else if (imc <= 34.9) situacao = "moderado"
            else if (imc <= 39.9) situacao = "grave"
            else if (imc > 40) situacao = "muito grave"

            // SAIDA
            binding.textViewResultado.setText(String.format("%.2f", imc)+"\n"+situacao)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}