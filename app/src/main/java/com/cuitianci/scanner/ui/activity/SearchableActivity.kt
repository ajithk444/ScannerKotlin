package com.cuitianci.scanner.ui.activity

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.provider.SearchRecentSuggestions
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cuitianci.scanner.R
import com.cuitianci.scanner.provider.SearchSuggestionProvider

class SearchableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchable)
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent(intent)

    }

    private fun handleIntent(intent: Intent) {
        if (Intent.ACTION_SEARCH == intent.action) {
            intent.getStringExtra(SearchManager.QUERY)?.also { query ->
                doSearch(query) //执行查询行为
                SearchRecentSuggestions( //保存搜索历史
                    this,
                    SearchSuggestionProvider.AUTHORITY,
                    SearchSuggestionProvider.MODE
                ).saveRecentQuery(query, null)
            }
        }
    }

    //If your data is stored in a SQLite database on the device, performing a full-text search (using FTS3, rather than a LIKE query) can provide a more robust search across text data and can produce results significantly faster. See sqlite.org for information about FTS3 and the SQLiteDatabase class for information about SQLite on Android.
    //If your data is stored online, then the perceived search performance might be inhibited by the user's data connection. You might want to display a spinning progress wheel until your search returns. See android.net for a reference of network APIs and Creating a Progress Dialog for information about how to display a progress wheel.
    private fun doSearch(query: String) {
        Toast.makeText(this, query, Toast.LENGTH_SHORT).show()
    }

}
