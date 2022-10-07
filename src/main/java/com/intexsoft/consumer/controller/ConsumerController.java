package com.intexsoft.consumer.controller;

import com.intexsoft.consumer.service.ConsumerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Consumer Controller.
 */
@RestController
@RequestMapping("api/consumer/")
@AllArgsConstructor
@Slf4j
@Tag(name = "Consumer API")
public class ConsumerController {
    private final ConsumerService consumerService;

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
    public ResponseEntity<BigDecimal> average() {
        BigDecimal response = consumerService.mean();
        log.info("Return average {} number", response);
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
                    description = "Number was saved"
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
    public void save(final int acceptNumber) {
        log.info("Start saving current {} number", acceptNumber);
        consumerService.save(acceptNumber);
    }
}
