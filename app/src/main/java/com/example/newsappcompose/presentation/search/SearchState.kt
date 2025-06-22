package com.example.newsappcompose.presentation.search

import androidx.paging.PagingData
import com.example.newsappcompose.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery : String = "",
    val articles: Flow<PagingData<Article>>? = null
)