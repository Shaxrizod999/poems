package uz.android.sheriyatolami.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(inflater, container, false)


        binding.sevgisher.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }

        binding.sogincharmon.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        binding.tortliklar.setOnClickListener {
            findNavController().navigate(R.id.fourthFragment)
        }
        binding.otaonahaqida.setOnClickListener {
            findNavController().navigate(R.id.fifthFragment)
        }

        binding.dostliksherlari.setOnClickListener {
            findNavController().navigate(R.id.sixthFragment)
        }
        binding.hazilsher.setOnClickListener {
            findNavController().navigate(R.id.seventhFragment)
        }

        return binding.root


    }
}