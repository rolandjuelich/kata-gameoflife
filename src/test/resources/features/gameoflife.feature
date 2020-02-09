Feature: Game of Life

  This <a href="http://codingdojo.org/kata/GameOfLife/">Kata</a> is about calculating the next generation of Conway’s game of life, given any starting position.
  See <a href="http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life">Wikipedia</a> for background.
	<p/>
 	<h5>Rules<h5>
	1.	Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.<br/>
	2.	Any live cell with more than three live neighbours dies, as if by overcrowding.<br/>
  3.	Any live cell with two or three live neighbours lives on to the next generation.<br/>
	4.	Any dead cell with exactly three live neighbours becomes a live cell.<br/>
	
	
  Scenario: a dead cell becomes alive
    Given the following generation
    		|X|0|1|2|3|4|5|6|7|
    		|0|-|-|-|-|-|-|-|-|
    		|1|-|-|-|-|o|-|-|-|
    		|2|-|-|-|o|o|-|-|-|
    		|3|-|-|-|-|-|-|-|-|
    When the next generation is calculated
    Then the new generation will be
    		|X|0|1|2|3|4|5|6|7|
    		|0|-|-|-|-|-|-|-|-|
    		|1|-|-|-|o|o|-|-|-|
    		|2|-|-|-|o|o|-|-|-|
    		|3|-|-|-|-|-|-|-|-|
