#include <stdio.h>
#include <time.h>
#include <limits.h> // Added for INT_MAX
#define MAX_PROCESSES 10

struct Process {
    int pid;
    int burst_time;
    int arrival_time;
    int priority;
    int remaining_time;
};

void fcfs(struct Process processes[], int n);
void sjf(struct Process processes[], int n);
void priority(struct Process processes[], int n);
void sjf_preemptive(struct Process processes[], int n); // Function prototype
void round_robin(struct Process processes[], int n, int quantum);

int main() {
    int n, quantum;
    struct Process processes[MAX_PROCESSES];

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter burst time for process %d: ", i + 1);
        scanf("%d", &processes[i].burst_time);
        processes[i].pid = i + 1;
        processes[i].remaining_time = processes[i].burst_time;

        printf("Enter arrival time for process %d: ", i + 1);
        scanf("%d", &processes[i].arrival_time);

        printf("Enter priority for process %d: ", i + 1);
        scanf("%d", &processes[i].priority);
    }

    printf("\nChoose a scheduling algorithm:\n");
    printf("1. FCFS\n");
    printf("2. SJF\n");
    printf("3. SJF_preemptive\n");
    printf("4. Priority Scheduling\n");
    printf("5. Round Robin\n");
    printf("Enter your choice: ");
    int choice;
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            fcfs(processes, n);
            break;
        case 2:
            sjf(processes, n);
            break;
        case 3:
            sjf_preemptive(processes, n); // Call to sjf_preemptive
            break;
        case 4:
            priority(processes, n);
            break;
        case 5:
            printf("Enter the time quantum: ");
            scanf("%d", &quantum);
            round_robin(processes, n, quantum);
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}

void fcfs(struct Process processes[], int n) {
    int waiting_time = 0;
    float avg_waiting_time;

    printf("\nFCFS Scheduling\n");
    printf("Process\tWaiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\n", processes[i].pid, waiting_time);
        waiting_time += processes[i].burst_time;
    }

    avg_waiting_time = (float)waiting_time / n;
    printf("Average Waiting Time: %.2f\n", avg_waiting_time);
}

void sjf(struct Process processes[], int n) {
    // Sort processes based on burst time (ascending order)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].burst_time > processes[j + 1].burst_time) {
                struct Process temp = processes[j];
                processes[j] = processes[j + 1];
                processes[j + 1] = temp;
            }
        }
    }

    int total_waiting_time = 0;
    int current_time = 0;

    printf("\nSJF Scheduling (Non-preemptive)\n");
    printf("Process\tWaiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\n", processes[i].pid, current_time);
        total_waiting_time += current_time;
        current_time += processes[i].burst_time;
    }

    float avg_waiting_time = (float)total_waiting_time / n;
    printf("Average Waiting Time: %.2f\n", avg_waiting_time);
}

void priority(struct Process processes[], int n) {
    // Sort processes based on priority (ascending order)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].priority > processes[j + 1].priority) {
                struct Process temp = processes[j];
                processes[j] = processes[j + 1];
                processes[j + 1] = temp;
            }
        }
    }

    int waiting_time = 0;
    float avg_waiting_time;

    printf("\nPriority Scheduling\n");
    printf("Process\tWaiting Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\n", processes[i].pid, waiting_time);
        waiting_time += processes[i].burst_time;
    }

    avg_waiting_time = (float)waiting_time / n;
    printf("Average Waiting Time: %.2f\n", avg_waiting_time);
}

void sjf_preemptive(struct Process processes[], int n) {
    int total_waiting_time = 0;
    int total_turnaround_time = 0;
    int completed = 0;
    int current_time = 0;

    printf("\nSJF Scheduling (Preemptive)\n");
    printf("Process\tTurnaround Time\tWaiting Time\n");

    while (completed < n) {
        int shortest_job = -1;
        int shortest_burst = INT_MAX;

        for (int i = 0; i < n; i++) {
            if (processes[i].arrival_time <= current_time && processes[i].remaining_time > 0) {
                if (processes[i].remaining_time < shortest_burst) {
                    shortest_burst = processes[i].remaining_time;
                    shortest_job = i;
                }
            }
        }

        if (shortest_job == -1) {
            current_time++;
            continue;
        }

        processes[shortest_job].remaining_time--;

        if (processes[shortest_job].remaining_time == 0) {
            completed++;
            int turnaround_time = current_time - processes[shortest_job].arrival_time + 1;
            total_turnaround_time += turnaround_time;
            int waiting_time = turnaround_time - processes[shortest_job].burst_time;
            total_waiting_time += waiting_time;
            printf("%d\t%d\t\t%d\n", processes[shortest_job].pid, turnaround_time, waiting_time);
        }

        current_time++;
    }

    float avg_waiting_time = (float)total_waiting_time / n;
    float avg_turnaround_time = (float)total_turnaround_time / n;
    printf("Average Waiting Time: %.2f\n", avg_waiting_time);
    printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);
}

void round_robin(struct Process processes[], int n, int quantum) {
    int remaining_time[MAX_PROCESSES];
    int time = 0;
    int total_waiting_time = 0;
    int total_turnaround_time = 0;

    for (int i = 0; i < n; i++) {
        remaining_time[i] = processes[i].burst_time;
    }

    printf("\nRound Robin Scheduling (Quantum = %d)\n", quantum);
    printf("Process\tTurnaround Time\tWaiting Time\n");
    while (1) {
        int done = 1;
        for (int i = 0; i < n; i++) {
            if (remaining_time[i] > 0) {
                done = 0;
                if (remaining_time[i] > quantum) {
                    time += quantum;
                    remaining_time[i] -= quantum;
                } else {
                    time += remaining_time[i];
                    total_waiting_time += time - processes[i].burst_time - processes[i].arrival_time;
                    total_turnaround_time += time - processes[i].arrival_time;
                    remaining_time[i] = 0;
                }
            }
        }
        if (done == 1)
            break;
    }

    float avg_waiting_time = (float)total_waiting_time / n;
    float avg_turnaround_time = (float)total_turnaround_time / n;
    printf("Average Waiting Time: %.2f\n", avg_waiting_time);
    printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);
}

