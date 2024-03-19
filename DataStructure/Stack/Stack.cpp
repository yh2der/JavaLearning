#include <iostream>
const int MAX_SIZE = 5; // Maximum size of the stack

class Stack {
private:
    int arr[MAX_SIZE];
    int top;

public:
    Stack() {
        top = -1;
    } // Initialize top to -1 to indicate an empty stack

    bool isEmpty() {
        return (top == -1);
    }

    bool isFull() {
        return (top == MAX_SIZE - 1);
    }

    void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            std::cout << "Pushed element: " << element << " onto the stack.\n";
        } else {
            std::cout << "Stack is full. Cannot push element " << element << ".\n";
        }
    }

    void pop() {
        if (!isEmpty()) {
            int poppedElement = arr[top];
            top--;
            std::cout << "Popped element: " << poppedElement << " from the stack.\n";
        } else {
            std::cout << "Stack is empty. Cannot pop from an empty stack.\n";
        }
    }

    int topElement() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            std::cout << "Stack is empty.\n";
            return -1; // In this example, we consider -1 as an invalid value.
        }
    }
};
int main() {
    Stack myStack;
    // Push elements until the stack becomes full
    for (int i = 1; i <= 5; ++i) {
        myStack.push(i);
    }
    // Attempt to push more elements into the full stack
    myStack.push(6);
    // Pop all elements until the stack becomes empty
    while (!myStack.isEmpty()) {
        myStack.pop();
    }
    return 0;
}