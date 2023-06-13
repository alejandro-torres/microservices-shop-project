package com.atr.operation.controller;

import com.atr.operation.dto.OperationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operation")
public class OperationController {

    @GetMapping("/read/{id}")
    public ResponseEntity<OperationDTO> readOperationById(@PathVariable Integer id){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/create")
    public ResponseEntity<OperationDTO> createOperation(@RequestBody OperationDTO operationDTO){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<OperationDTO> deleteDelete(@RequestBody OperationDTO operationDTO){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


}
