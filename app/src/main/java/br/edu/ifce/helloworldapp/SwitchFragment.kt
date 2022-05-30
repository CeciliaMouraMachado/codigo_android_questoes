package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentSwitchBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class SwitchFragment : Fragment() {

    private var _binding: FragmentSwitchBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSwitchBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculate.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

            //ENTRADA
            val a = binding.edMes.text.toString()
            val mes = a.uppercase()

            //PROCESSAMENTO
            var dias = when(mes) {
                in arrayOf("JANEIRO", "MARÇO", "MAIO", "JULHO", " AGOSTO", "OUTUBRO", "DEZEMBRO") -> "$mes tem 31 dias"
                "FEVEREIRO" -> "$mes tem 28 dias"
                in arrayOf("ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO") -> "$mes tem 30 dias"
                else -> "isso não é um mês"
            }

            // SAIDA
            binding.textViewResultado.setText("$dias")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}