#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

#define NUM_CHILDREN 5

int main() {
    pid_t childPids[NUM_CHILDREN];
    int status;

    
    for (int i = 0; i < NUM_CHILDREN; ++i) {
        pid_t pid = fork();

        if (pid < 0) {
            // Error occurred
            perror("fork");
            exit(EXIT_FAILURE);
        } else if (pid == 0) {
            // Child process
            printf("Child process %d with PID %d\n", i + 1, getpid());
            sleep(1); // Simulating some work in child process
            exit(EXIT_SUCCESS);
        } else {
            // Parent process
            childPids[i] = pid;
        }
    }

    // Parent process waits for all children
    for (int i = 0; i < NUM_CHILDREN; ++i) {
        pid_t terminatedPid = wait(&status);
        if (terminatedPid > 0) {
            if (WIFEXITED(status)) {// Check if child process exist or not
                printf("Child process with PID %d exited with status %d\n", terminatedPid, WEXITSTATUS(status));// If false, it willterminate child process and print it's msg
            } else {
                printf("Child process with PID %d terminated abnormally\n", terminatedPid);
            }
        } else {
            perror("wait");
        }
    }

    printf("All child processes have terminated.\n");

    return 0;
}
