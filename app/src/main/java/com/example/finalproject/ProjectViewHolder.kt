package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemBinding

class ProjectViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentProject: Project
    fun bindProject(project: Project){
        currentProject = project
        binding.titleText.text = currentProject.nameId.toString()
    }

}