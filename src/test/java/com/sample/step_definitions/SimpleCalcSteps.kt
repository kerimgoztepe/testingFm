package com.sample.step_definitions

import com.iohktest.SimpleCalc
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import kotlin.test.assertEquals

private var x: Int = 0
    private var y: Int = 0
    private var doubleX: Double = 0.0
    private var doubleY: Double = 0.0
    private var result: Any? = null

    @Given("I have two integers {int} and {int}")
    fun setIntegers(int1: Int, int2: Int) {
        x = int1
        y = int2
    }
    @When("I add them")
    fun performAddition() {
    result = SimpleCalc.add(x, y)
    }

   @Then("expected result should be {int}")
   fun verifyResult(expectedResult: Int) {
   assertEquals(expectedResult, result as Int, "Result mismatch")
   }

    @Given("I have two doubles {double} and {double}")
    fun setDoubles(double1: Double, double2: Double) {
        doubleX = double1
        doubleY = double2
    }

    @When("I multiply them")
     fun performMultiplication() {
    result = SimpleCalc.multiply(doubleX, doubleY)
    }

    @Then("the result should be {double}")
    fun verifyDoubleResult(expectedResult: Double) {
    assertEquals(expectedResult, result as Double, "Result mismatch")
    }

   @Given("I have an array with elements {int}, {int}, {int}, {int}, {int}, {int}")
   fun setIntArray(
    int1: Int, int2: Int, int3: Int, int4: Int, int5: Int, int6: Int
    ) {
    val arr = intArrayOf(int1, int2, int3, int4, int5, int6)
    result = SimpleCalc.sumOffEvens(arr)
    }

    @When("I calculate the sum of even elements")
    fun calculateSumOfEvens() {
    }

   @Then("result will be {int}")
   fun resultWillBe(expectedResult: Int) {
       assertEquals(expectedResult, result as Int, "Result mismatch")
   }







