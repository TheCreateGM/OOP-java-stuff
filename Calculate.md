# Java Program: Customer Item Calculator with Discounts

This Java program simulates a basic point-of-sale system. It takes user input for the number of customers and items, collects prices for each item per customer, calculates the total cost, and applies a discount if applicable.

---

### Features

- Input handling using Java `Scanner`
- Input validation with try-catch blocks
- 2D arrays to store prices for multiple customers
- Total calculation
- Conditional discount (10% if total >= \$50)

---

### How It Works

1. **Program Starts**:

   - The `main` method initializes an instance of the `calculate` class.
   - Calls `inputstuff()` to collect initial inputs.

2. **Input Collection**:

   - The `inputstuff()` method asks for:
     - Number of customers
     - Number of items
   - If input is invalid, it catches the exception and recalls itself.

3. **Invoice Generation**:

   - The `invoice()` method asks for item prices for each customer.
   - It stores the prices in a 2D array `priceitem[numCustomer][numItems]`.
   - The method calculates the total amount.
   - If the total is \$50 or more, a 10% discount is applied.

4. **Output**:

   - Total amount before discount
   - Discount amount (if applicable)
   - Total amount after discount

---

### Example Output

```
Enter number of customers:
2
Enter number of items:
2

Customer 1:
Enter price for item 1: $
10
Enter price for item 2: $
20

Customer 2:
Enter price for item 1: $
15
Enter price for item 2: $
10

Total: $55.0
Discount applied: $5.5
Total after discount: $49.5
```

---

### Notes

- Input validation ensures that only numeric entries are accepted.
- Recursive calls are used to re-prompt input in case of invalid entries.
- Discounts only apply if the grand total is \$50 or more.

---

### To Run the Code

1. Save the file as `calculate.java`
2. Compile the program:
   ```bash
   javac calculate.java
   ```
3. Run the compiled class:
   ```bash
   java calculate
   ```

