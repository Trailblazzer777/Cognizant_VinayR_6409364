package com.example.mock;

public class MyService {
    private final ExtApi api;

    public MyService(ExtApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}