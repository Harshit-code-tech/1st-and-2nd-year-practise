#include <stdio.h>
#include <stdlib.h>

struct Process {
    int processID;
    int arrivalTime;
    int burstTime;
    struct Process *next;
};

// SJF Scheduling
void SJF(struct Process *head) {
    struct Process *current = head;
    int currentTime = 0;

    // Sort processes based on burst time (shortest to longest)
    
    while (current != NULL) {
        struct Process *minBurst = current;
        struct Process *temp = current->next;

        while (temp != NULL) {
            if (temp->burstTime < minBurst->burstTime) {
                minBurst = temp;
            }
            temp = temp->next;
        }

        // Swap current and minBurst
        int tempBurst = current->burstTime;
        current->burstTime = minBurst->burstTime;
        minBurst->burstTime = tempBurst;

        current = current->next;
    }

    // Execute processes after sorting
    current = head;
    while (current != NULL) {
        printf("Process %d starts at time %d.\n", current->processID, currentTime);
        currentTime += current->burstTime;
        printf("Process %d finishes at time %d.\n", current->processID, currentTime);
        current = current->next;
    }
}

int main() {
    struct Process *head = NULL, *tail = NULL;

    // Create processes
    for (int i = 1; i <= 3; i++) {
        struct Process *newProcess = (struct Process *)malloc(sizeof(struct Process));
        newProcess->processID = i;
        newProcess->arrivalTime = 0;
        newProcess->burstTime = i * 10;
        newProcess->next = NULL;

        if (head == NULL) {
            head = tail = newProcess;
        } else {
            tail->next = newProcess;
            tail = newProcess;
        }
    }

    printf("\nSJF Scheduling:\n");
    SJF(head);

    return 0;
}

