Blackjack kata
--------------

This kata is for scoring a set of cards using blackjack rules, and returning both a total score of the cards given,
and a status of the game.

The score() method totals the cards given and returns a total score;

cards 2-10 are worth their value
Jack, King, Queen are worth 10

1) pass a single card to the score method and return the score

2) pass multiple cards to the score method and return the score

3) also return from result the string 'score', 'blackjack' (for 21), or 'bust' (over 21)

4) include Ace as a possibility, which returns either 1 or 11. Return both scores, and both results as arrays.

5) create a new 'Game' class, which contains a play() method. This method should take two sets of cards,
   'playerCards' and 'opponentCards', and return a string of 'you win' or 'you lose';