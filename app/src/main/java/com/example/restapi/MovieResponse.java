package com.example.restapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// Nama Field harus sama persis dengan response.
// alternatif pakai menambahkan @SerializedName("nama_field_response")
public class MovieResponse {
    @SerializedName("Response")
    private String response;
    @SerializedName("totalResults")
    private String totalResults;
    @SerializedName("Search")
    private List<SearchItem> search;


    public String getResponse() {
        return response;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<SearchItem> getSearch() {
        return search;
    }

    public void setSearch(List<SearchItem> search) {
        this.search = search;
    }
}