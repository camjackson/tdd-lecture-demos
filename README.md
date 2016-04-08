# TDD Lecture Demos

Coding demos to teach TDD, stubbing, and mocking

## TODO:
  * Remove the tests for demo 1

## DEMO 1: Unit testing (Divider)
  * Pre-written implementation of `int divide(int, int)`
  * Wrap some tests around it - 6/2=3, 5/1=5, 7/7=1, 8/7=1, 7/8=0, 1/2=0
  * A bit contrived, but now have confidence that it works
  * Also get some documentation for free!

## DEMO 2: Test-first (Divider)
  * Just delete the implementation and show all failing tests
  * Now just do whatever we can to make the tests pass


## DEMO 3: TDD (Fizzbuzz)
  * 1 -> "1"          "1"
  * 2 -> "2"          Integer.toString(i)
  * 3 -> "Fizz"       if (i == 3)
  * @Setup
  * 24 -> "Fizz"      if (i % 3 == 0)
  * Delete 3
  * 20 -> "Buzz"      if (i % 5 == 0)
  * 45 -> "Fizzbuzz"  if ( && )
  * startsWith()      Bugs: start from 0, and trailing space.
  * main()


## Demo 4: Dependency injection & manual stubbing
  * Show CatPicture class
  * Show CatPictureService class
  * itGives1PointForEachCatInThePicture: (3, false, false) -> 3
  * itGivesAZeroRatingWhenTheServiceFailsToGetTheImage: (null) -> 0


## Demo 5: Stubbing using a framework
  * Foo foo = mock(Foo.class);
  * when(foo.bar("baz")).thenReturn("qux");

  * itGivesAZeroRatingWhenTheServiceFailsToGetTheImage: (null) -> 0
  * itGives1PointForEachCatInThePicture: (3, false, false) -> 3
  * itAdds5PointsWhenThereIsAKitten: (2, false, true) -> 7
  * itGivesDoublePointsForCatsInCostumes: (2, true, false) -> 4       (Make it double everything)
  * itDoesNotDoubleTheKittenBonus: (3, true, true) -> 11              (Should get 16 at first)
  * Try to do (0, false, true) -> ArgException


## Demo 6: Using mocks to verify behaviour
  * Write 'tracker' classes
  * itSubmitsAHighScoreWhenTheScoreIsOver10: 20 cats
  * itDoesNotSubmitaAHighScoreWhenTheScoreIsOver10: 5 cats


## Demo 7: Mocking with Mockito
  * Foo foo = mock(Foo.class)
  * verify(foo).bar("baz");
  * verify(foo, never()).bar(anyString);

  * itSubmitsAHighScoreWhenTheScoreIsOver10: 20 cats
  * itDoesNotSubmitaAHighScoreWhenTheScoreIsOver10: 5 cats
