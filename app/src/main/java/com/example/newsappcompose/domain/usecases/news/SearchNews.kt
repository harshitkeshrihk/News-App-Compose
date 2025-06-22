package com.example.newsappcompose.domain.usecases.news

import androidx.paging.PagingData
import com.example.newsappcompose.domain.model.Article
import com.example.newsappcompose.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>,searchQuery: String): Flow<PagingData<Article>> {
        return newsRepository.searchNews(sources,searchQuery)
    }
}