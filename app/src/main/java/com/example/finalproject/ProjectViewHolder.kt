package com.example.finalproject


import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemBinding


class ProjectViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentProject: Project
    init {

        binding.root.setOnClickListener {
                val index = currentProject.index
                   val action = ServiceProjectFragmentDirections.actionServiceProjectFragmentToInfoFragment(index, currentProject.attending)
            binding.root.findNavController().navigate(action)

        }
    }
    fun bindProject(project: Project) {
        currentProject = project
        binding.titleText.text = currentProject.name
        binding.dateText.text = currentProject.date
        binding.attendingText.text = currentProject.attend
        if (currentProject.attending) {
            binding.statusImage.setImageResource(R.drawable.check)
        } else {
            binding.statusImage.setImageResource(R.drawable.not)
        }
    }
//    fun setAttendingStatus{}

}