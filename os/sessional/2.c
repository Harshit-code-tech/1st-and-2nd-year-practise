#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>
#define MAX 3

int main() {
    pid_t child[MAX];
    int status;
    for (int i=0;i<MAX;i++) {
        pid_t pid = fork();
        if (pid < 0) {            
            perror("FAILED");
            exit(EXIT_FAILURE);
        } else if (pid == 0) {           
            printf("Child process %d with PID %d\n", i + 1, getpid());            
            exit(EXIT_SUCCESS);
        } else {            
            child[i] = pid;
        }
    } 
    for (int i = 0; i < MAX; ++i) {
        pid_t terpid = wait(&status);
        if (terpid > 0) {
            if (WIFEXITED(status)) {
                printf("Child process with PID %d exited with status %d\n", terpid, WEXITSTATUS(status));
            } else {
                printf("Child process with PID %d terminated abnormally\n", terpid);
            }
        } else {
            perror("wait");
        }
    }
    printf("All child processes have terminated.\n");
    return 0;
}
