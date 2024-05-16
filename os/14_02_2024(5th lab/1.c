#include <stdio.h>
#include <stdlib.h>

struct Process {
    int processID;
    int arrivalTime;
    int burstTime;
    struct Process *next;
};

// FCFS Scheduling
void FCFS(struct Process *head) {
    struct Process *current = head;
    int currentTime = 0;

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

    printf("FCFS Scheduling:\n");
    FCFS(head);

    return 0;
}

