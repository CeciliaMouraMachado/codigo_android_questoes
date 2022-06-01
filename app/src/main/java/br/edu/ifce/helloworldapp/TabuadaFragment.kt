package br.edu.ifce.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.edu.ifce.helloworldapp.databinding.FragmentDoWhileBinding
import br.edu.ifce.helloworldapp.databinding.FragmentTabuadaBinding

class TabuadaFragment(private val activity: DoWhileFragment) {
    private var _binding: FragmentTabuadaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

     fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?,
         dias: String
     ): View? {

        binding.textViewResultado.setText("$dias")
        _binding = FragmentTabuadaBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      onViewCreated(view, savedInstanceState)
    }

    fun onDestroyView() {
        onDestroyView()
        _binding = null
    }
}

private fun Any.onDestroyView() {
    TODO("Not yet implemented")
}

private fun Any.onViewCreated(view: View, savedInstanceState: Bundle?) {

}
