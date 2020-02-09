package io.rjuelich.kata.gameoflife;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( //
		plugin = { 
				"pretty", // 
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" // 
				}, //
		features = { "src/test/resources/features" }, //
		monochrome = true)
public class GameOfLifeSpecification {

}
