package com.example.demotorashmi.registry;

public class Content {

    private final long id;
    private final String content;
    private String name;

    public Content(long id, String content) {
        this.id = id;
        this.content = content;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

