package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ListItemBinding

class ProjectAdapter (val projects: List<Project>) : RecyclerView.Adapter<ProjectViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ListItemBinding.inflate(layoutInflater, parent, false)
            return ProjectViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return projects.size
        }

        override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
            val project= projects[position]
            holder.bindProject(project)
        }
    }
