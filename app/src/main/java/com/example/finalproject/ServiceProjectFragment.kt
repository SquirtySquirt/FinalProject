package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentServiceProjectBinding


class ServiceProjectFragment : Fragment() {
    private var _binding: FragmentServiceProjectBinding? = null
    private val binding get() = _binding!!
    private val viewModel: ProjectViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServiceProjectBinding.inflate(inflater, container, false)

        val args = InfoFragmentArgs.fromBundle(requireArguments())
        viewModel.projects[args.indexArgs].attending= args.attendArgs
        val rootView = binding.root
        val mAdapter = ProjectAdapter(viewModel.projects)
        binding.recyclerView.adapter = mAdapter

        return rootView

    }


}
