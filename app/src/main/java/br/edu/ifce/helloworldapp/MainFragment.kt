package br.edu.ifce.helloworldapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.edu.ifce.helloworldapp.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonImc.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_ImcFragment)
        }

        binding.buttonVolumeCilindro.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_VolumeCilindroFragment)
        }

        binding.buttonQuestaoEps.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_EntradaProcessamentoSaidaFragment)
        }
        binding.buttonQuestao17.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_IFElseFragment)
        }
        binding.buttonQuestao27.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_SwitchFragment)
        }
        binding.buttonQuestao42.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_DoWhileFragment)
        }
        binding.buttonQuestao44.setOnClickListener {
            findNavController().navigate(R.id.action_MainFragment_to_ForFragment)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}