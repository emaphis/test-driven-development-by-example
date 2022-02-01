# TODO List of items to work on.

## Requirements

* We need to be able to add amounts in two different currencies and convert
the result given a set of exchange rates. 

* We need to be able to multiply an amount (price per share) by a number
(number of shares) and receive an amount

## Items

[ ] $5 + 10 CHF = $10 if rate is 2:1

[x] $5 * 2 = $10

[x] Make "amount" private

[x] Dollar side-effects?

[ ] Money rounding?

[x] Equals - implies hashcode, object testing

  [ ] hashCode()

  [ ] Equal null

  [ ] Equal object

[x] 5 CHF * 2 = 10 CHF - Francs

  [ ] Dollar/Franc duplication

    [x] Common equals

    [x] Common times

[x] Compare Francs with Dollars

[x] Currency?

[x] Delete testFrancMultiplication?
