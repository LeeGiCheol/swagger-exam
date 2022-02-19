package me.gicheol.swaggerexam.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class RequestDto {

    @Schema(description = "제목", example = "제목입니다.")
    private String title;

    @Schema(title = "내용")
    private String message;

    @Schema(hidden = true)
    private String bar;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
