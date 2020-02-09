package io.rjuelich.kata.gameoflife;

import static io.cucumber.datatable.DataTable.create;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameOfLifeStepDef {

	private DataTable actual;

	@Given("the following generation")
	public void the_following_generation(final DataTable given) {
	}

	@When("the next generation is calculated")
	public void the_game_goes_to_next_generation() {
		actual = create(nextGeneration());
	}

	@Then("the new generation will be")
	public void the_new_generation_will_be(final DataTable expected) {
		assertThat(actual).isEqualTo(expected);
	}

	private List<List<String>> nextGeneration() {
		List<List<String>> rows = new ArrayList<List<String>>();
		rows.add(asList("X", "0", "1", "2", "3", "4", "5", "6", "7"));
		rows.add(asList("0", "-", "-", "-", "-", "-", "-", "-", "-"));
		rows.add(asList("1", "-", "-", "-", "o", "o", "-", "-", "-"));
		rows.add(asList("2", "-", "-", "-", "o", "o", "-", "-", "-"));
		rows.add(asList("3", "-", "-", "-", "-", "-", "-", "-", "-"));
		return rows;
	}
}
