package com.movies_coroutines.app.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.movies_coroutines.source.RemoteDataSource

class FragmentLatestMoviesVM @ViewModelInject constructor(
private val remoteDataSource: RemoteDataSource
) : ViewModel() {

}