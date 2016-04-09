# TDD Lecture Demos

Coding demos to teach TDD, stubbing, and mocking

## DEMO 1: Unit testing (Divider)
  * Pre-written implementation of `int divide(int, int)`
  * Wrap some tests around it - 6/2=3, 5/1=5, 7/7=1, 8/7=1, 7/8=0, 1/2=0, 1/0=0
  * A bit contrived, but now have confidence that it works
  * Also get some documentation for free!

## DEMO 2: Test-first (Divider)
  * Just delete the implementation and show all failing tests
  * Now just do whatever we can to make the tests pass
  * Start with silly attempts, then concede that we need the actual implementation



## DEMO 3: TDD (Fizzbuzz)
  * 1 -> "1"          "1"
  * 2 -> "2"          Integer.toString(i)
  * 3 -> "Fizz"       if (i == 3)
  * 24 -> "Fizz"      if (i % 3 == 0)
  * Delete 3
  * 20 -> "Buzz"      if (i % 5 == 0)
  * 45 -> "Fizzbuzz"  if ( && )
  * startsWith()      Bugs: start from 0, and trailing space.
  * main()

This demo can be reproduced step by step:

For step 1: `git checkout tags/demo3-step-1`

...


For step 10: `git checkout tags/demo3-step-10`


## Demo 4: Manual stubbing
  * Show AssignmentMarker class
  * Already some code here (explain plagiarism code)
  * First problem - there are no tests on that logic (let's ignore this for now and come back later)
  * Second problem - we want to add more logic (isTotallyCorrect / isHalfCorrect), but plagiarism bit is in the way

  * How can we get it out of the way? `class NeverPlagiarisedService extends PlagiarismService`
  * itScores5WhenNotPlagiarisedAndHalfCorrect
  * itScores10WhenNotPlagiarisedAndTotallyCorrect

  * Now we can come back and test the plagiarism bit - `class AlwaysPlagiarisedService extends PlagiarismService`
  * itScores0WhenPlagiarised


## Demo 5: Manual mocking
  * Inject a StudentEmailService and call it at the end
  * Point out how problematic it is for all of our tests
  * First want to just remove the side-effect:  `class FakeStudentEmailService extends StudentEmailService`

  * Now we want to assert that the side effect happened
  * Make the Fake a Mock, and track the arguments
  * It passes the assignment and mark to the email service
