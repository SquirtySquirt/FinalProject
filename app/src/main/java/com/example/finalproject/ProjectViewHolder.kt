package com.example.finalproject


import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemBinding


class ProjectViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentProject: Project
    init {
        binding.root.setOnClickListener {
            binding.root.findNavController().navigate(R.id.action_serviceProjectFragment_to_infoFragment)

        }
    }
    fun bindProject(project: Project){
        currentProject = project
       binding.titleText.text = currentProject.name
        binding.dateText.text = currentProject.date

    }
//    fun setAttendingStatus{}

}