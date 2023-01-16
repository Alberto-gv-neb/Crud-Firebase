package com.test.firebasecrud.views.viewmodel

import com.test.firebasecrud.books.Book

data class BookListState(
    val isLoading: Boolean = false,
    val books: List<Book> = emptyList(),
    val error: String = ""
)
