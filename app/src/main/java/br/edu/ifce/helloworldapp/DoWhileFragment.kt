package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
//import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentDoWhileBinding
import br.edu.ifce.helloworldapp.databinding.FragmentTabuadaBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

open class DoWhileFragment : Fragment() {

    private var _binding: FragmentDoWhileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDoWhileBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonTabuada.setOnClickListener {
            findNavController().navigate(R.id.action_DoWhileFragment_to_TabuadaFragment)

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

        }
}
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}