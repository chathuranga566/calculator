package com.company.v5.operations;

public class OperationFactory {

    public Operation getInstance(String operator) {

        Operation operation = null;

        if (operator.equals("add")) {

            operation = new AddOperation();

        } else if (operator.equals("sub")) {

            operation = new SubOperation();

        } else {

            operation = new MulOperation();

        }
        return operation;

    }
}
