package com.example.consumer.controller;

import com.example.consumer.service.ConsumerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Consumer Controller.
 */
@RestController
@RequestMapping("api/consumer/")
@Tag(name = "Consumer API")
public class ConsumerController {
    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    /**
     * Method to get average of numbers consumed in last 5 min.
     *
     * @return double
     */
    @GetMapping("average")
    @Operation(summary = "Counting average summa the last 5 min")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Counting done",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Double.class))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Bad request"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Not Found"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Failed to count"
            )
    })
    public ResponseEntity<Double> average() {
        Double response = consumerService.mean(5);
        return ResponseEntity.ok()
                .body(response);
    }

    /**
     * Method to save number.
     *
     * @param acceptNumber number
     */
    @PostMapping("accept")
    @Operation(summary = "Saves number in database")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Number was saved",
                    content = @Content(
                            schema = @Schema(implementation = String.class))
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Invalid request"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Failed to save number"
            )
    })
    public @ResponseBody void upload(@RequestPart final int acceptNumber) {
        consumerService.save(acceptNumber);
    }
}
