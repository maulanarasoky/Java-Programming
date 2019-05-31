package com.company;

public class BalanceChecker implements balanceCheckerInterface {
    @Override
    public boolean balanceCheck(String input) {
        int count = input.length();
        Stack openDelimiterStack = new Stack();
        boolean isBalanced = true;
        int index = 0;
        char nextCharacter = ' ';
        for (index = 0; isBalanced && (index < count); index++) {
            nextCharacter = input.charAt(index);
            switch (nextCharacter) {
                case '(':
                case '[':
                case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ')':
                case ']':
                case '}':
                    if (openDelimiterStack.isEmpty())
                        isBalanced = false;
                    else {
                        char newStack = (char) openDelimiterStack.pop();
                        isBalanced = isPaired(newStack, nextCharacter);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!openDelimiterStack.isEmpty()) {
            isBalanced = false;
        }
        return isBalanced;
    }

    @Override
    public boolean isPaired(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
