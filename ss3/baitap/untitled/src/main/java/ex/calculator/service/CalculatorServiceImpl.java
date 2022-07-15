package ex.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    public double calculator(String calculation, double num1, double num2) {
        double total = 0;

        switch (calculation) {
            case "add":
                total = num1 + num2;
                break;

            case "sub":
                total = num1 - num2;
                break;

            case "mul":
                total = num1 * num2;
                break;

            case "div":
                total = num1 / num2;
                break;
        }

        return total;
    }
}

