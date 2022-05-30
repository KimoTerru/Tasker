package it.kimoterru.tasker.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.kimoterru.tasker.data.entity.TaskEntity
import it.kimoterru.tasker.domain.usecase.task.TaskUseCases
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCases: TaskUseCases
) : ViewModel() {

    private val tasksMutableLiveData = MutableLiveData<List<TaskEntity>>()
    val tasksLive: LiveData<List<TaskEntity>> = tasksMutableLiveData

    fun getTasks() = viewModelScope.launch {
        val data = useCases.getAllTasks.invoke()
        tasksMutableLiveData.postValue(data)
    }
}