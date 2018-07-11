Feature: Mathematical Calculation

  Background: Given calculation test

  Scenario Outline: Adding two numbers
    Given Create two numbers for addition
    And Add Number1 "<num1>" and Number2 "<num2>"
    Then The output of addition is "9"

  Examples:
    | num1 | num2 |
    | 5    | 4    |

  Scenario Outline: Subtraction two numbers
    Given Create two numbers for subtraction
    And Sub NumberA "<num1>" and NumberB "<num2>"
    Then The output of subtract is "2"

    Examples:
      | num1 | num2 |
      | 6    | 4    |

  Scenario Outline: Multiply two numbers
    Given Create two numbers for Multiplication
    And Multi NumberA "<num1>" and NumberB "<num2>"
    Then The output of multiply is "4"

    Examples:
      | num1 | num2 |
      | 2    | 2    |

  Scenario Outline: Divide two numbers
    Given Create two numbers for division
    And Divide NumberA "<num1>" and NumberB "<num2>"
    Then The output of divison is "5"

    Examples:
      | num1 | num2 |
      | 25    | 5   |