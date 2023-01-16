package com.test.firebasecrud.views.viewmodel

import com.test.firebasecrud.books.Book

data class BookDetailState(
    val isLoading: Boolean = false,
    val book: Book? = null,
    val error: String = ""
)
