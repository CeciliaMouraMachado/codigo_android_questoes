package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
//import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentEpsBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class EPSFragment : Fragment() {

    private var _binding: FragmentEpsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEpsBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculate.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

            //ENTRADA
            val numero = binding.edMetros.text.toString().toFloat()

            //PROCESSAMENTO
            var dam = numero/10
            var hm = dam/10
            var km = hm/10
            var dm = numero*10;
            var cm = dm*10;
            var mm = cm*10;

            // SAIDA
            binding.textViewResultado.setText("em km: $km; em hm: $hm; em dam: $dam; em dm: $dm; em cm: $cm; em mm: $mm")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}