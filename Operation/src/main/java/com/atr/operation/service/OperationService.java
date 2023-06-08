package com.atr.operation.service;

import com.atr.operation.dto.OperationDTO;
import com.atr.operation.entity.Operation;

import java.util.Optional;

public interface OperationService {

    Optional<Operation> selectOperationById(Integer id);

    void registerNewOperation(OperationDTO operationDTO);

    Optional<Operation> deleteOperationById(Integer id);

}
