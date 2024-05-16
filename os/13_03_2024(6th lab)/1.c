#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    pid_t child_pid = fork();

    if (child_pid == -1) {
        perror("fork failed");
        return 1;
    }

    if (child_pid == 0) {
        pid_t grandchild_pid = fork();

        if (grandchild_pid == -1) {
            perror("fork failed");
            return 1;
        }

        if (grandchild_pid == 0) {
            
            printf("I am the grandchild process with PID: %d\n", getpid());
        } else {
            
            printf("I am the child process with PID: %d\n", getpid());
        }
    } else {
       
        printf("I am the parent process with PID: %d\n", getpid());
    }

    return 0;
}
