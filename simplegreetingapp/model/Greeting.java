package com.bridgelabz.simplegreetingapp.model;

public class Greeting {
        private long id;
        public long getId() {
        return id;
    }
    private String content;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
