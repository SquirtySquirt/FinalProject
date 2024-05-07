package com.example.finalproject


import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemBinding


class ProjectViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentProject: Project
    fun bindProject(project: Project){
        currentProject = project
//       binding.titleText.text = getString(currentProject.nameId)
    }

}