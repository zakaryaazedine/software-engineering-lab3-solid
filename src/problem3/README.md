# Problem 3 - Written answers

## Question 1

The ordinary account becomes 490 MAD. FixedTermAccount throws UnsupportedOperationException and stays at 1000 MAD.

## Question 2

Yes, it is a bank account in the real world. No, it is not a valid substitute for this Account class, because it refuses withdrawals that the parent accepts.

## Question 3

- Preconditions are the caller's responsibility: the conditions needed before calling a method. Yes, the subclass rejects the withdrawal even when there is enough money.
- Postconditions are the method's responsibility: the result promised after a successful call. There is no successful return here; the method throws an exception.
- Invariants are rules that the class must keep true. No violation is shown because the balance stays unchanged.
- Exceptions must follow the parent's contract. Yes, withdrawing 10 MAD from 1000 MAD now throws an unexpected UnsupportedOperationException.

The main violations are stronger effective preconditions and unexpected exceptions.

## Question 4

Open/Closed Principle. A new account type can require another instanceof check, forcing changes to Bank.

## Question 7

No. StudentAccount adds the caller requirement amount <= 200. With 500 MAD, CurrentAccount accepts a 250 MAD withdrawal but StudentAccount rejects it.

I would use composition and give the limited withdrawal operation its own contract. The student account would not inherit a promise to accept every withdrawal allowed by CurrentAccount.
