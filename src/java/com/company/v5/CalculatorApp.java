package com.company.v5;

import com.company.v5.input.Inputs;
import com.company.v5.operations.Operation;
import com.company.v5.operations.OperationFactory;
import com.company.v5.repository.NumberRepository;
import com.company.v5.ui.UI;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException { //we will change this in the future

        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is : " + result);

    }

}
