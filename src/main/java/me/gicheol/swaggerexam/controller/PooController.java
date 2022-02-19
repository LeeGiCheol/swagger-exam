package me.gicheol.swaggerexam.controller;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import me.gicheol.swaggerexam.dto.RequestDto;
import org.springframework.web.bind.annotation.*;

@Tag(name = "poo")
@RestController
public class PooController {

    @GetMapping("/hello")
    @Operation(summary = "hello", description = "hello 문자열 리턴")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/{name}")
    @Operation(summary = "hello name", description = "hello name 문자열 리턴")
    public String helloUser(@Parameter @PathVariable String name) {
        return "hello" + name;
    }



    @PostMapping("/echo")
    @Operation(summary = "echo", description = "요청 json을 그대로 응답함")
    public String echo(@RequestBody RequestDto requestDto) {
        return requestDto.toString();
    }

}
