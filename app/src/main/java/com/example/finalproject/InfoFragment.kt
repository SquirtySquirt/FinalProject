package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentInfoBinding
import com.example.finalproject.databinding.FragmentMainBinding


class InfoFragment : Fragment() {
    private val viewModel: ProjectViewModel by viewModels()

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)

        val args = InfoFragmentArgs.fromBundle(requireArguments())
        binding.infoText.text =viewModel.projects[args.indexArgs].info

        binding.websiteButton.setOnClickListener {
            val webIntent: Intent = Uri.parse(viewModel.projects[args.indexArgs].link).let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
            binding.checkBox.text = "Not Attending"
        }
            binding.checkBox.setOnClickListener {
                if (binding.checkBox.isChecked) {

                    binding.checkBox.text = "Attending"
                    viewModel.setAttendingStatusForProject(args.indexArgs)

                } else {
                    binding.checkBox.text = "Not Attending"
                    viewModel.removeAttendingStatusForProject(args.indexArgs)
                }
            }

        return binding.root
    }
}

