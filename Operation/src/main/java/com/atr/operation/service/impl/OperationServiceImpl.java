package com.atr.operation.service.impl;

import com.atr.operation.dto.OperationDTO;
import com.atr.operation.entity.Operation;
import com.atr.operation.service.OperationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationService {
    @Override
    public Optional<Operation> selectOperationById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void registerNewOperation(OperationDTO operationDTO) {

    }

    @Override
    public Optional<Operation> deleteOperationById(Integer id) {
        return Optional.empty();
    }
}
